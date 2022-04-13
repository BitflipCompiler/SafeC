package ast;

import ast.abstracts.Bexpr;
import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import ast.abstracts.VDclAssign;
import visitor.ASTVisitor;

public class BoolDclAssignNode extends VDclAssign {
    public BoolDclNode boolDcl;
    public Bexpr bexpr;

    public BoolDclAssignNode(Node boolDcl, Node bexpr) {
        this.boolDcl = (BoolDclNode) boolDcl;
        this.bexpr = (Bexpr) bexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
