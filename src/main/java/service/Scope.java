package service;

import java.util.ArrayList;

public class Scope {
    public final ArrayList<Attributes> attributes = new ArrayList<>();
    public Scope parent;

    public Scope() {

    }

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
