package nodes;

import nodes.abstracts.ASTBexpr;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTNotNode extends ASTBexpr {
    public ASTNode value;

    public ASTNotNode(ASTNode value) {
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
