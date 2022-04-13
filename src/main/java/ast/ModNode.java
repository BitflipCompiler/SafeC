package ast;

import ast.abstracts.Aexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ModNode extends Aexpr {
    public Aexpr leftChild;
    public Aexpr rightChild;

    public ModNode(Node leftChild, Node rightChild) {
        this.leftChild = (Aexpr) leftChild;
        this.rightChild = (Aexpr) rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
