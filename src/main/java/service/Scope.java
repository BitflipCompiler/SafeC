package service;

import java.util.ArrayList;

public class Scope {
    public final ArrayList<Attributes> attributes = new ArrayList<>();

    public Scope() {
    }

    public boolean isAttributeInScope(Attributes attribute){
        for (Attributes symbol: this.attributes) {
            if (symbol.name == attribute.name){
                return true;
            }
        }
        return false;
    }

    public void addAttribute(Attributes attribute){
        this.attributes.add(attribute);
    }
}
