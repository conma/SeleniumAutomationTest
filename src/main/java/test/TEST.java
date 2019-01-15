package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TEST
{
    public static void main( String[] args )
    {
        new TEST().run();
    }

    private void run()
    {
        File scriptFileName = new File( "src/main/java/test/TEST.txt" );
        try
        {
            ANTLRInputStream input = new ANTLRInputStream( new FileInputStream( scriptFileName ) );
            TESTLexer lexer = new TESTLexer( input );
            TESTParser parser = new TESTParser( new CommonTokenStream( lexer ) );
            parser.addParseListener( new TESTListenerImple( ) );
            parser.program();
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }

    }
}
