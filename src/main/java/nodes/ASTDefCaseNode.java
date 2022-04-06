package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTDefCaseNode extends ASTNode {
    public ASTNode caseblock;


    public ASTDefCaseNode(ASTNode caseblock) {
        this.caseblock = caseblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
