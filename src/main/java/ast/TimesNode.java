package ast;

import ast.abstracts.Aexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class TimesNode extends Aexpr {
    public Aexpr leftChild;
    public Aexpr rightChild;

    public TimesNode(Node leftChild, Node rightChild) {
        this.leftChild = (Aexpr) leftChild;
        this.rightChild = (Aexpr) rightChild;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
