package nodes;

import nodes.abstracts.ASTAexpr;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTModNode extends ASTAexpr {
    public ASTNode leftChild;
    public ASTNode rightChild;

    public ASTModNode(ASTNode leftChild, ASTNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
