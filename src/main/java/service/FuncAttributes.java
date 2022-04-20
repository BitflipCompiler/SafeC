package service;

import ast.abstracts.Node;

public class FuncAttributes extends Attributes{
    Node block;
    Node formalParams;


    public FuncAttributes(String name, Type type, Boolean isformalparam, Node block, Node formalParams) {
        super(name, type, isformalparam);
        this.block = block;
        this.formalParams = formalParams;
    }

    @Override
    public String toString() {
        return "FuncAttributes{" +
                "block=" + block +
                ", formalParams=" + formalParams +
                '}';
    }
}
