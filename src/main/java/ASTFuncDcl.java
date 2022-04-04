public class ASTFuncDcl extends ASTNode{
    ASTNode dataytype;
    String id;
    ASTNode params;
    ASTNode funcblock;

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
