package selene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;

import selene.SELENEParser.ClickContext;
import selene.SELENEParser.GetContext;
import selene.SELENEParser.SendKeysContext;
import selene.SELENEParser.UpdateTCsContext;
import selene.SELENEParser.VerifyTextContext;
import selene.SELENEParser.VerifyTitleContext;
import selenium.SELENERunner;

public class SELENEListenterImpl extends SELENEBaseListener
{
    private Actions action;

    @Autowired
    private SELENERunner seleneRunner;

    public SELENEListenterImpl(WebDriver driver) {
        seleneRunner = new SELENERunner( driver );
        action = new Actions( driver );
    }

    public Actions getAction()
    {
        return action;
    }

    public void setAction( Actions action )
    {
        this.action = action;
    }

    public SELENERunner getSeleneRunner()
    {
        return seleneRunner;
    }

    public void setSeleneRunner( SELENERunner seleneRunner )
    {
        this.seleneRunner = seleneRunner;
    }

    @Override
    public void exitUpdateTCs( UpdateTCsContext ctx )
    {
        System.out.println( "updateTCs: " + ctx.string().getText() );
    }

    @Override
    public void exitGet( GetContext ctx )
    {
        String url = ctx.url_with_q().getText().replaceAll( "\"", "" );
        seleneRunner.get( url );
    }

    @Override
    public void exitClick( ClickContext ctx )
    {
        seleneRunner.click( ctx.element_with_q().getText().replaceAll( "\"", "" ) );
    }

    @Override
    public void exitSendKeys( SendKeysContext ctx )
    {
        seleneRunner.sendKeys( ctx.element_with_q().getText().replaceAll( "\"", "" ), ctx.string_with_q().getText().replaceAll( "\"", "" ) );
    }

    @Override
    public void exitVerifyText( VerifyTextContext ctx )
    {
        System.out.println( "verifyText: " + ctx.element_with_q().getText() + " " + ctx.string_with_q().getText() );
    }

    @Override
    public void exitVerifyTitle( VerifyTitleContext ctx )
    {
        System.out.println( "verifyTitle: " + ctx.string_with_q().getText() );
    }

}