package selene;

import java.util.HashMap;
import java.util.Map;

import selene.SELENEParser.ClickButtonContext;
import selene.SELENEParser.ClickLinkContext;
import selene.SELENEParser.GetContext;
import selene.SELENEParser.SendKeysContext;
import selene.SELENEParser.UpdateTCsContext;
import selene.SELENEParser.VerifyTextContext;
import selene.SELENEParser.VerifyTitleContext;

public class SELENEListenterImpl extends SELENEBaseListener
{

    private Map<String, String> variables;

    public SELENEListenterImpl()
    {
        variables = new HashMap<>();
    }

    @Override
    public void exitGet( GetContext ctx )
    {
        // This method is called when the parser has finished
        // parsing the add statement
        // tính tổng
        String url = ctx.url_with_q().getText();
        System.out.println( "url: " + url );
        variables.put( "name", "url" );
    }

    @Override
    public void exitClickButton( ClickButtonContext ctx )
    {
        System.out.println( "clickButton: " + ctx.string_with_q().getText() );
    }

    @Override
    public void exitClickLink( ClickLinkContext ctx )
    {
        System.out.println( "clickButton: " + ctx.string_with_q().getText() );
    }

    @Override
    public void exitSendKeys( SendKeysContext ctx )
    {
        System.out.println( "sendKeys: " + ctx.element_with_q().getText() + " " + ctx.string_with_q().getText() );
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

    @Override
    public void exitUpdateTCs( UpdateTCsContext ctx )
    {
        System.out.println( "updateTCs: " + ctx.string().getText() );
    }
}