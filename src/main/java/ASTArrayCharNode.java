public class ASTArrayCharNode extends ASTArray{
    String id;
    ASTNode charArray;

    public ASTArrayCharNode(String id, ASTNode charArray) {
        this.id = id;
        this.charArray = charArray;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
