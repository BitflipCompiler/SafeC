package safec;

import org.antlr.v4.runtime.*;
import old.safec.gen.SafecLexer;
import old.safec.gen.SafecParser;

/*Code from slides 14: https://gfx.cse.taylor.edu/courses/cos382/slides/04_ANTLR.md.html?scale*/
public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("src/main/resources/safec/test1.txt");
        SafecLexer lexer = new SafecLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SafecParser parser = new SafecParser(tokens);

        parser.prog(); // parse the input stream!
    }
}