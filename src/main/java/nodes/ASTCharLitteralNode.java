package nodes;

import nodes.abstracts.ASTDatatype;
import visitor.ASTVisitor;

public class ASTCharLitteralNode extends ASTDatatype {

    public ASTCharLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
