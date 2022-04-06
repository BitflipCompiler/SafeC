package nodes;

import nodes.abstracts.ASTDcl;
import visitor.ASTVisitor;

public class ASTBoolDclNode extends ASTDcl {

    public String id;

    public ASTBoolDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
