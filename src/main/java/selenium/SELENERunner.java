package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Component;

@Component
public class SELENERunner {
    private WebDriver webDriver;
    private Actions action;

    public SELENERunner(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.action = new Actions(webDriver);
    }

    public static boolean updateTCs() {
        return false;
    }

    public void get(String url) {
        webDriver.get(url);
    }

    public void click(String element) {
        WebElement webElement = getElement( element);
        action.click(webElement).build().perform();
    }

    public void sendKeys(String element, String keywords) {
        WebElement webElement = getElement( element);
        webElement.sendKeys(keywords);
    }

    public boolean verifyText(String element, String text) {
        WebElement webElement = getElement( element);
        return webElement.getText().equals(text);
    }

    public boolean verifyTitle(String title) {
        System.out.println(webDriver.getTitle());
        return webDriver.getTitle().equals(title);
    }

    public void hover(String element) {
        WebElement webElement = getElement( element);
        action.moveToElement(webElement).build().perform();
    }

    public boolean verifyEnable(String element) {
        WebElement webElement = getElement( element);
        return webElement.isEnabled();
    }

    public void access(String url) {
        webDriver.navigate().to(url);
    }

    public void endTC() {
        // updateTC
    }

    public void quit() {
        webDriver.quit();
    }
    private WebElement getElement(String element) {
        WebElement webElement = null;
        try {
            webElement = webDriver.findElement(By.id(element));
        } catch (NoSuchElementException e) {
            webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            webElement = webDriver.findElement(By.name(element));
        }
        if (webElement == null) {
            throw new NoSuchElementException("");
        }
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return webElement;
    }
}
