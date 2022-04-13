package ast;

import ast.abstracts.Iterative;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class ForLoopNode extends Iterative {

    public Node forparams;
    public Node block;

    public ForLoopNode(Node forparams, Node block) {
        this.forparams = forparams;
        this.block = block;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
