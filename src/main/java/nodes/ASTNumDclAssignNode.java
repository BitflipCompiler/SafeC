package nodes;

import nodes.abstracts.ASTDclAssign;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTNumDclAssignNode extends ASTDclAssign {
    public ASTNode numdecl;
    public ASTNode aexpr;

    public ASTNumDclAssignNode(ASTNode numdecl, ASTNode aexpr) {
        this.numdecl = numdecl;
        this.aexpr = aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
