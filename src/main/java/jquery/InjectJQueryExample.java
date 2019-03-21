package jquery;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * For example only, when run that class --> Error!
 */
public class InjectJQueryExample
{
    private static String HEIGHT_JQ = "return $(document ).height();";
    private static String ENABLE_ELEMENT = "var value = $(\"[name='_eventId_modify']\");"
            + "value[0].disabled = false;";
    public static void main(WebDriver driver) throws IOException {
        driver.manage().window().maximize();
        WebElement editE = driver.findElement( By.id( "_edit" ) );
        editE.click();
        JQueryUtils.injectJQuery(driver);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        long pageHeight = (Long) jse.executeScript(HEIGHT_JQ);
        jse.executeScript( ENABLE_ELEMENT );
        System.out.println("$(document ).height() = " + pageHeight);
        driver.quit();
    }

}
