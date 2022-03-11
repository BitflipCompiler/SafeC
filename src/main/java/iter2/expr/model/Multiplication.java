package iter2.expr.model;

public class Multiplication extends Expression{
    Expression left;
    Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = left;
    }

    @Override
    public String toString() {
        return left.toString()+ " * " + right.toString();
    }
}
