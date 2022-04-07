package expr.nodes;

/*
 * source: Jackie Wang, Youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */
public class Multiplication extends Expression{
    public Expression left;
    public Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = left;
    }

    @Override
    public String toString() {
        return left.toString()+ " * " + right.toString();
    }
}
