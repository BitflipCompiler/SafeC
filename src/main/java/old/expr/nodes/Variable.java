package old.expr.nodes;

/*
 * source: Jackie Wang, Youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */
public class Variable extends Expression{
    public String id;

    public Variable(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
