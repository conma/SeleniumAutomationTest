package main;

import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.poi.EncryptedDocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import selene.SELENE;
import service.scriptgenerator.ScriptGeneratorService;
import spring.config.AppConfiguration;

public class Main
{
    private final String DEFAULT_TESTCASE_FILE_PATH = "Testcase.xls";

    private final String DEFAULT_SCRIPT_FOLDER_PATH = "script";

    private final String DEFAULT_BROWSER_TYPE = "chrome";

    private final String DEFAULT_DRIVER_FILE_PATH = "chromedriver.exe";

    private static ApplicationContext context;

    private Options options;

    private CommandLineParser parser;

    private HelpFormatter formatter;

    private CommandLine cmd;

    private String testcaseFilePath = DEFAULT_TESTCASE_FILE_PATH;

    private String scriptFolderPath = DEFAULT_SCRIPT_FOLDER_PATH;

    private String browserType = DEFAULT_BROWSER_TYPE;

    private String driverFilePath = DEFAULT_DRIVER_FILE_PATH;

    @Autowired
    private SELENE selene;

    @Autowired
    private ScriptGeneratorService scriptGeneratorService;

    public static void main( String[] args )
    {
        context = new AnnotationConfigApplicationContext( AppConfiguration.class );
        Main mainApp = (Main) context.getBean( "main" );
        mainApp.run( args );
    }

    private void run( String[] args )
    {
        options = new Options();
        parser = new DefaultParser();
        formatter = new HelpFormatter();
        formatter.setOptionComparator( null );
        addOptions( options, args );

        try
        {
            cmd = parser.parse( options, args );
            if ( cmd.hasOption( "g" ) )
            {
                if ( cmd.hasOption( "f" ) )
                {
                    testcaseFilePath = cmd.getOptionValue( "f" );
                }
                if ( cmd.hasOption( "F" ) )
                {
                    scriptFolderPath = cmd.getOptionValue( "F" );
                }
                generateScriptFile();
            }

            if ( cmd.hasOption( "x" ) )
            {
                if ( cmd.hasOption( "F" ) )
                {
                    scriptFolderPath = cmd.getOptionValue( "F" );
                }
                if ( cmd.hasOption( "b" ) )
                {
                    browserType = cmd.getOptionValue( "b" );
                }
                if ( cmd.hasOption( "d" ) )
                {
                    driverFilePath = cmd.getOptionValue( "d" );
                }
                executeAutoTest();
            }
        }
        catch ( ParseException e )
        {
            System.out.println( e.getMessage() );
            formatter.printHelp( "SeleniumAutomationTest", options );
            System.out.println( "Example:\n" + "java -jar SeleneiumAutomationTest.jar -g -x -f Testcase.xls -F script -b chrome -d driver/chromedriver.exe\n"
                    + "java -jar SeleneiumAutomationTest.jar -g -x to generate and execute with default parameters\n"
                    + "java -jar SeleneiumAutomationTest.jar -g -F script to generate script files only\n"
                    + "java -jar SeleneiumAutomationTest.jar -x script to execute" );
            System.exit( 1 );
        }
    }

    private void addOptions( Options options, String[] args )
    {
        Option generateOption = new Option( "g", "generate-script-files", false,
                "Generate Test script files from testcases file into folder\n"
                        + "Optional: -f | --file <testcase_file.xls> -F | --Folder <output folder of Test script files>" + "Default: -f Testcase.xls -F script"
                        + "Example: -f Testcases.xls -F script" );
        generateOption.setRequired( false );
        options.addOption( generateOption );

        Option executeOption = new Option( "x", "execute-test", false,
                "Execute the test.\n" + "Optional:" + "\t-b | --browser <chrome | googlechrome | firefox | ff | ie | internetexplorer>"
                        + "\t-d | --driver-path <path/to/driver file>" + "\t-F | --Folder <path/to/script_file/folder>"
                        + "\t-f | -- file <path/to/testcase_file.xls>" );
        executeOption.setRequired( false );
        options.addOption( executeOption );

        Option fileOption = new Option( "f", "file", true, "path/to/testcase_file.\nDefault: Testcase.xls" );
        fileOption.setRequired( false );
        options.addOption( fileOption );

        Option folderOption = new Option( "F", "Folder", true, "path/to/folder that contains scipt files\n" + "Default: script" );
        folderOption.setRequired( false );
        options.addOption( folderOption );

        Option browserOption = new Option( "b", "browser", true,
                "browser type.\n" + "Accept: chrome | googlechrome | ie | internetexplorer | ff | firefox\n" + "Default: chrome" );
        browserOption.setRequired( false );
        options.addOption( browserOption );

        Option driverOption = new Option( "d", "driver-path", true, "path/to/driver/file.\n" + "Default: driver/chromedriver.exe" );
        driverOption.setRequired( false );
        options.addOption( driverOption );
    }

    private void generateScriptFile()
    {
        scriptGeneratorService.generateScriptFiles( testcaseFilePath, scriptFolderPath );
        System.out.println( "Generated script files in " + scriptFolderPath + " from " + testcaseFilePath );
    }

    private void executeAutoTest()
    {
        System.out.println( "Executing the auto test" );
        selene.init( browserType, driverFilePath, scriptFolderPath );
        selene.run();
        System.out.println( "Executing scripts in folder " + scriptFolderPath );
        System.out.println( "\tBrowser type: " + browserType );
        System.out.println( "\tDriver file: " + driverFilePath );
    }

}
