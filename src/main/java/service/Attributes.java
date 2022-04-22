package service;


import java.util.Objects;

public class Attributes {
    String name;
    Type type;
    int level;
    int depth;
    Attributes prevSymbol;
    int safelvl;
    boolean isformalparam;

    public Attributes(String name, Type type,Boolean isformalparam) {
        this.name = name;
        this.type = type;
        this.isformalparam = isformalparam;
    }



    public Type getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attributes that = (Attributes) o;
        return level == that.level && depth == that.depth && safelvl == that.safelvl && Objects.equals(name, that.name) && type == that.type && Objects.equals(prevSymbol, that.prevSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, level, depth, prevSymbol, safelvl);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                "type=" + type +
                ", level=" + level +
                ", depth=" + depth +
                ", isparam=" + isformalparam +
                ", prevSymbol="  + prevSymbol +
                "}\n";
    }
}
