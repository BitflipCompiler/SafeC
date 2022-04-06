package ast;

import ast.abstracts.Datatype;
import visitor.ASTVisitor;

public class CharLitteralNode extends Datatype {

    public CharLitteralNode() {
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
