package ast;

import ast.abstracts.Node;
import ast.abstracts.Vals;
import visitor.ASTVisitor;

public class ScaseNode extends Node {
    public Vals vals;
    public Node caseblock;

    public ScaseNode(Node vals, Node caseblock) {
        this.vals = (Vals) vals;
        this.caseblock = caseblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
