package nodes.abstracts;

import visitor.ASTVisitor;

public class ASTForParams extends ASTNode {
    public ASTNode numdclassign;
    public ASTNode bexpr;
    public String id;
    public ASTNode aexpr;

    public ASTForParams(ASTNode numdclassign, ASTNode bexpr, String id, ASTNode aexpr) {
        this.numdclassign = numdclassign;
        this.bexpr = bexpr;
        this.id = id;
        this.aexpr = aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
