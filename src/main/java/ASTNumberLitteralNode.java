public class ASTNumberLitteralNode extends ASTNode{

    public ASTNumberLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
