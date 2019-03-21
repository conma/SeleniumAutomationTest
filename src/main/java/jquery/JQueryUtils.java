package jquery;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JQueryUtils
{
    private static String JQUERY_FILE = "src/main/java/jquery/jquery-script.txt";

    public static String readFile( String file )
    {
        try
        {
            Charset cs = Charset.forName( "UTF-8" );
            FileInputStream stream = new FileInputStream( file );
            Reader reader = new BufferedReader( new InputStreamReader( stream, cs ) );
            StringBuilder builder = new StringBuilder();
            char[] buffer = new char[8192];
            int read;
            while ( ( read = reader.read( buffer, 0, buffer.length ) ) > 0 )
            {
                builder.append( buffer, 0, read );
            }
            stream.close();
            return builder.toString();
        }
        catch ( IOException e )
        {
            return "";
        }
    }

    public static void injectJQuery( WebDriver driver )
    {
        String jQueryLoader;
        jQueryLoader = JQueryUtils.readFile( JQUERY_FILE );
        driver.manage().timeouts().setScriptTimeout( 10, TimeUnit.SECONDS );
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript( jQueryLoader );
    }
}
