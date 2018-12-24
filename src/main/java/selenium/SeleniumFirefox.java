package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        // Create a new instance of the Firefox driver

        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://localhost:8888/web-servicemanager/loginForm");

        // Find the text input element by its name
        WebElement inputUserName = firefoxDriver.findElement(By.name("j_username"));
        WebElement inputPassword = firefoxDriver.findElement(By.name("j_password"));
        WebElement btnLogin = firefoxDriver.findElement(By.name("login"));

        inputUserName.sendKeys("test");
        inputPassword.sendKeys("abc@1235");
        btnLogin.click();
        List<WebElement> elements = firefoxDriver.findElements(By.tagName("input"));
        for (WebElement element : elements) {
            System.out.println(element.getAttribute("type"));
        }
        WebElement companyDetail10013 = firefoxDriver.findElement(By.xpath("//tbody//tr[10]//td[5]//input[1]"));
        companyDetail10013.click();
        // Check the title of the page
        System.out.println("Page title is: " + firefoxDriver.getTitle());

        // Close the browser
        firefoxDriver.quit();
    }
}
