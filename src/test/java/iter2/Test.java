package iter2.expr;

import org.antlr.v4.runtime.*;

/*Code from slides 14: https://gfx.cse.taylor.edu/courses/cos382/slides/04_ANTLR.md.html?scale*/
public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("src/main/resources/iter2/expr/test1.txt");
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        parser.prog(); // parse the input stream!
    };
}