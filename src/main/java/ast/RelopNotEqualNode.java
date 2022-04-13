package ast;

import ast.abstracts.Aexpr;
import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class RelopNotEqualNode extends Bexpr {
    public Aexpr leftChild;
    public Aexpr rightChild;

    public RelopNotEqualNode(Node leftChild, Node rightChild) {
        this.leftChild = (Aexpr) leftChild;
        this.rightChild = (Aexpr) rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
