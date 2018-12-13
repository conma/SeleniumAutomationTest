package selene;

import java.util.HashMap;
import java.util.Map;

import selene.SELENEParser.ClickContext;
import selene.SELENEParser.GetContext;
import selene.SELENEParser.SendKeysContext;
import selene.SELENEParser.UpdateDBContext;
import selene.SELENEParser.VerifyTextContext;
import selene.SELENEParser.VerifyTitleContext;

public class MyListener extends SELENEBaseListener
{

    private Map<String, String> variables;

    public MyListener()
    {
        variables = new HashMap<>();
    }

    @Override
    public void exitGet( GetContext ctx )
    {
        // This method is called when the parser has finished
        // parsing the add statement
        // tính tổng
        String url = ctx.url().getText();
        System.out.println( "url: " + url );
        variables.put( "name", "url" );
    }

    @Override
    public void exitClick( ClickContext ctx )
    {
        System.out.println( "click: " + ctx.string().getText() );
    }

    @Override
    public void exitSendKeys( SendKeysContext ctx )
    {
        System.out.println( "sendKeys: " + ctx.string( 0 ).getText() + " " + ctx.string( 1 ).getText() );
    }

    @Override
    public void exitVerifyText( VerifyTextContext ctx )
    {
        System.out.println( "verifyText: " + ctx.element().getText() + " " + ctx.string().getText() );
    }

    @Override
    public void exitVerifyTitle( VerifyTitleContext ctx )
    {
        System.out.println( "verifyTitle: " + ctx.string().getText() );
    }

    @Override
    public void exitUpdateDB( UpdateDBContext ctx )
    {
        System.out.println( "updateDB: " + ctx.string().getText() );
    }
}