package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");

        WebDriver firefoxDriver = new FirefoxDriver();
        Actions action = new Actions(firefoxDriver);

        firefoxDriver.get("http://localhost/web-servicemanager/loginForm");

        WebElement inputUserName = firefoxDriver.findElement(By.name("j_username"));
        WebElement inputPassword = firefoxDriver.findElement(By.name("j_password"));
        WebElement btnLogin = firefoxDriver.findElement(By.name("login"));

        inputUserName.sendKeys("coder");
        inputPassword.sendKeys("hr-s1111");
        btnLogin.click();


        WebElement companyDetail10011 = firefoxDriver.findElement(By.id("detail10001"));
        action.click(companyDetail10011).build().perform();

        firefoxDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement mid1 = firefoxDriver.findElement(By.id( "middle_category_1" ));
        action.moveToElement(mid1).build().perform();

        firefoxDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement sm1 = firefoxDriver.findElement(By.id("small_category_6"));
        action.click(sm1).build().perform();

        System.out.println("Page title is: " + firefoxDriver.getTitle());

        // Close the browser
        firefoxDriver.quit();
    }
}
