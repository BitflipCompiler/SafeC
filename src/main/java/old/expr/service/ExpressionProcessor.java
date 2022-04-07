package old.expr.service;

import expr.nodes.*;
import old.expr.nodes.*;
import old.expr.nodes.Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Source: Jackie Wang Youtube: https://www.youtube.com/watch?v=6uF1Nxo2xjk&list=PL5dxAmCmjv_4FGYtGzcvBeoS-BobRTJLq&index=5
 */
//TODO move this file out of model, cant be done right now since its accesing files out of scope
public class ExpressionProcessor {
    public List<Expression> list;
    public Map<String, Integer> values; //Symbol table for storing the symbol variables

    public ExpressionProcessor(List<Expression> list){
        this.list = list;
        values = new HashMap<>();
    }

    public List<String> getEvaluationResults(){
        List<String> evaluations = new ArrayList<>();

        for(Expression e: list) {
            if(e instanceof VariableDeclaration){
                VariableDeclaration decl = (VariableDeclaration) e;
                values.put(decl.id, decl.value);

            }else {
                //e instanceof Number, Variable, Addition, Subtraction
                String input = e.toString();
                int result = getEvalResult(e);
                evaluations.add(input + " is " + result);
            }
        }

        return evaluations;
    }

    private int getEvalResult(Expression e){
        int result = 0;

        if(e instanceof Number){
            Number num = (Number) e;
            result = num.num;
        }else if(e instanceof Variable){
            Variable var = (Variable) e;
            result = values.get(var.id);
        }else if(e instanceof Addition){
            Addition add = (Addition) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = left + right;
        }else {
            //e instance of Muliplication
            Multiplication add = (Multiplication) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = left * right;
        }
        return result;
    }

}
