package service;

import ast.abstracts.Node;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FuncAttributes extends Attributes{
    Node block;
    LinkedHashMap<String,Type> formalParams;
    String returnValue;


    public FuncAttributes(String name, Type type, Boolean isformalparam, Node block, LinkedHashMap<String,Type> formalParams, String returnValue) {
        super(name, type, isformalparam);
        this.block = block;
        this.formalParams = formalParams;
        this.returnValue = returnValue;
    }

    public LinkedHashMap<String,Type> getFormalParams() {
        return formalParams;
    }

    public Node getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return "FuncAttributes{" +
                "block=" + block +
                ", formalParams=" + formalParams +
                '}';
    }
}
