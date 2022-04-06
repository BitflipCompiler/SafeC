package ast.abstracts;

import visitor.ASTVisitor;

public class FuncCalls extends Node {
    public String id;
    public Node callparams;

    public FuncCalls(String id) {
        this.id = id;
    }

    public FuncCalls(String id, Node callparams) {
        this.id = id;
        this.callparams = callparams;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
