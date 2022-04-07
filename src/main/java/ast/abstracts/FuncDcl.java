package ast.abstracts;

import visitor.ASTVisitor;

public class FuncDcl extends Node {
    public Node datatype;
    public String id;
    public Node params;
    public Node funcblock;

    public FuncDcl(Node datatype, String id, Node params, Node funcblock) {
        this.datatype = datatype;
        this.id = id;
        this.params = params;
        this.funcblock = funcblock;
    }

    public FuncDcl(Node datatype, String id, Node funcblock) {
        this.datatype = datatype;
        this.id = id;
        this.funcblock = funcblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
