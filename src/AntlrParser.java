import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class AntlrParser {

    public static void main(String[] args) throws IOException {

        CharStream charStream = CharStreams.fromFileName("input/example.txt");
        Aexpr2Lexer aexpr2Lexer = new Aexpr2Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(aexpr2Lexer);
        Aexpr2Parser aexpr2Parser = new Aexpr2Parser(commonTokenStream);

        ParseTree parseTree = aexpr2Parser.aexpr();

        CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
        ASTNode ASTTree = cstToASTVisitor.visit(parseTree);

    }
}
