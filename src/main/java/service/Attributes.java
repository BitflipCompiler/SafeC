package service;


public class Attributes {
    String name;
    Type type;
    int scopeDepth;
    int safelvl;

    public Attributes(String name, Type type) {
        this.name = name;
        this.type = type;
    }



    public Type getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Attributes{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", scopeDepth=" + scopeDepth +
                "} \n";
    }
}
