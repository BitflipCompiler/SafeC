package expr.model;

/*
 * source: Jackie Wang, Youtube: https://www.youtube.com/watch?v=zo_oiHzKLqw&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=4
 */
public class VariableDeclaration extends Expression{
    public String id;
    public String type;
    public int value;

    public VariableDeclaration(String id, String type, int value){
        this.id = id;
        this.type = type;
        this.value = value;
    }



}
