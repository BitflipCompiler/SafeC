package service;

import ast.abstracts.Node;
import exceptions.*;
import gen.SafeCLexer;
import gen.SafeCParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ErrorHandlingTest {
    @Test
    void AssignTypeCheckException() throws IOException {

        AssignTypeCheckException thrown = Assertions.assertThrows(AssignTypeCheckException.class, () -> {
            CharStream charStream = CharStreams.fromFileName("input/ErrorHandlingTest/AssignTypeCheckExceptionTest.txt");
            SafeCLexer SafeCLexer = new SafeCLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

            //PARSER
            SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
            ParseTree parseTree = SafeCParser.prog();

            //FROM CST TO AST
            CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
            Node ASTTree = cstToASTVisitor.visit(parseTree);

            //SYMBOL TABLE FILLING
            SymbolTable symbolTable = new SymbolTable();
            ASTTree.accept(new SymbolTableFill(symbolTable));
        });

        Assertions.assertEquals("Type Boolean does not match with type String at line :12", thrown.getMessage());
    }

    @Test
    void IllegalTypeException() throws IOException {

        IllegalTypeException thrown = Assertions.assertThrows(IllegalTypeException.class, () -> {
            CharStream charStream = CharStreams.fromFileName("input/ErrorHandlingTest/IllegalTypeExceptionTest.txt");
            SafeCLexer SafeCLexer = new SafeCLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

            //PARSER
            SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
            ParseTree parseTree = SafeCParser.prog();

            //FROM CST TO AST
            CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
            Node ASTTree = cstToASTVisitor.visit(parseTree);

            //SYMBOL TABLE FILLING
            SymbolTable symbolTable = new SymbolTable();
            ASTTree.accept(new SymbolTableFill(symbolTable));
        });

        Assertions.assertEquals("actual param: String different than: Number at line: 0", thrown.getMessage());
    }

    @Test
    void MultipleLocalDeclarationException() throws IOException {

        MultipleLocalDeclarationException thrown = Assertions.assertThrows(MultipleLocalDeclarationException.class, () -> {
            CharStream charStream = CharStreams.fromFileName("input/ErrorHandlingTest/MultipleLocalDeclarationExceptionTest.txt");
            SafeCLexer SafeCLexer = new SafeCLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

            //PARSER
            SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
            ParseTree parseTree = SafeCParser.prog();

            //FROM CST TO AST
            CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
            Node ASTTree = cstToASTVisitor.visit(parseTree);

            //SYMBOL TABLE FILLING
            SymbolTable symbolTable = new SymbolTable();
            ASTTree.accept(new SymbolTableFill(symbolTable));
        });

        Assertions.assertEquals("Number declaration multiple times in local scope: x at line: 17", thrown.getMessage());
    }

    @Test
    void ParamSizeException() throws IOException {

        ParamSizeException thrown = Assertions.assertThrows(ParamSizeException.class, () -> {
            CharStream charStream = CharStreams.fromFileName("input/ErrorHandlingTest/ParamSizeExceptionTest.txt");
            SafeCLexer SafeCLexer = new SafeCLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

            //PARSER
            SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
            ParseTree parseTree = SafeCParser.prog();

            //FROM CST TO AST
            CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
            Node ASTTree = cstToASTVisitor.visit(parseTree);

            //SYMBOL TABLE FILLING
            SymbolTable symbolTable = new SymbolTable();
            ASTTree.accept(new SymbolTableFill(symbolTable));
        });

        Assertions.assertEquals("Actual params size: 3 Formal params size:  2at line: 0", thrown.getMessage());
    }
}
