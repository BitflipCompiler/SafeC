public class ASTStringLitteralNode extends ASTNode{

    public ASTStringLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
