package iter2.expr.model;

public class Variable extends Expression{
    String id;

    public Variable(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
