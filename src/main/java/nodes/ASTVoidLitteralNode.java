package nodes;

import nodes.abstracts.ASTDatatype;
import visitor.ASTVisitor;

public class ASTVoidLitteralNode extends ASTDatatype {

    public ASTVoidLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
