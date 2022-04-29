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
        CharStream charStream = CharStreams.fromFileName("input/assemblertest.txt");
        SafeCLexer SafeCLexer = new SafeCLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

        //PARSER
        SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
        ParseTree parseTree = SafeCParser.aexpr();

        //FROM CST TO AST
        CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
        Node ASTTree = cstToASTVisitor.visit(parseTree);

        //PRETTY PRINT
        //ASTTree.accept(new PrettyPrint());

        //SYMBOL TABLE FILLING
        SymbolTable symbolTable = new SymbolTable();
        ASTTree.accept(new SymbolTableFill(symbolTable));

        CodeGenAssembler codeGen = new CodeGenAssembler();
        ASTTree.accept(codeGen);

        /*codeGen.setupMain(codeGen.main);
        System.out.println(codeGen.getlibs());
        System.out.println(codeGen.main.toString());
        System.out.println(codeGen.codeGen.toString());*/
        System.out.println(codeGen.codeGen.toString());
        System.out.println(codeGen.variableData.toString());


        //System.out.println(symbolTable.symbolTable);

    }
}
