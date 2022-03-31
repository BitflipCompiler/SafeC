import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        //LEXER
        CharStream charStream = CharStreams.fromFileName("input/example.txt");
        Aexpr2Lexer aexpr2Lexer = new Aexpr2Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(aexpr2Lexer);

        //PARSER
        Aexpr2Parser aexpr2Parser = new Aexpr2Parser(commonTokenStream);
        ParseTree parseTree = aexpr2Parser.aexpr();

        //FROM CST TO AST
        CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
        ASTNode ASTTree = cstToASTVisitor.visit(parseTree);

        //PRETTY PRINT
        ASTTree.accept(new PrettyPrint());

        SymbolTable symbolTable = new SymbolTable();
        Attributes x = new Attributes("x");
        symbolTable.openScope();
        symbolTable.enterSymbol(x);
        symbolTable.closeScope();
        System.out.println(symbolTable);

    }
}
