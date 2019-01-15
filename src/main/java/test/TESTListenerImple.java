package test;

import test.TESTParser.GetContext;

public class TESTListenerImple extends TESTBaseListener
{
    @Override
    public void exitGet( GetContext ctx )
    {
        if(ctx.xpath() != null)
        System.out.println( ctx.xpath().getText() );
        if(ctx.string() != null)
        System.out.println( ctx.string().getText() );
        if(ctx.url() != null)
        System.out.println( ctx.url().getText() );
    }
}
