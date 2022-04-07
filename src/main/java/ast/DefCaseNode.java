package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class DefCaseNode extends Node {
    public Node caseblock;


    public DefCaseNode(Node caseblock) {
        this.caseblock = caseblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
