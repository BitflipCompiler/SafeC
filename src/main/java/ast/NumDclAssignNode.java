package ast;

import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class NumDclAssignNode extends DclAssign {
    public Node numdecl;
    public Node aexpr;

    public NumDclAssignNode(Node numdecl, Node aexpr) {
        this.numdecl = numdecl;
        this.aexpr = aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
