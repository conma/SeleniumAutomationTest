package selene;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.ExitCode;
import model.Master;
import model.Testcase;
import model.TestcaseStatus;
import service.testcasefile.TestcaseFileService;

@Component
public class SELENE {
    private static final String HYPHEN = "-";

    private static WebDriver driver;

    private static String scriptFolderPath;

    private static Master master;

    private static List<Testcase> testcases;

    @Autowired
    private TestcaseFileService testcaseFileService;

    public void run( String testcaseFilePath ) {
        try {
            File scriptFolder = new File( scriptFolderPath );
            for ( Testcase testcase : testcases ) {
                try {
                    ANTLRInputStream input = new ANTLRInputStream( new FileInputStream( scriptFolder + "/" + testcase.getScriptFileName() ) );
                    SELENELexer lexer = new SELENELexer( input );
                    SELENEParser parser = new SELENEParser( new CommonTokenStream( lexer ) );
                    parser.addParseListener( new SELENEListenterImpl( driver, testcase ) );
                    parser.program();
                } catch ( IOException e ) {
                    testcase.setTestcaseStatus( TestcaseStatus.ERROR );
                    testcase.setNote( testcase.getNote() + e.getMessage().split( "\n" )[0] + "\n" );
                    continue;
                } catch ( Exception e ) {
                    testcase.setTestcaseStatus( TestcaseStatus.ERROR );
                    testcase.setNote( testcase.getNote() + e.getMessage().split( "\n" )[0] + "\n" );
                    continue;
                } finally {
                    System.out.println( testcase.getId() + " " + testcase.getTestcaseStatus().getName() );
                }
            }
            testcaseFileService.updateTestcaseIdResult( testcaseFilePath, master, testcases );
        } catch ( EncryptedDocumentException e ) {
            System.out.println( "File " + testcaseFilePath + " is encrypted!" );
            printErrorCodeAndExit( ExitCode.TESTCASE_FILE_ENCRYPTED );
        } catch ( FileNotFoundException e ) {
            System.out.println( e.getMessage().split( "\n" )[0] );
            printErrorCodeAndExit( ExitCode.TESTCASE_FILE_IN_USE );
        } catch ( Exception e ) {
            System.out.println( "UNKNOWN Error when SELENE is executing!" );
            printErrorCodeAndExit( ExitCode.UNKNOWN_SELENE_ERROR );
        }
    }

    public void init( String testcaseFilePath, String browserType, String driverFilePath, String scriptFolderPath ) {
        initMaster( testcaseFilePath );
        initTestcaseList( testcaseFilePath );
        prototype( browserType, driverFilePath, scriptFolderPath );
    }

    private void initMaster( String testcaseFilePath ) {
        try {
            master = testcaseFileService.readMaster( testcaseFilePath );
        } catch ( IOException e ) {
            e.printStackTrace();
        } catch ( EncryptedDocumentException e ) {
            System.out.println( "File " + testcaseFilePath + " is encrypted!" );
            printErrorCodeAndExit( ExitCode.TESTCASE_FILE_ENCRYPTED );
        }
    }

    private void initTestcaseList( String testcaseFilePath ) {
        try {
            testcases = testcaseFileService.initTestcaseList( testcaseFilePath, master );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private void prototype( String browserType, String driverFilePath, String scriptFolderPath ) {
        String driverType = browserType;
        SELENE.scriptFolderPath = scriptFolderPath;
        try {
            if ( driverType.equalsIgnoreCase( "firefox" ) || driverType.equalsIgnoreCase( "ff" ) ) {
                System.setProperty( "webdriver.gecko.driver", driverFilePath );
                driver = new FirefoxDriver();
                //JQueryUtils.injectJQuery( driver );
            } else if ( driverType.equalsIgnoreCase( "internetexplorer" ) || driverType.equalsIgnoreCase( "ie" ) ) {
                System.setProperty( "webdriver.ie.driver", driverFilePath );
                System.setProperty( "webdriver.ie.driver.host", "127.0.0.1" );
                driver = new InternetExplorerDriver();
                //JQueryUtils.injectJQuery( driver );
                // System.setProperty( "webdriver.ie.driver.loglevel", "INFO" );
                // System.setProperty( "webdriver.ie.driver.logfile", "D:/var/log/ie-selenium.log" );
            } else if ( driverType.equalsIgnoreCase( "googlechrome" ) || driverType.equalsIgnoreCase( "chrome" ) ) {
                System.setProperty( "webdriver.chrome.driver", driverFilePath );
                driver = new ChromeDriver();
                //JQueryUtils.injectJQuery( driver );
            } else {
                System.out.println(
                        "Wrong browser name. Only accept: ff | firefox | chrome | googlechrome | ie | internetexplorer" + " but found: " + browserType );
                printErrorCodeAndExit( ExitCode.WRONG_BROWSER_NAME );
            }
        } catch ( IllegalStateException illegalStateException ) {
            System.out.println( "Driver file path not found at: " + driverFilePath );
            printErrorCodeAndExit( ExitCode.DRIVER_NOT_FOUND );
        } catch ( SessionNotCreatedException sessionNotCreatedException ) {
            System.out.println( "BrowserType and Driver not matched\n" + "Browser: " + browserType + " but found " + driverFilePath );
            printErrorCodeAndExit( ExitCode.BROWSER_AND_DRIVER_NOT_MATCH );
        }
    }

    private void printErrorCodeAndExit( int errorCode ) {
        System.out.println( "Error code: " + errorCode );
        System.exit( errorCode );
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getScriptFolderPath() {
        return scriptFolderPath;
    }
}
