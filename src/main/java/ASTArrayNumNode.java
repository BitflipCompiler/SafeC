public class ASTArrayNumNode extends ASTArray{
    String id;
    ASTNode numArray;

    public ASTArrayNumNode(String id, ASTNode numArray) {
        this.id = id;
        this.numArray = numArray;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
