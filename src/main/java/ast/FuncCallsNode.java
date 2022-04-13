package ast;

import ast.abstracts.Callparems;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class FuncCallsNode extends Node {
    public String id;
    public Callparems callparams;

    public FuncCallsNode(String id) {
        this.id = id;
    }

    public FuncCallsNode(String id, Node callparams) {
        this.id = id;
        this.callparams = (Callparems) callparams;
    }


    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
