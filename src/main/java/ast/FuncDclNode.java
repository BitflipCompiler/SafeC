package ast;

import ast.abstracts.Datatype;
import ast.abstracts.Dcl;
import ast.abstracts.Node;
import visitor.ASTVisitor;

public class FuncDclNode extends Dcl {
    public Datatype datatype;
    public String id;
    public Node params;
    public Node funcblock;
    //Constructor with params
    public FuncDclNode(Node datatype, String id, Node params, Node funcblock) {
        this.datatype = (Datatype) datatype;
        this.id = id;
        this.params = params;
        this.funcblock = funcblock;
    }
    //Constructor without params
    public FuncDclNode(Node datatype, String id, Node funcblock) {
        this.datatype = (Datatype) datatype;
        this.id = id;
        this.funcblock = funcblock;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
