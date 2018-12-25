package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        // Create a new instance of the Firefox driver

        WebDriver firefoxDriver = new FirefoxDriver();
        Actions action = new Actions(firefoxDriver);
        firefoxDriver.get("http://localhost:8888/web-servicemanager/loginForm");

        // Find the text input element by its name
        WebElement inputUserName = firefoxDriver.findElement(By.name("j_username"));
        WebElement inputPassword = firefoxDriver.findElement(By.name("j_password"));
        WebElement btnLogin = firefoxDriver.findElement(By.name("login"));

        inputUserName.sendKeys("coder");
        inputPassword.sendKeys("hr-s1111");
        btnLogin.click();
        List<WebElement> elements = firefoxDriver.findElements(By.tagName("input"));
        for (WebElement element : elements) {
            System.out.println(element.getAttribute("type"));
        }
        WebElement companyDetail10013 = firefoxDriver.findElement(By.id("detail10001"));
        action.click(companyDetail10013).build().perform();
        WebElement mid1 = firefoxDriver.findElement(By.id("middle_category_1"));
        action.moveToElement(mid1).build().perform();
        WebElement sm1 = firefoxDriver.findElement(By.id("small_category_1"));
        action.click(sm1).build().perform();
        // Check the title of the page
        System.out.println("Page title is: " + firefoxDriver.getTitle());

        // Close the browser
        firefoxDriver.quit();
    }
}
