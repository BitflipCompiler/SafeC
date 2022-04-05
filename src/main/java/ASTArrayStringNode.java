public class ASTArrayStringNode extends ASTArray{
    String id;
    ASTNode stringArray;

    public ASTArrayStringNode(String id, ASTNode stringArray) {
        this.id = id;
        this.stringArray = stringArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
