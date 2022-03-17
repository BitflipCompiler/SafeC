package iter2.expr.model;

/*
 * source: Jackie Wang, Youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */
public class Number extends Expression{
    int num;

    public Number(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
