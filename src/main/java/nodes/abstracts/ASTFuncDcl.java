package nodes.abstracts;

import visitor.ASTVisitor;

public class ASTFuncDcl extends ASTNode {
    public ASTNode dataytype;
    public String id;
    public ASTNode params;
    public ASTNode funcblock;

    public ASTFuncDcl(ASTNode dataytype, String id, ASTNode params, ASTNode funcblock) {
        this.dataytype = dataytype;
        this.id = id;
        this.params = params;
        this.funcblock = funcblock;
    }

    public ASTFuncDcl(ASTNode dataytype, String id, ASTNode funcblock) {
        this.dataytype = dataytype;
        this.id = id;
        this.funcblock = funcblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
