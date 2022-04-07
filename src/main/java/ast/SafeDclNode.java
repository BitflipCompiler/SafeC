package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class SafeDclNode extends Node {
    public String safety;
    public Node variable;

    public SafeDclNode(String safety, Node variable) {
        this.safety = safety;
        this.variable = variable;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
