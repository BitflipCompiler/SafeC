public class ASTArrayBoolNode extends ASTArray{
    String id;
    ASTNode boolArray;

    public ASTArrayBoolNode(String id, ASTNode boolArray) {
        this.id = id;
        this.boolArray = boolArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
