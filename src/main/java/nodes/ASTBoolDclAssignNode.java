package nodes;

import nodes.abstracts.ASTDclAssign;
import nodes.abstracts.ASTNode;
import visitor.ASTVisitor;

public class ASTBoolDclAssignNode extends ASTDclAssign {
    public ASTNode boolDcl;
    public ASTNode bexpr;

    public ASTBoolDclAssignNode(ASTNode boolDcl, ASTNode bexpr) {
        this.boolDcl = boolDcl;
        this.bexpr = bexpr;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
