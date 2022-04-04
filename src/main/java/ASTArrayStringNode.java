public class ASTArrayStringNode extends ASTNode{
    String id;
    ASTNode stringArray;

    public ASTArrayStringNode(String id, ASTNode stringArray) {
        this.id = id;
        this.stringArray = stringArray;
    }


    @Override
    public void accept(ASTVisitor v) {

    }
}
