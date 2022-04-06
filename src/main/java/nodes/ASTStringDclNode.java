package nodes;

import nodes.abstracts.ASTDcl;
import visitor.ASTVisitor;

public class ASTStringDclNode extends ASTDcl {
    public String id;

    public ASTStringDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
