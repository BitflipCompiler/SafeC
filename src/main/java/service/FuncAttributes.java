package service;

import ast.abstracts.Node;

import java.util.ArrayList;

public class FuncAttributes extends Attributes{
    Node block;
    ArrayList<Type> formalParams;


    public FuncAttributes(String name, Type type, Boolean isformalparam, Node block, ArrayList<Type> formalParams) {
        super(name, type, isformalparam);
        this.block = block;
        this.formalParams = formalParams;
    }

    public ArrayList<Type> getFormalParams() {
        return formalParams;
    }

    @Override
    public String toString() {
        return "FuncAttributes{" +
                "block=" + block +
                ", formalParams=" + formalParams +
                '}';
    }
}
