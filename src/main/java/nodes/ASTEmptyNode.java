package nodes;

import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTEmptyNode extends ASTNode {

    public ASTEmptyNode() {
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
