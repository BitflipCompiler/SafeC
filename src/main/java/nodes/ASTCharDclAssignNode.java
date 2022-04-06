package nodes;

import nodes.abstracts.ASTDclAssign;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTCharDclAssignNode extends ASTDclAssign {
    public ASTNode charDcl;
    public ASTCharValNode charval;

    public ASTCharDclAssignNode(ASTNode charDcl, ASTCharValNode charval) {
        this.charDcl = charDcl;
        this.charval = charval;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
