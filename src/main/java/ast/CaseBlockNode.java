package ast;

import ast.abstracts.Node;
import visitor.ASTVisitor;

public class CaseBlockNode extends Node {
    public Node dclAssignCommand;
    public String optbreak;

    public CaseBlockNode(Node dclAssignCommand, String optbreak) {
        this.dclAssignCommand = dclAssignCommand;
        this.optbreak = optbreak;
    }

    public CaseBlockNode(Node dclAssignCommand) {
        this.dclAssignCommand = dclAssignCommand;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
