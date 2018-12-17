package selene;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class SELENE {
    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));

            SELENELexer lexer = new SELENELexer(input);
            SELENEParser parser = new SELENEParser(new CommonTokenStream(lexer));
            parser.addParseListener(new SELENEListenterImpl());

            // Start parsing
            parser.program();
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }

    }
}
