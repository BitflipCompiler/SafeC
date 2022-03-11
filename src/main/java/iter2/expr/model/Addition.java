package iter2.expr.model;

public class Addition extends Expression{
    Expression left;
    Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = left;
    }

    @Override
    public String toString() {
        return left.toString()+ " + " + right.toString();
    }

}
