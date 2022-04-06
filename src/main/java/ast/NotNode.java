package ast;

import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class NotNode extends Bexpr {
    public Node value;

    public NotNode(Node value) {
        this.value = value;
    }
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
