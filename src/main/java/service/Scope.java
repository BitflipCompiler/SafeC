package service;

import java.util.ArrayList;

/**
 * This class represents the Scopes in the {@link SymbolTable}.
 * Each {@link Scope} has an array of {@link Scope#attributes} and a {@link Scope#parent}
 */

public class Scope {
    public final ArrayList<Attributes> attributes = new ArrayList<>();
    public Scope parent;

    public Scope() {

    }
    //What is this used for ?
    public boolean isAttributeInScope(Attributes attribute){
        for (Attributes symbol: this.attributes) {
            if (symbol.name == attribute.name){
                System.out.println("returns true, wtf");
                return true;
            }
        }
        return false;
    }

    public void addAttribute(Attributes attribute){
        this.attributes.add(attribute);
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "{" +
                "attributes=" + attributes +
                '}';
    }
}
