package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class SymbolTable {
    public final Hashtable<String, Attributes> symbolTable = new Hashtable<>();
    private final ArrayList<Scope> scopes = new ArrayList<>();
    int depth = -1;
    int scopeCount = -1;

    public void openScope(){
        depth++;
        scopeCount++;
        //System.out.println("opening scope at depth: " +depth);
        this.scopes.add(new Scope());
    }

    public void closeScope(){
        //System.out.println("symbolTable is now: " + symbolTable);
        for (Attributes attribute: this.scopes.get(this.scopes.size()-1).attributes) {
            Attributes prevSymbol = attribute.prevSymbol;
            this.symbolTable.remove(attribute.name);
            if(prevSymbol != null){
                symbolTable.put(prevSymbol.name, prevSymbol);
            }
        }
        //System.out.println("closing scope at depth: " + depth);
        this.scopes.remove(this.scopes.size()-1);
        depth--;
    }

    public Attributes retrieveSymbol(String name){
        return this.symbolTable.get(name);
    }


    public void enterSymbol(Attributes newAttribute){
        Attributes oldAttribute = this.retrieveSymbol(newAttribute.name);
        if(oldAttribute != null && oldAttribute.depth == depth && !newAttribute.isformalparam
                //This might be wrong, done to fix funccals id in globalscope
                && newAttribute.depth != 0){

            throw new RuntimeException("Duplicate definition of: " + newAttribute.name);
        }

        //Add to scope display
        newAttribute.level = scopeCount;
        newAttribute.depth = depth;
        this.scopes.get(this.scopes.size()-1).addAttribute(newAttribute);
        //Add to symbol table
        /*if(oldAttribute == null){
            this.symbolTable.put(newAttribute.name, newAttribute);
        } else {
            this.symbolTable.remove(oldAttribute);
            this.symbolTable.put(newAttribute.name, newAttribute);
        }*/
        this.symbolTable.put(newAttribute.name, newAttribute);
        newAttribute.prevSymbol = oldAttribute;

    }

    public boolean isDeclaredLocally(String name){
        for (Attributes symbol: this.scopes.get(this.scopes.size()-1).attributes) {
            if (name.equals(symbol.name)){
                System.out.println("id alrdy in scope: " + name);
                return true;
            }
        }
        return false;
    }

    public Map.Entry<String, Type> checkFormalParams(String id){
        System.out.println(this.scopes.get(scopes.size()-1).attributes);
        if(this.scopes.get(scopes.size()-1).attributes.isEmpty()){
            return null;
        }
        for (Attributes symbol : this.scopes.get(this.scopes.size()-1).attributes) {
            if(symbol.getClass().getSimpleName().equals("FuncAttributes")){
                FuncAttributes funcsymbol = (FuncAttributes) symbol;
                if(funcsymbol.formalParams != null){
                    for (Map.Entry<String, Type> formalparam : funcsymbol.formalParams.entrySet()) {
                        //System.out.println(id + formalparam.getKey());
                        if(id.equals(formalparam.getKey())){
                            return formalparam;
                        }else{
                            return formalparam;
                        }
                    }
                }
            }

        }

        return null;
    }
    @Override
    public String toString() {
        return
                 symbolTable +
                ", \nscopes=" + scopes +
                ", depth=" + depth +
                '}';
    }
}
