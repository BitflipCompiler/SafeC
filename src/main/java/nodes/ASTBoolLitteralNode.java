package nodes;

import nodes.abstracts.ASTDatatype;
import visitor.ASTVisitor;

public class ASTBoolLitteralNode extends ASTDatatype {

    public ASTBoolLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
