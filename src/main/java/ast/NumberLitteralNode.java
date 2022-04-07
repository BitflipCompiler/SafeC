package ast;


import ast.abstracts.Datatype;
import visitor.ASTVisitor;

public class NumberLitteralNode extends Datatype {

    public NumberLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
