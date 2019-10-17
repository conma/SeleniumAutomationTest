package selene;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Component;

import model.Testcase;
import model.TestcaseStatus;
import selene.SELENEParser.AccessContext;
import selene.SELENEParser.ClickContext;
import selene.SELENEParser.DoubleClickContext;
import selene.SELENEParser.EnableElementByIdContext;
import selene.SELENEParser.EnableElementByNameContext;
import selene.SELENEParser.EnableElementByXPathContext;
import selene.SELENEParser.GetContext;
import selene.SELENEParser.HoverContext;
import selene.SELENEParser.QuitContext;
import selene.SELENEParser.SelectByIndexContext;
import selene.SELENEParser.SelectByTextContext;
import selene.SELENEParser.SendKeysContext;
import selene.SELENEParser.VerifyCheckedContext;
import selene.SELENEParser.VerifyCheckedsContext;
import selene.SELENEParser.VerifyDisableContext;
import selene.SELENEParser.VerifyEnableContext;
import selene.SELENEParser.VerifyNotCheckedContext;
import selene.SELENEParser.VerifyNotCheckedsContext;
import selene.SELENEParser.VerifyNotFoundContext;
import selene.SELENEParser.VerifyTextContext;
import selene.SELENEParser.VerifyTitleContext;
import selene.SELENEParser.WaitSecondContext;
import selene.SELENEParser.ExecContext;
import selenium.SeleniumRunner;

@Component
public class SELENEListenterImpl extends SELENEBaseListener
{
    private Testcase testcase;

    private Actions action;

    private SeleniumRunner seleneRunner;

    public SELENEListenterImpl()
    {
    }

    public SELENEListenterImpl( WebDriver driver )
    {
        seleneRunner = new SeleniumRunner( driver );
        action = new Actions( driver );
    }

    public SELENEListenterImpl( WebDriver driver, Testcase testcase )
    {
        this.seleneRunner = new SeleniumRunner( driver );
        this.action = new Actions( driver );
        this.testcase = testcase;
    }

    public Testcase getTestcase()
    {
        return testcase;
    }

    public void setTestcase( Testcase testcase )
    {
        this.testcase = testcase;
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
        String url = trimHeadAndTailQuot( ctx.url().getText() );
        seleneRunner.get( url );
    }

    @Override
    public void exitAccess( AccessContext ctx )
    {
        String url = trimHeadAndTailQuot( ctx.url().getText() );
        seleneRunner.access( url );
    }

    @Override
    public void exitClick( ClickContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        seleneRunner.click( element );
    }

    @Override
    public void exitSendKeys( SendKeysContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        String string = trimHeadAndTailQuot( ctx.string().getText() );
        seleneRunner.sendKeys( element, string );
    }

    @Override
    public void exitVerifyText( VerifyTextContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        String string = trimHeadAndTailQuot( ctx.string().getText() );
        if ( !seleneRunner.verifyText( element, string ) )
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
    }

    @Override
    public void exitVerifyTitle( VerifyTitleContext ctx )
    {
        String title = trimHeadAndTailQuot( ctx.string().getText() );
        if ( !seleneRunner.verifyTitle( title ) )
        {
            String webPagetitle = seleneRunner.getTitle();
            testcase.setNote( testcase.getNote() + "\nWeb page Title = '" + webPagetitle + "', compare with '" + title + "'" );
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
        }
    }

    @Override
    public void exitHover( HoverContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        seleneRunner.hover( element );
    }

    @Override
    public void exitClear( SELENEParser.ClearContext ctx ) {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        seleneRunner.clear( element );
    }

    @Override
    public void exitRemoveAttr( SELENEParser.RemoveAttrContext ctx ) {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        String attr = trimHeadAndTailQuot( ctx.attribute().getText() );
        seleneRunner.removeAttr( element, attr );
    }

    @Override
    public void exitVerifyEnable( VerifyEnableContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        if ( !seleneRunner.verifyEnable( element ) )
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
    }

