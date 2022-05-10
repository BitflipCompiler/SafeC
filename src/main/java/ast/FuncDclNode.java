package ast;

import ast.abstracts.Datatype;
import ast.abstracts.Node;
import service.Type;
import visitor.ASTVisitor;

import javax.xml.crypto.Data;
import java.util.LinkedHashMap;

public class FuncDclNode extends Node {
    public Datatype datatype;
    public String id;
    public Node params;
    public FuncBlockNode funcblock;
    public LinkedHashMap<String, Type> formalParams;
    public String returnValue;

    public FuncDclNode(Datatype datatype, String id, Node params, FuncBlockNode funcblock, String returnValue, LinkedHashMap<String,Type> formalParams) {
        this.datatype = datatype;
        this.id = id;
        this.params = params;
        this.funcblock = funcblock;
        this.formalParams = formalParams;
        this.returnValue = returnValue;
    }

    public FuncDclNode(Datatype datatype, String id, FuncBlockNode funcblock, String returnValue) {
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
