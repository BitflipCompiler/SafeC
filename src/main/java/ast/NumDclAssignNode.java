package ast;

import ast.abstracts.Aexpr;
import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import ast.abstracts.VDclAssign;
import visitor.ASTVisitor;

public class NumDclAssignNode extends VDclAssign {
    public NumDclNode numdecl;
    public Aexpr aexpr;

    public NumDclAssignNode(Node numdecl, Node aexpr) {
        this.numdecl = (NumDclNode) numdecl;
        this.aexpr = (Aexpr) aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
