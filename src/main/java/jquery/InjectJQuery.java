package jquery;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InjectJQuery
{
    // lenh height() trong JQuery
    private static String HEIGHT_JQ = "return $(document ).height();";
    private static String JQUERY_FILE = "src\\test\\selenium\\injectjquery\\script.txt";
    private static String ENABLE_ELEMENT = "var value = $(\"[name='_eventId_modify']\");"
            + "value[0].disabled = false;";
    public void main(WebDriver driver) throws IOException {
        driver.manage().window().maximize();
        WebElement editE = driver.findElement( By.id( "_edit" ) );
        editE.click();
        // Inject JQuery trong Selenium WebDriver
        JQueryUtils.injectJQuery(driver, JQUERY_FILE);
        // tinh chieu cao cua trang viettuts.vn
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        long pageHeight = (Long) jse.executeScript(HEIGHT_JQ);
        jse.executeScript( ENABLE_ELEMENT );
        System.out.println("$(document ).height() = " + pageHeight);
        //driver.quit();
    }

}
