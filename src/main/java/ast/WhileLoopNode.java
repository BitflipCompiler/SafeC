package ast;

import ast.abstracts.Bexpr;
import ast.abstracts.Node;
import ast.abstracts.Selective;
import visitor.ASTVisitor;

public class WhileLoopNode extends Selective {
    public Bexpr bexpr;
    public Node block;

    public WhileLoopNode(Node bexpr, Node block) {
        this.bexpr = (Bexpr) bexpr;
        this.block = block;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
