package selene;

import java.util.HashMap;
import java.util.Map;

import selene.SELENEParser.GetContext;

public class MyListener extends SELENEBaseListener {

    private Map<String, Integer> variables;

    public MyListener() {
        variables = new HashMap<>();
    }

    private int sum;

    @Override
    public void exitGet(GetContext ctx) {
        // This method is called when the parser has finished
        // parsing the add statement
        // tính tổng
        String url = ctx.URL().getText();
        System.out.println(url);
    }
}