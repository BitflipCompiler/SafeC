package service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Symbol2Table {
    private final List<ArrayList<Scope>> sTable = new ArrayList<>();
    Scope globalScope = new Scope();


    public Symbol2Table() {}

    public void enterSymbol(Attributes attr) {
        ArrayList<Scope> lastScope = sTable.get(sTable.size()-1);
        int lengthOfLastScope = lastScope.size()-1;
        if(lastScope.get(lengthOfLastScope).isAttributeInScope(attr)){
           throw new RuntimeException("Symbol already in current scope!");
        } else {
            if(sTable.size() == 1){
                sTable.get(0).get(0).attributes.add(attr);
            }
            lastScope.get(lengthOfLastScope).addAttribute(attr);
        }
    }

    public Attributes retrieveSymbol(String name) {
        ArrayList<Scope> arrlastScope = sTable.get(sTable.size()-1);
        Scope lastScope = arrlastScope.get(arrlastScope.size()-1);

        for (int i = sTable.size(); i > 0; i--){
            for (int j = lastScope.attributes.size(); j > 0; j--){
                if(name == lastScope.attributes.get(j-1).name){
                    return lastScope.attributes.get(j-1);
                }
            }
        }
        throw new RuntimeException("Symbol with name: " + name + "does not exist.");
    }

    public void openScope() {
        ArrayList list = new ArrayList<Scope>();
        list.add(globalScope);
        sTable.add(list);
    }


    public void closeScope() {

    }

    @Override
    public String toString() {
        return "Symbol2Table{" +
                "sTable=" + sTable +
                ", globalScope=" + globalScope +
                '}';
    }
}
