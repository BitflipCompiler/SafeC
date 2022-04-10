package service;

import java.util.ArrayList;


public class Symbol2Table {
    private final ArrayList<Scope> sTable = new ArrayList<>();
    int depth = -1;
    int currentScope = 0;


    public Symbol2Table() {}

    public void enterSymbol(Attributes attr) {
        Scope lastAttributes = sTable.get(sTable.size()-1);
        if(lastAttributes.isAttributeInScope(attr)){
           throw new RuntimeException("Symbol already in current scope!");
        } else {
            attr.level = depth;
           // attr.scopeNumber = currentScope;
            lastAttributes.addAttribute(attr);
        }
    }

    public Attributes retrieveSymbol(String name) {
        Scope currentScope = sTable.get(sTable.size()-1);
        Attributes symbol = this.getSymbolFromScope(name, currentScope);

        return symbol;
    }

    private Attributes getSymbolFromScope(String name, Scope scope){
        for (Attributes attr: scope.attributes) {
            if(name == attr.name){
                return attr;
            }
        }
        if(scope.parent != null){
            return getSymbolFromScope(name, scope.parent);
        }
        throw new RuntimeException("all related scopes checked for name: " + name);
    }

    public void openScope() {
        depth++;
        currentScope++;
        sTable.add(new Scope());
        Scope parent;
        if(depth == 0){
            parent = null;
        } else {
            parent = sTable.get(depth);
        }
        sTable.get(sTable.size() -1).setParent(parent);
    }


    public void closeScope() {
        depth --;
    }


    public void getParents(){
        for (Scope child: sTable) {
            System.out.println("child: " + child);
            System.out.println("parent: " + child.parent);
        }
    }

    @Override
    public String toString() {
        return "Symbol2Table{" + sTable +
                ", depth=" + depth +
                ", currentScope=" + currentScope +
                '}';
    }
}
