package service;

import ast.IdNode;
import ast.abstracts.Node;
import gen.SafeCLexer;
import gen.SafeCParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CodeGenCTest {
    CodeGenC codeGenC;

    @BeforeEach
    void setUp() throws IOException {
        codeGenC = new CodeGenC();
    }

    @Test
    void visit() throws IOException {

    }

    @Test
    void getDataType() {
        assertSame(codeGenC.getDataType("Num"), Type.Number);
        assertSame(codeGenC.getDataType("Void"), Type.Void);
        assertSame(codeGenC.getDataType("String"), Type.String);
        assertSame(codeGenC.getDataType("Bool"), Type.Boolean);
        assertSame(codeGenC.getDataType("Char"), Type.Char);
    }

    @Test
    void test(){

    }
}