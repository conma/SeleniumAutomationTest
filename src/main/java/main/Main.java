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
import service.ScriptGeneratorService;
import spring.config.AppConfiguration;

public class Main
{
    private static ApplicationContext context;

    private Options options;

    private CommandLineParser parser;

    private HelpFormatter formatter;

    private CommandLine cmd;

    private String testcaseFilePath;

    private String scriptFolderPath;

    private String browserType;

    private String driverDriverFilePath;

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

    private void run(String[] args)
    {
        options = new Options();
        parser = new DefaultParser();
        formatter = new HelpFormatter();
        addOptions(options, args);

        try {
            cmd = parser.parse(options, args);
            if (cmd.hasOption("g")) {
                if (cmd.hasOption( "f" )) {
                    testcaseFilePath = cmd.getOptionValue( "f" );
                }
                if(cmd.hasOption( "F" )) {
                    scriptFolderPath = cmd.getOptionValue( "F" );
                }
                try
                {
                    scriptGeneratorService.generateScriptFiles( testcaseFilePath, scriptFolderPath );
                    System.out.println("Generated script files in " + scriptFolderPath + " from " + testcaseFilePath);
                }
                catch ( EncryptedDocumentException | IOException e )
                {
                    // TODO Xử lý khi có lỗi
                    e.printStackTrace();
                }
            }
            if (!cmd.hasOption( "g" ) && cmd.hasOption("x")) {
                if(cmd.hasOption( "F" )) {
                    scriptFolderPath = cmd.getOptionValue( "F" );
                }
                if(cmd.hasOption( "b" )) {
                    browserType = cmd.getOptionValue( "b" );
                }
                if(cmd.hasOption( "d" )) {
                    driverDriverFilePath = cmd.getOptionValue( "d" );
                }
                selene.init( args );
                System.out.println("Executing scripts in folder " + scriptFolderPath);
                System.out.println( "\tBrowser type: " + browserType);
                System.out.println( "\tDriver file: " + driverDriverFilePath);
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("SeleniumAutomationTest", options);
            System.exit(1);
        }
    }

    private void addOptions( Options options, String[] args )
    {
        Option generateOption = new Option( "g", "generate-script-files", false,
                "Generate Test script files from testcases file into folder\n"
                        + "Optional: -f | --file <testcase_file.xls> -F | --Folder <output folder of Test script files>"
                        + "Default: -f Testcases.xls -F scripts" + "Example: -f Testcases.xls -F scripts" );
        generateOption.setRequired( false );
        options.addOption( generateOption );

        Option executeOption = new Option( "x", "execute-test", false,
                "Execute the test.\n" + "Optional:" + "\t-b | --browser <chrome | googlechrome | firefox | ff | ie | internetexplorer>"
                        + "\t-d | --driver-path <path/to/driver file>" + "\t-F | --Folder <path/to/script_file/folder>"
                        + "\t-f | -- file <path/to/testcase_file.xls>" );
        executeOption.setRequired( false );
        options.addOption( executeOption );

        Option fileOption = new Option( "f", "file", true, "" );
        fileOption.setRequired( false );
        options.addOption( fileOption );

        Option folderOption = new Option( "F", "Folder", true, "" );
        folderOption.setRequired( false );
        options.addOption( folderOption );

        Option browserOption = new Option( "b", "browser", true, "" );
        browserOption.setRequired( false );
        options.addOption( browserOption );

        Option driverOption = new Option( "d", "driver-path", true, "" );
        driverOption.setRequired( false );
        options.addOption( driverOption );
    }
}
