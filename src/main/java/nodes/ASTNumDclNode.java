package nodes;

import nodes.abstracts.ASTDcl;
import visitor.ASTVisitor;

public class ASTNumDclNode extends ASTDcl {

    public String id;

    public ASTNumDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
