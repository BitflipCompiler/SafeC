package nodes;

import nodes.abstracts.ASTDatatype;
import visitor.ASTVisitor;

public class ASTStringLitteralNode extends ASTDatatype {

    public ASTStringLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
