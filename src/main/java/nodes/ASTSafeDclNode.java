package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTSafeDclNode extends ASTNode {
    public String safety;
    public ASTNode variable;

    public ASTSafeDclNode(String safety, ASTNode variable) {
        this.safety = safety;
        this.variable = variable;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
