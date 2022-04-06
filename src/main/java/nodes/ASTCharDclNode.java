package nodes;

import nodes.abstracts.ASTDcl;
import visitor.ASTVisitor;

public class ASTCharDclNode extends ASTDcl {

    public String id;

    public ASTCharDclNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
