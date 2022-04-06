package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTDclAssignSemiCommandNode extends ASTNode {
    public ASTNode actual;
    public ASTNode recursion;

    public ASTDclAssignSemiCommandNode(ASTNode actual, ASTNode recursion) {
        this.actual = actual;
        this.recursion = recursion;
    }

    public ASTDclAssignSemiCommandNode(ASTNode actual) {
        this.actual = actual;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
