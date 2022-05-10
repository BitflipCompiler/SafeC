package service;

import java.util.ArrayList;

/**
 * This class represents the Scopes in the {@link SymbolTable}.
 * Each {@link Scope} has an array of {@link Scope#attributes}}
 */

public class Scope {
    public final ArrayList<Attributes> attributes = new ArrayList<>();

    public Scope() {
    }

    public void addAttribute(Attributes attribute){
        this.attributes.add(attribute);
    }

    @Override
    public String toString() {
        return "{" +
                "attributes=" + attributes +
                '}';
    }
}
