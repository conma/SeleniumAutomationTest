package selene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Component;

import selene.SELENEParser.AccessContext;
import selene.SELENEParser.ClickContext;
import selene.SELENEParser.GetContext;
import selene.SELENEParser.HoverContext;
import selene.SELENEParser.QuitContext;
import selene.SELENEParser.SendKeysContext;
import selene.SELENEParser.VerifyTextContext;
import selene.SELENEParser.VerifyTitleContext;
import selene.SELENEParser.WaitSecondContext;
import selenium.SeleniumRunner;

@Component
public class SELENEListenterImpl extends SELENEBaseListener
{
    private Actions action;

    private SeleniumRunner seleneRunner;
    public SELENEListenterImpl() {}
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
        String url = trimHeadAndTailQuot(ctx.url().getText());
        seleneRunner.get( url );
    }

    @Override
    public void exitAccess( AccessContext ctx )
    {
        String url = trimHeadAndTailQuot(ctx.url().getText());
        seleneRunner.access( url );
    }

    @Override
    public void exitClick( ClickContext ctx )
    {
        String element = trimHeadAndTailQuot(ctx.element().getText());
        seleneRunner.click( element );
    }

    @Override
    public void exitSendKeys( SendKeysContext ctx )
    {
        String element = trimHeadAndTailQuot(ctx.element().getText());
        seleneRunner.sendKeys( element, ctx.string().getText().replaceAll( "\"", "" ) );
    }

    @Override
    public void exitVerifyText( VerifyTextContext ctx )
    {
        String element = trimHeadAndTailQuot(ctx.element().getText());
        String string = trimHeadAndTailQuot(ctx.string().getText());
        seleneRunner.verifyText(element, string);
    }

    @Override
    public void exitVerifyTitle( VerifyTitleContext ctx )
    {
        String title = trimHeadAndTailQuot(ctx.string().getText());
        seleneRunner.verifyTitle(title);
    }

    @Override
    public void exitHover(HoverContext ctx) {
        String element = trimHeadAndTailQuot(ctx.element().getText());
        seleneRunner.hover(element);
    }

    @Override
    public void exitWaitSecond(WaitSecondContext ctx)
    {
        String seconds = trimHeadAndTailQuot(ctx.string().getText());
        seleneRunner.waitSecond( seconds );
    }

    @Override
    public void exitQuit(QuitContext ctx) {
        seleneRunner.quit();
    }

    private String trimHeadAndTailQuot(String input)
    {
        return input.replaceAll( "^\"", "" ).replaceAll( "\"$", "" );
    }
}