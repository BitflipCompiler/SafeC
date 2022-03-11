package iter2.grammar_v2.gen;

import iter2.expr.gen.ExprLexer;
import iter2.expr.gen.ExprParser;
import org.antlr.v4.runtime.*;

/*Code from slides 14: https://gfx.cse.taylor.edu/courses/cos382/slides/04_ANTLR.md.html?scale*/
public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("src/main/resources/iter2/grammar_v2/test1.txt");
        Grammar_v2Lexer lexer = new Grammar_v2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Grammar_v2Parser parser = new Grammar_v2Parser(tokens);

        parser.prog(); // parse the input stream!
    };
}