package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTScaseNode extends ASTNode {
    public ASTNode vals;
    public ASTNode caseblock;

    public ASTScaseNode(ASTNode vals, ASTNode caseblock) {
        this.vals = vals;
        this.caseblock = caseblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