    @Override
    public void exitVerifyDisable( VerifyDisableContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        if ( seleneRunner.verifyEnable( element ) )
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
    }

    @Override
    public void exitVerifyNotFound( VerifyNotFoundContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        if ( !seleneRunner.verifyNotFound( element ) )
        {
            testcase.setNote( testcase.getNote() + "\nThe Web Element " + ctx.element().getText() + " is found!" );
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
        }
    }

    @Override
    public void exitVerifyChecked( VerifyCheckedContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        if ( !seleneRunner.verifyChecked( element ) )
        {
            testcase.setNote( testcase.getNote() + "\nThe Web Element " + ctx.element().getText() + " is not checked!" );
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
        }
    }

    @Override
    public void exitVerifyNotChecked( VerifyNotCheckedContext ctx )
    {
        String element = trimHeadAndTailQuot( ctx.element().getText() );
        if ( seleneRunner.verifyChecked( element ) )
        {
            testcase.setNote( testcase.getNote() + "\nThe Web Element " + ctx.element().getText() + " is checked!" );
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
        }
    }

    @Override
    public void exitVerifyCheckeds( VerifyCheckedsContext ctx )
    {
        String elements = trimHeadAndTailQuot( ctx.elements().getText() );
        if( !seleneRunner.verifyCheckeds( elements )) {
            testcase.setNote( testcase.getNote() + "\nThe Web Elements: " + ctx.elements().getText() + " at least one is not checked!" );
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
        }
    }

    @Override
    public void exitVerifyNotCheckeds( VerifyNotCheckedsContext ctx )
    {
        String elements = trimHeadAndTailQuot( ctx.elements().getText() );
        if( !seleneRunner.verifyNotCheckeds( elements )) {
            testcase.setNote( testcase.getNote() + "\nThe Web Elements: " + ctx.elements().getText() + " at least one is checked!" );
            testcase.setTestcaseStatus( TestcaseStatus.FAILED );
        }
    }

    @Override
    public void exitEnableElementByName( EnableElementByNameContext ctx )
    {
        seleneRunner.enableElementByName( trimHeadAndTailQuot( ctx.element().getText() ) );
    }

    @Override
    public void exitEnableElementById( EnableElementByIdContext ctx )
    {
        seleneRunner.enableElementById( trimHeadAndTailQuot( ctx.element().getText() ) );
    }

    @Override
    public void exitEnableElementByXPath( EnableElementByXPathContext ctx )
    {
        seleneRunner.enableElementByXPath( trimHeadAndTailQuot( ctx.element().getText() ) );
    }

    @Override
    public void exitDoubleClick( DoubleClickContext ctx )
    {
        seleneRunner.doubleClick( trimHeadAndTailQuot( ctx.element().getText() ) );
    }

    @Override
    public void exitSelectByIndex( SelectByIndexContext ctx )
    {
        seleneRunner.selectByIndex( trimHeadAndTailQuot( ctx.element().getText() ), trimHeadAndTailQuot( ctx.string().getText() ) );
    }

    @Override
    public void exitSelectByText( SelectByTextContext ctx )
    {
        seleneRunner.selectByText( trimHeadAndTailQuot( ctx.element().getText() ), trimHeadAndTailQuot( ctx.string().getText() ) );
    }

    @Override
    public void exitWaitSecond( WaitSecondContext ctx )
    {
        String seconds = trimHeadAndTailQuot( ctx.string().getText() );
        seleneRunner.waitSecond( seconds );
    }

    @Override
    public void exitExec(ExecContext ctx)
    {
        String macroFileName = trimHeadAndTailQuot( ctx.string().getText());
        seleneRunner.exec(macroFileName);
    }

    @Override
    public void exitQuit( QuitContext ctx )
    {
        seleneRunner.quit();
    }

    private String trimHeadAndTailQuot( String input )
    {
        return input.replaceAll( "^\"", "" ).replaceAll( "\"$", "" );
    }
}