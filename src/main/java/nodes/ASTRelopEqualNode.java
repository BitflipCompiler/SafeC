package nodes;

import nodes.abstracts.ASTBexpr;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTRelopEqualNode extends ASTBexpr {
    public ASTNode leftChild;
    public ASTNode rightChild;

    public ASTRelopEqualNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
