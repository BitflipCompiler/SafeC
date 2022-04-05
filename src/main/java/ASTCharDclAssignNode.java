public class ASTCharDclAssignNode extends ASTDclAssign{
    ASTNode charDcl;
    ASTCharValNode charval;

    public ASTCharDclAssignNode(ASTNode charDcl, ASTCharValNode charval) {
        this.charDcl = charDcl;
        this.charval = charval;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
