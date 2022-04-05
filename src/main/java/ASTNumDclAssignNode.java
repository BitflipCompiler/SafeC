public class ASTNumDclAssignNode extends ASTDclAssign{
    ASTNode numdecl;
    ASTNode aexpr;

    public ASTNumDclAssignNode(ASTNode numdecl, ASTNode aexpr) {
        this.numdecl = numdecl;
        this.aexpr = aexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
