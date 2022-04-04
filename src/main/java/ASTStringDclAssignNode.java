public class ASTStringDclAssignNode extends ASTNode{
    ASTNode stringdcl;
    ASTStringValNode stringval;

    public ASTStringDclAssignNode(ASTNode stringdcl, ASTStringValNode stringval) {
        this.stringdcl = stringdcl;
        this.stringval = stringval;
    }


    @Override
    public void accept(ASTVisitor v) {

    }
}
