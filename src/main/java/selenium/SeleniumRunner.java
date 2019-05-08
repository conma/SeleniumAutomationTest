package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumRunner
{
    private WebDriver webDriver;

    private Actions action;

    private JavascriptExecutor javascriptexcutor;

    public SeleniumRunner( WebDriver webDriver )
    {
        this.webDriver = webDriver;
        this.action = new Actions( webDriver );
        this.javascriptexcutor = ( (JavascriptExecutor) webDriver );
    }

    public String getTitle()
    {
        return webDriver.getTitle();
    }

    public void get( String url )
    {
        webDriver.get( url );
    }

    public void access( String url )
    {
        webDriver.navigate().to( url );
    }

    public void click( String element )
    {
        WebElement webElement = getElement( element, true );
        action.click( webElement ).build().perform();
    }

    public void sendKeys( String element, String keywords )
    {
        WebElement webElement = getElement( element, true );
        webElement.sendKeys( keywords );
    }

    public boolean verifyText( String element, String text )
    {
        WebElement webElement = getElement( element, true );
        return webElement.getText().equals( text );
    }

    public boolean verifyTitle( String title )
    {
        return webDriver.getTitle().equals( title );
    }

    public void hover( String element )
    {
        WebElement webElement = getElement( element, true );
        action.moveToElement( webElement ).build().perform();
    }

    public boolean verifyEnable( String element )
    {
        WebElement webElement = getElement( element, true );
        return webElement.isEnabled();
    }

    public boolean verifyNotFound( String element )
    {
        WebElement webElement = getElement( element, false );
        return webElement == null;
    }

    public void waitSecond( String seconds )
    {
        long time = Long.parseLong( seconds );
        webDriver.manage().timeouts().implicitlyWait( time, TimeUnit.SECONDS );
    }

    public void enableElementByName( String elementName )
    {
        String enableElementByName = "document.getElementsByName('" + elementName + "')[0].removeAttribute('disabled');";
        javascriptexcutor.executeScript( enableElementByName );
    }

    public void enableElementById( String elementId )
    {
        String enableElementById = "document.getElementById('" + elementId + "').removeAttribute('disabled');";
        javascriptexcutor.executeScript( enableElementById );
    }

    public void enableElementByXPath( String elementXPath )
    {
        /*
         * reference https://developer.mozilla.org/en-US/docs/Web/JavaScript/Introduction_to_using_XPath_in_JavaScript
         */
        String enableElementByXPath = "document.evaluate(\"" + elementXPath
                + "\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.removeAttribute('disabled');";
        javascriptexcutor.executeScript( enableElementByXPath );
    }

    public void doubleClick( String element )
    {
        WebElement webElement = getElement( element, true );
        action.doubleClick( webElement ).build().perform();
    }

    public void selectByIndex( String element, String index )
    {
        WebElement webElement = getElement( element, true );
        Select selectElement = new Select( webElement );
        selectElement.selectByIndex( Integer.parseInt( index ) );
    }

    public void selectByText( String element, String text )
    {
        WebElement webElement = getElement( element, true );
        Select selectElement = new Select( webElement );
        selectElement.selectByVisibleText( text );
    }

    public void quit()
    {
        webDriver.quit();
    }

    private WebElement getElement( String element, boolean throwException )
    {
        WebElement webElement = null;
        webElement = findElementById( element );
        if ( webElement == null )
            webElement = findElementByName( element );
        if ( webElement == null )
            webElement = findElementByXPath( element );
        if ( webElement == null )
            webElement = getElementByCssSelector( element );
        if ( webElement == null )
            if ( throwException )
                throw new NoSuchElementException( "No such element name/id/xpath/cssSelector = \"" + element + "\"" );
        return webElement;
    }

    private WebElement findElementById( String element )
    {
        WebElement webElement;
        try
        {
            webElement = webDriver.findElement( By.id( element ) );
        }
        catch ( NoSuchElementException noSuchElementException )
        {
            return null;
        }
        catch ( NoSuchWindowException noSuchWindowException )
        {
            return null;
        }
        return webElement;
    }

    private WebElement findElementByName( String element )
    {
        WebElement webElement;
        try
        {
            webElement = webDriver.findElement( By.name( element ) );
        }
        catch ( NoSuchElementException noSuchElementException )
        {
            return null;
        }
        catch ( NoSuchWindowException noSuchWindowException )
        {
            return null;
        }
        return webElement;
    }

    private WebElement findElementByXPath( String element )
    {
        WebElement webElement;
        try
        {
            webElement = webDriver.findElement( By.xpath( element ) );
        }
        catch ( NoSuchElementException noSuchElementException )
        {
            return null;
        }
        catch ( NoSuchWindowException noSuchWindowException )
        {
            return null;
        }
        return webElement;
    }

    private WebElement getElementByCssSelector( String element )
    {
        WebElement webElement;
        try
        {
            webElement = webDriver.findElement( By.cssSelector( ( element ) ) );
        }
        catch ( NoSuchElementException noSuchElementException )
        {
            return null;
        }
        catch ( NoSuchWindowException noSuchWindowException )
        {
            return null;
        }
        return webElement;
    }

}
