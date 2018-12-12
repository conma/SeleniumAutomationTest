package selene;

import java.util.HashMap;
import java.util.Map;

import selene.SELENEParser.GetContext;

public class MyListener extends SELENEBaseListener {

	private Map<String, String> variables;

	public MyListener() {
		variables = new HashMap<>();
	}

    @Override
    public void exitGet(GetContext ctx) {
        // This method is called when the parser has finished
        // parsing the add statement
        // tính tổng
    	String url = ctx.url().getText();
    	System.out.println("url: " + url);
    	variables.put("name", "url");
    }

}