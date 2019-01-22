package selene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import selene.SELENEParser.AccessContext;
import selene.SELENEParser.ClickContext;
import selene.SELENEParser.GetContext;
import selene.SELENEParser.HoverContext;
import selene.SELENEParser.QuitContext;
import selene.SELENEParser.SendKeysContext;
import selene.SELENEParser.VerifyTextContext;
import selene.SELENEParser.VerifyTitleContext;
import selenium.SeleniumRunner;

@Component
public class SELENEListenterImpl extends SELENEBaseListener
{
    private Actions action;

    @Autowired
    private SeleniumRunner seleneRunner;

    public SELENEListenterImpl(WebDriver driver) {
        seleneRunner = new SeleniumRunner( driver );
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

    public SeleniumRunner getSeleneRunner()
    {
        return seleneRunner;
    }

    public void setSeleneRunner( SeleniumRunner seleneRunner )
    {
        this.seleneRunner = seleneRunner;
    }

    @Override
    public void exitGet( GetContext ctx )
    {
        String url = ctx.url().getText().replaceAll( "\"", "" );
        seleneRunner.get( url );
    }

    @Override
    public void exitAccess( AccessContext ctx )
    {
        String url = ctx.url().getText().replaceAll( "\"", "" );
        seleneRunner.access( url );
    }

    @Override
    public void exitClick( ClickContext ctx )
    {
        seleneRunner.click( ctx.element().getText().replaceAll( "\"", "" ) );
    }

    @Override
    public void exitSendKeys( SendKeysContext ctx )
    {
        seleneRunner.sendKeys( ctx.element().getText().replaceAll( "\"", "" ), ctx.string().getText().replaceAll( "\"", "" ) );
    }

    @Override
    public void exitVerifyText( VerifyTextContext ctx )
    {
        // System.out.println( "verifyText: " + ctx.element().getText() + " " + ctx.string().getText() );
    }

    @Override
    public void exitVerifyTitle( VerifyTitleContext ctx )
    {
        System.out.println(ctx.string().getText());
        System.out.println("verifyTitle: " + seleneRunner.verifyTitle(ctx.string().getText().replaceAll("\"", "")));
    }

    @Override
    public void exitHover(HoverContext ctx) {
        seleneRunner.hover(ctx.element().getText().replaceAll("\"", ""));
    }

    @Override
    public void exitQuit(QuitContext ctx) {
        seleneRunner.quit();
    }

    private String trimHeadAndTailQuot(String input)
    {
        return input.replace( "^\"", "" ).replace( "\"$", "" );
    }
}