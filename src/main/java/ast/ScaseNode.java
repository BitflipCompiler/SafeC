package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ScaseNode extends Node {
    public Node vals;
    public Node caseblock;

    public ScaseNode(Node vals, Node caseblock) {
        this.vals = vals;
        this.caseblock = caseblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
