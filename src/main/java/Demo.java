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
        // ASTTree.accept(new PrettyPrint());

        //SYMBOL TABLE FILLING
        SymbolTable symbolTable = new SymbolTable();
        ASTTree.accept(new SymbolTableFill(symbolTable));

        System.out.println(symbolTable);


    }
}
