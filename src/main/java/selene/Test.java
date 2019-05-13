package selene;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
    private WebDriver driver;

    public static void main( String[] args )
    {
        new Test().run();
    }

    void run()
    {
        System.setProperty( "webdriver.chrome.driver", "D:/Temp/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get( "file:///D:/Temp/x.html" );
        System.out.println( driver.findElement( By.id( "vehicle1" ) ).isSelected() );
        System.out.println( driver.findElement( By.id( "vehicle3" ) ).isSelected() );
    };
}
