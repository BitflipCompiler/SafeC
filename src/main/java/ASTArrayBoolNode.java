public class ASTArrayBoolNode extends ASTNode{
    String id;
    ASTNode boolArray;

    public ASTArrayBoolNode(String id, ASTNode boolArray) {
        this.id = id;
        this.boolArray = boolArray;
    }


    @Override
    public void accept(ASTVisitor v) {

    }
}
