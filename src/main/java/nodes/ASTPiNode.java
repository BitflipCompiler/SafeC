package nodes;

import nodes.abstracts.ASTNumberval;
import visitor.ASTVisitor;

public class ASTPiNode extends ASTNumberval {

    public ASTPiNode() {
    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
