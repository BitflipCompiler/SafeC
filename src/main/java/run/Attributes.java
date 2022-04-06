package run;


public class Attributes {
    String name;
    //run.Type type;
    int scopeDepth;

    public Attributes(String name) {
        this.name = name;
     //   this.type = type;
    }

    /*public run.Type getType() {
        return type;
    }
*/    @Override
    public String toString() {
        return "run.Attributes{" +
                "name='" + name + '\'' +
               // ", type=" + type +
                ", scopeDepth=" + scopeDepth +
                '}';
    }
}
