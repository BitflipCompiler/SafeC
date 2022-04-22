package ast;

import ast.abstracts.Node;
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
    public String returnValue;

    public FuncDcl(Node datatype, String id, Node params, Node funcblock, String returnValue, LinkedHashMap<String,Type> formalParams) {
        this.datatype = datatype;
        this.id = id;
        this.params = params;
        this.funcblock = funcblock;
        this.formalParams = formalParams;
        this.returnValue = returnValue;
    }

    public FuncDcl(Node datatype, String id, Node funcblock, String returnValue) {
        this.datatype = datatype;
        this.id = id;
        this.funcblock = funcblock;
        this.returnValue = returnValue;
    }

    public LinkedHashMap<String,Type> getFormalParams() {
        return formalParams;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
