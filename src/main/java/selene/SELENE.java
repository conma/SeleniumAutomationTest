package selene;

import java.io.File;
import java.io.FileInputStream;
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

import model.ErrorCode;
import model.Master;
import model.Testcase;
import model.TestcaseStatus;
import service.testcasefile.TestcaseFileService;

/*
 * args[0]: Loại trình duyệt 
 *      ff      | firefox
 *      ie      | internetexplorer
 *      chrome  | googlechrome
 * args[1]: Đường dẫn tới file driver tương ứng
 *       D:/driver/geckodriver.exe (geckodriver.exe dành cho ff)
 * args[2]: Đường dẫn tới folder chứa script chạy
 *      D:/scripts
 */

@SuppressWarnings( "deprecation" )
@Component
public class SELENE
{
    private static WebDriver driver;

    private static String scriptFolderPath;

    private static Master master;

    private static List<Testcase> testcases;

    @Autowired
    private TestcaseFileService testcaseFileService;

    public void run( String testcaseFilePath )
    {
        testcases = new ArrayList<Testcase>();

        try
        {
            master = testcaseFileService.readMaster( testcaseFilePath );
            File scriptFolder = new File( scriptFolderPath );
            String[] scriptFileNames = scriptFolder.list();
            for ( String scriptFileName : scriptFileNames )
            {
                Testcase testcase = new Testcase( scriptFileName );
                try
                {
                    ANTLRInputStream input = new ANTLRInputStream( new FileInputStream( scriptFolder + "/" + scriptFileName ) );
                    SELENELexer lexer = new SELENELexer( input );
                    SELENEParser parser = new SELENEParser( new CommonTokenStream( lexer ) );
                    parser.addParseListener( new SELENEListenterImpl( driver, testcase ) );
                    parser.program();
                }
                catch ( IOException e )
                {
                    testcase.setTestcaseStatus( TestcaseStatus.ERROR );
                    testcase.setNote( testcase.getNote() + e.getMessage().split( "\n" )[0] + "\n" );
                    continue;
                }
                catch ( Exception e )
                {
                    testcase.setTestcaseStatus( TestcaseStatus.ERROR );
                    testcase.setNote( testcase.getNote() + e.getMessage().split( "\n" )[0] + "\n" );
                    continue;
                }
                finally
                {
                    testcases.add( testcase );
                    System.out.println( testcase.getId() + " " + testcase.getTestcaseStatus().getName() );
                }
            }
            testcaseFileService.updateTestcaseIdResult( testcaseFilePath, master, testcases );
        }
        catch ( EncryptedDocumentException e )
        {
            System.out.println( "File " + testcaseFilePath + " is encrypted!" );
            System.out.println( "Error code: " + ErrorCode.TESTCASE_FILE_ENCRYPTED );
            System.exit( ErrorCode.TESTCASE_FILE_ENCRYPTED );
        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void init( String browserType, String driverFilePath, String scriptFolderPath )
    {
        String driverType = browserType;
        SELENE.scriptFolderPath = scriptFolderPath;
        try
        {
            if ( driverType.equalsIgnoreCase( "firefox" ) || driverType.equalsIgnoreCase( "ff" ) )
            {
                System.setProperty( "webdriver.gecko.driver", driverFilePath );
                driver = new FirefoxDriver();
            }
            else if ( driverType.equalsIgnoreCase( "internetexplorer" ) || driverType.equalsIgnoreCase( "ie" ) )
            {
                System.setProperty( "webdriver.ie.driver", driverFilePath );
                System.setProperty( "webdriver.ie.driver.host", "127.0.0.1" );
                driver = new InternetExplorerDriver();
                // System.setProperty( "webdriver.ie.driver.loglevel", "INFO" );
                // System.setProperty( "webdriver.ie.driver.logfile", "D:/var/log/ie-selenium.log" );
            }
            else if ( driverType.equalsIgnoreCase( "googlechrome" ) || driverType.equalsIgnoreCase( "chrome" ) )
            {
                System.setProperty( "webdriver.chrome.driver", driverFilePath );
                driver = new ChromeDriver();
            }
            else
            {
                System.out.println(
                        "Wrong browser name. Only accept: ff | firefox | chrome | googlechrome | ie | internetexplorer" + " but found: " + browserType );
                System.out.println( "Error code: " + ErrorCode.WRONG_BROWSER_NAME );
                System.exit( ErrorCode.WRONG_BROWSER_NAME );
            }
        }
        catch ( IllegalStateException illegalStateException )
        {
            System.out.println( "Driver file path not found at: " + driverFilePath );
            System.out.println( "Error code: " + ErrorCode.DRIVER_NOT_FOUND );
            System.exit( ErrorCode.DRIVER_NOT_FOUND );
        }
        catch ( SessionNotCreatedException sessionNotCreatedException )
        {
            System.out.println( "BrowserType and Driver not matched\n" + "Browser: " + browserType + " but found " + driverFilePath );
            System.out.println( "Error code: " + ErrorCode.BROWSER_AND_DRIVER_NOT_MATCH );
            System.exit( ErrorCode.BROWSER_AND_DRIVER_NOT_MATCH );

        }
    }
}
