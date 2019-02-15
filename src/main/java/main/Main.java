package main;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
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
                System.out.println("--generate");
                if (cmd.hasOption( "f" )) {
                    System.out.println( "--file: " + cmd.getOptionValue( "f" ) );
                }
                if(cmd.hasOption( "F" )) {
                    System.out.println( "--Folder: " + cmd.getOptionValue( "F" ) );
                }
            }
            if (cmd.hasOption("x")) {
                System.out.println("execute");
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
