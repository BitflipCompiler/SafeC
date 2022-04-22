package service;

import ast.abstracts.Node;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FuncAttributes extends Attributes{
    Node block;
    LinkedHashMap<String,Type> formalParams;


    public FuncAttributes(String name, Type type, Boolean isformalparam, Node block, LinkedHashMap<String,Type> formalParams) {
        super(name, type, isformalparam);
        this.block = block;
        this.formalParams = formalParams;
    }

    public LinkedHashMap<String,Type> getFormalParams() {
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
