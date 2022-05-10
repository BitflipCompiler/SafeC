package service;

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
    void getDataType() {
        assertSame(codeGenC.getDataType("Num"), Type.Number);
        assertSame(codeGenC.getDataType("Void"), Type.Void);
        assertSame(codeGenC.getDataType("String"), Type.String);
        assertSame(codeGenC.getDataType("Bool"), Type.Boolean);
        assertSame(codeGenC.getDataType("Char"), Type.Char);
    }
}