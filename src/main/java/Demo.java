import gen.*;
import ast.abstracts.Node;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import service.CSTToASTVisitor;
import service.PrettyPrint;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        //LEXER
        CharStream charStream = CharStreams.fromFileName("input/example.txt");
        SafeCLexer SafeCLexer = new SafeCLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

        //PARSER
        SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
        ParseTree parseTree = SafeCParser.prog();

        //FROM CST TO AST
        CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
        Node ASTTree = cstToASTVisitor.visit(parseTree);

        //PRETTY PRINT
        ASTTree.accept(new PrettyPrint());

        //SYMBOL TABLE FILLING
        /*run.SymbolTable symbolTable = new run.SymbolTable();
        ASTTree.accept(new run.SymbolTableFill(symbolTable));

        System.out.println(symbolTable);*/

    }
}
