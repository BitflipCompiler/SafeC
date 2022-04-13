package ast;

import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class NotNode extends Bexpr {
    public Bexpr value;

    public NotNode(Node value) {
        this.value = (Bexpr) value;
    }
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
