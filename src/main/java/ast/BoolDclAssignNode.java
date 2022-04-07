package ast;

import ast.abstracts.DclAssign;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class BoolDclAssignNode extends DclAssign {
    public Node boolDcl;
    public Node bexpr;

    public BoolDclAssignNode(Node boolDcl, Node bexpr) {
        this.boolDcl = boolDcl;
        this.bexpr = bexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
