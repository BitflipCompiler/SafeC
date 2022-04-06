package service;/*
* inspiration taken from:
* https://github.com/NickDue/Projekt4_Src/blob/main/AELCompiler/src/SymbolTable/SymbolTable.java
*
* */

import java.util.ArrayList;
import java.util.Hashtable;

public class SymbolTable {
    private final Hashtable<String, Attributes> symbols = new Hashtable<>();
    private final ArrayList<ArrayList<Attributes>> scopes = new ArrayList<>();
    private int depth = -1;

    public SymbolTable() {}

    public void enterSymbol(Attributes attr) {
        // Add to scope display
        attr.scopeDepth = depth;
        scopes.get(depth).add(attr);

        // Add to hashtable
        symbols.put(attr.name, attr);

    }

    public Attributes retrieveSymbol(String name) {
        return symbols.get(name);
    }

    public void openScope() {
        depth++;
        if (scopes.size() - 1 < depth) {
            scopes.add(new ArrayList<>());
        }
    }

    // fjerne var, tilføje level
    public void closeScope() {
        scopes.remove(depth);
        depth--;
    }

    @Override
    public String toString() {
        return "run.SymbolTable{" +
                "symbols=" + symbols.toString() +
                ", scopes=" + scopes +
                ", depth=" + depth +
                '}';
    }
}
