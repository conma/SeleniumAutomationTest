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

import spring.config.AppConfiguration;

public class Main
{
    private static ApplicationContext context;

    public static void main( String[] args )
    {
        context = new AnnotationConfigApplicationContext( AppConfiguration.class );
        Main mainApp = (Main) context.getBean( "main" );
        mainApp.run( args );
        Options options = new Options();

        Option generateOption = new Option("g", "generate-script-files", true, "Generate Test script files from testcases file into folder\n"
                + "Optional: -f | --file <testcase_file.xls> -F | --Folder <output folder of Test script files>"
                + "Default: -f Testcases.xls -F scripts"
                + "Example: -f Testcases.xls -F scripts");
        generateOption.setRequired(true);
        options.addOption(generateOption);

        Option executeOption = new Option("x", "execute-test", true, "Execute the test.\n"
                + "Optional:"
                + "\t-b | --browser <chrome | googlechrome | firefox | ff | ie | internetexplorer>"
                + "\t-d | --driver-path <path/to/driver file>"
                + "\t-F | --Folder <path/to/script_file/folder>"
                + "\t-f | -- file <path/to/testcase_file.xls>");
        executeOption.setRequired(true);
        options.addOption(executeOption);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("SeleniumAutomationTest", options);

            System.exit(1);
        }

        String inputFilePath = cmd.getOptionValue("generate-script-files");
        String outputFilePath = cmd.getOptionValue("execute-test");

        System.out.println(inputFilePath);
        System.out.println(outputFilePath);
    }

    private void run(String[] args)
    {
        for (int i = 0; i<args.length; i++ )
            System.out.println( i + ": " + args[i] );
    }
}
