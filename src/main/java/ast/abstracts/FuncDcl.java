package ast.abstracts;

import service.Type;
import visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FuncDcl extends Node {
    public Node datatype;
    public String id;
    public Node params;
    public Node funcblock;
    public LinkedHashMap<String, Type> formalParams;

    public FuncDcl(Node datatype, String id, Node params, Node funcblock, LinkedHashMap<String,Type> formalParams) {
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

    public LinkedHashMap<String,Type> getFormalParams() {
        return formalParams;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
