package ast;

import ast.abstracts.Node;
import ast.abstracts.Selective;
import visitor.ASTVisitor;

public class WhileLoop extends Selective {
    public Node bexpr;
    public Node block;

    public WhileLoop(Node bexpr, Node block) {
        this.bexpr = bexpr;
        this.block = block;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
