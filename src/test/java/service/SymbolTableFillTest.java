package service;

import ast.NumDclNode;
import ast.abstracts.Node;
import gen.SafeCLexer;
import gen.SafeCParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SymbolTableFillTest {
    SymbolTableFill symbolTableFill;
    SymbolTable symbolTable;
    Node ASTTree;

    @BeforeEach
    void setup() throws IOException {
        //LEXER
        CharStream charStream = CharStreams.fromFileName("input/example.txt");
        SafeCLexer SafeCLexer = new SafeCLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(SafeCLexer);

        //PARSER
        SafeCParser SafeCParser = new SafeCParser(commonTokenStream);
        ParseTree parseTree = SafeCParser.prog();

        //FROM CST TO AST
        CSTToASTVisitor cstToASTVisitor = new CSTToASTVisitor();
        ASTTree = cstToASTVisitor.visit(parseTree);



    }
    /*Not working yet
    @Test
    void test(){
        //SYMBOL TABLE FILLING
        symbolTable = new SymbolTable();
        symbolTable.openScope();
        symbolTableFill = new SymbolTableFill(symbolTable);

        ASTTree.accept(symbolTableFill);
        //symbolTableFill.visit();

        System.out.println(symbolTableFill.symbolTable);
        System.out.println(symbolTable.retrieveSymbol("x"));
    }
     */
}