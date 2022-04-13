package ast;

import ast.NumDclAssignNode;
import ast.abstracts.Aexpr;
import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ForParamsNode extends Node {
    public NumDclAssignNode numdclassign;
    public Bexpr bexpr;
    public String id;
    public Aexpr aexpr;

    public ForParamsNode(Node numdclassign, Node bexpr, String id, Node aexpr) {
        this.numdclassign = (NumDclAssignNode) numdclassign;
        this.bexpr = (Bexpr) bexpr;
        this.id = id;
        this.aexpr = (Aexpr) aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
