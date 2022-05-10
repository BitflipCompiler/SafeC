package service;


import ast.FuncBlockNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SymbolTableTest {

    SymbolTable symbolTable;

    Attributes attr1 = new Attributes("x", Type.Number, false);
    Attributes attr2 = new Attributes("y", Type.String, true);


    @BeforeEach
    void setUp() {
        symbolTable = new SymbolTable();
    }

    @Test
    void openScope() {
        symbolTable.depth = -1;
        symbolTable.scopeCount = -1;
        symbolTable.openScope();

        assertEquals(0, symbolTable.depth);
        assertEquals(0, symbolTable.scopeCount);
    }

    @Test
    void closeScope() {
        symbolTable.depth = 0;
        symbolTable.scopeCount = 0;
        symbolTable.openScope();

        assertEquals(1, symbolTable.depth);
        assertEquals(1, symbolTable.scopeCount);

        symbolTable.closeScope();

        assertEquals(0, symbolTable.depth);
        assertEquals(1, symbolTable.scopeCount);

    }

    @Test
    void retrieveSymbol() {
        symbolTable.openScope();
        symbolTable.enterSymbol(attr1);

        String name = "x";
        Attributes x = symbolTable.retrieveSymbol(name);

        assertEquals(x, attr1);
        symbolTable.closeScope();

    }

    @Test
    void enterSymbol() {
        symbolTable.openScope();
        assertTrue(symbolTable.symbolTable.isEmpty());
        symbolTable.enterSymbol(attr1);
        assertFalse(symbolTable.symbolTable.isEmpty());
        symbolTable.closeScope();
    }

    @Test
    void isDeclaredLocally() {
        String name = "x";

        symbolTable.openScope();
        symbolTable.openScope();
        symbolTable.enterSymbol(attr1);
        assertTrue(symbolTable.isDeclaredLocally(name));
        symbolTable.closeScope();
        assertFalse(symbolTable.isDeclaredLocally(name));

    }

    @Test
    void checkFormalParams() {
        LinkedHashMap<String, Type> hashMap = new LinkedHashMap<>();
        hashMap.put("x", Type.Number);
        FuncBlockNode funcBlockNode = new FuncBlockNode(null, null);
        FuncAttributes funcAttributes = new FuncAttributes("x", Type.Number, true, funcBlockNode, hashMap, null);

        Map.Entry<String, Type> expected;
        expected = new AbstractMap.SimpleEntry<>("x", Type.Number);

        symbolTable.openScope();
        symbolTable.openScope();
        symbolTable.enterSymbol(funcAttributes);
        symbolTable.enterSymbol(attr2);
        assertEquals(expected, symbolTable.checkFormalParams("x"));
        symbolTable.closeScope();

    }
}