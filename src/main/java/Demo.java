import gen.*;
import ast.abstracts.Node;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import service.*;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        //LEXER
        CharStream charStream = CharStreams.fromFileName("input/tvp.txt");
        SafeCLexer SafeCLexer = new SafeCLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

        //PARSER
        SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
        ParseTree parseTree = SafeCParser.prog();

        //FROM CST TO AST
        CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
        Node ASTTree = cstToASTVisitor.visit(parseTree);

        //PRETTY PRINT
        //ASTTree.accept(new PrettyPrint());

        //SYMBOL TABLE FILLING
        SymbolTable symbolTable = new SymbolTable();
        ASTTree.accept(new SymbolTableFill(symbolTable));

        System.out.println(symbolTable.symbolTable);

    }
}
