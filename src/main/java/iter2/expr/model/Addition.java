package iter2.expr.model;

/*
 * source: Jackie Wang, Youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */
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
