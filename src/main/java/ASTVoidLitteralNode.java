public class ASTVoidLitteralNode extends ASTNode{

    public ASTVoidLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
