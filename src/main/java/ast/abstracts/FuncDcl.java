package ast.abstracts;

import visitor.ASTVisitor;

import java.util.ArrayList;

public class FuncDcl extends Node {
    public Node datatype;
    public String id;
    public Node params;
    public Node funcblock;
    public ArrayList<String> formalParams;

    public FuncDcl(Node datatype, String id, Node params, Node funcblock, ArrayList<String> formalParams) {
        this.datatype = datatype;
        this.id = id;
        this.params = params;
        this.funcblock = funcblock;
        this.formalParams = formalParams;
    }

    public FuncDcl(Node datatype, String id, Node funcblock) {
        this.datatype = datatype;
        this.id = id;
        this.funcblock = funcblock;
    }

    public ArrayList<String> getFormalParams() {
        return formalParams;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
