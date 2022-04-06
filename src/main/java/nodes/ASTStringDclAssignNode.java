package nodes;

import nodes.abstracts.ASTDclAssign;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTStringDclAssignNode extends ASTDclAssign {
    public ASTNode stringdcl;
    public ASTStringValNode stringval;

    public ASTStringDclAssignNode(ASTNode stringdcl, ASTStringValNode stringval) {
        this.stringdcl = stringdcl;
        this.stringval = stringval;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
