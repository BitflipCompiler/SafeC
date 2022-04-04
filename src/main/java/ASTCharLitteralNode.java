public class ASTCharLitteralNode extends ASTNode{

    public ASTCharLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
