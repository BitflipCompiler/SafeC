public class ASTPiNode extends ASTNumbervalNode{

    public ASTPiNode() {
    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
