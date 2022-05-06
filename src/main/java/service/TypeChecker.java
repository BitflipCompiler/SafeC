package service;

import ast.*;
import ast.abstracts.*;
import exceptions.AssignTypeCheckException;
import exceptions.IdTypeCheckException;
import exceptions.IllegalTypeException;
import exceptions.ParamSizeException;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class {@link TypeChecker} is resposible for checking that the Types in the inout are correct.
 * If the types are missmatched an exeption will be thrown.
 */

public class TypeChecker extends SymbolTableFill {

    public ArrayList<Type> actualParams = new ArrayList<>();
    public ArrayList<Type> formalParams = new ArrayList<>();


    public TypeChecker(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public void visit(ProgNode ctx) {
    }

    @Override
    public void visit(SafeDclNode ctx) {
    }

    @Override
    public void visit(StructBlockNode ctx) {

    }

    @Override
    public void visit(StructDclNode ctx) {
    }

    @Override
    public void visit(FuncDclNode ctx) {
    }

    @Override
    public void visit(FormalParamsNode ctx) {
    }

    @Override
    public void visit(FuncBlockNode ctx) {
        visit(ctx.dclAssignSemiCommand);
    }

    @Override

    public void visit(FuncCallsNode ctx) {
        FuncAttributes foundFunc = (FuncAttributes) symbolTable.retrieveSymbol(ctx.id);
        Map<String, Type> formalParams = foundFunc.getFormalParams();
        //Hvis der ikke er nogle actual params skal vi ikke visit.
        if (ctx.actualParamsNode != null) {
            visit(ctx.actualParamsNode);
            int i = 0;
            if(actualParams.size() == formalParams.size()){
                for (Map.Entry<String, Type> formalparam : formalParams.entrySet()) {
                    if (formalparam.getValue() != actualParams.get(i)) {
                        throw new IllegalTypeException("actual param: " + actualParams.get(i) +
                                " different than: " + formalparam.getValue() +
                                "at line: " + ctx.getLineNumber(), ctx.getLineNumber(), actualParams.get(i), formalparam.getValue());
                    }
                    i++;
                }
            }else{
                throw new ParamSizeException("Actual params size: "  + actualParams.size() +
                        " Formal params size: " + " " + formalParams.size() +
                        "at line: " + lineNumber, lineNumber, actualParams.size(), formalParams.size());
            }
        }

    }

    @Override
    public void visit(ActualParamsNode ctx) {
        for (Node node : ctx.vals) {
            visit(node);
        }
    }

    @Override
    public void visit(IfStatementNode ctx) {

    }

    @Override
    public void visit(SwitchStatementNode ctx) {

    }

    @Override
    public void visit(ScaseNode ctx) {

    }

    @Override
    public void visit(CaseBlockNode ctx) {

    }

    @Override
    public void visit(DefCaseNode ctx) {

    }

    @Override
    public void visit(WhileLoopNode ctx) {

    }

    @Override
    public void visit(ForLoopNode ctx) {
    }

    @Override
    public void visit(ForParamsNode ctx) {
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {

    }

    @Override
    public void visit(AssignNode ctx) {
        Attributes foundId = symbolTable.retrieveSymbol(ctx.id.getId());
        Map.Entry<String, Type> formalparams = symbolTable.checkFormalParams(ctx.id.getId());
        String atypesNormal = ctx.atypes.getClass().getSimpleName();


        if (ctx.atypes instanceof FuncCallsNode) {
            FuncCallsNode funcDcl = (FuncCallsNode) ctx.atypes;
            FuncAttributes foundFunc = (FuncAttributes) symbolTable.retrieveSymbol(funcDcl.id);

            if (foundId.type.equals(foundFunc.type)) {
                visit(ctx.atypes);
            } else {
                throw new IllegalTypeException("Function call error: Type: " + foundId.type +
                        "different from type: " + foundFunc.type +
                        " at line: " + ctx.getLineNumber(), lineNumber, foundId.type, foundFunc.type);
            }

        }else if(ctx.atypes instanceof IdNode){
            if(formalparams == null){

            }
            else if(foundId.type == formalparams.getValue()){
                //visit(ctx.atypes);

            }else{
                throw new IdTypeCheckException("Type : "+ foundId.type +
                        " does not match with type " + formalparams.getValue() +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), foundId.name);
            }

        }else {
            if (formalparams == null) {
                evalAssign(ctx, foundId.type);
            } else {
                evalAssign(ctx, formalparams.getValue());
            }
        }
    }

    private void evalAssign(AssignNode ctx, Type type ) {
        String atypesNormal = ctx.atypes.getClass().getSimpleName();
        String atypesSuper = ctx.atypes.getClass().getSuperclass().getSimpleName();
        //TODO there is something that is not working with all results, (IdNode)
        /*if(atypesNormal.equals("IdNode")){
            visit(ctx.atypes);
        }*/
        if (ctx.atypes instanceof Aexpr) {
            if (type == Type.Number) {
                visit(ctx.atypes);
            } else {
                throw new IllegalTypeException("Illegal assignment type: " + type +
                        " and Number at line: " + ctx.getLineNumber(), ctx.getLineNumber(), type, Type.Number);
            }
        } else if (ctx.atypes instanceof Bexpr) {
            if (type == Type.Boolean) {
                visit(ctx.atypes);
            } else {
                throw new IllegalTypeException("Illegal assignment type: " + type +
                        " and {Number, Boolean} at line: " + ctx.getLineNumber(), ctx.getLineNumber(), type,Type.Boolean);
            }
        } else if (ctx.atypes instanceof ArrayData) {
            if (type == Type.Number || type == Type.Char || type == Type.String || type == Type.Boolean) {
                visit(ctx.atypes);
            } else {
                throw new IllegalTypeException("Illegal assignment type: " + type +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), type, Type.Void);
            }
        } else if (type == Type.Char && ctx.atypes instanceof CharValNode) {

        } else if (type == Type.String && ctx.atypes instanceof StringValNode) {

        } else {
            throw new AssignTypeCheckException("Type " + type +
                    " does not match with normal type " + getDataType(atypesNormal).toString() +
                    " at line :" + ctx.getLineNumber(), ctx.getLineNumber(), type.toString(), atypesNormal, atypesSuper);
        }
    }

    @Override
    public void visit(ArrayBoolNode ctx) {

    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {

    }

    @Override
    public void visit(ArrayCharNode ctx) {

    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {

    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        Type arrayType = getDataType(ctx.arrdcltype.toString());
        formalParams.add(arrayType);
        symbolTable.enterSymbol(new Attributes(ctx.id, arrayType, true));
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        visit(ctx);
    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {

    }

    @Override
    public void visit(ArrayStringNode ctx) {

    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {

    }

    @Override
    public void visit(CharDclAssignNode ctx) {

    }

    @Override
    public void visit(CharDclNode ctx) {
        formalParams.add(Type.Char);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Char, true));
    }

    @Override
    public void visit(NumDclAssignNode ctx) {

    }

    @Override
    public void visit(NumDclNode ctx) {
        //TODO: Få Id til at være en del af formalParams.
        formalParams.add(Type.Number);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Number, true));
    }

    @Override
    public void visit(StringDclAssignNode ctx) {

    }

    @Override
    public void visit(StringDclNode ctx) {
        formalParams.add(Type.String);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.String, true));
    }

    @Override
    public void visit(NumberLitteralNode ctx) {

    }

    @Override
    public void visit(StringLitteralNode ctx) {

    }

    @Override
    public void visit(BoolLitteralNode ctx) {

    }

    @Override
    public void visit(VoidLitteralNode ctx) {

    }


    @Override
    public void visit(BoolDclAssignNode ctx) {

    }

    @Override
    public void visit(BoolDclNode ctx) {
        formalParams.add(Type.Boolean);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Boolean, true));
    }

    @Override
    public void visit(NotNode ctx) {

    }

    @Override
    public void visit(AndNode ctx) {

    }

    @Override
    public void visit(OrNode ctx) {

    }

    @Override
    public void visit(RelopEqualNode ctx) {

    }

    @Override
    public void visit(RelopNotEqualNode ctx) {

    }

    @Override
    public void visit(RelopLeqNode ctx) {

    }

    @Override
    public void visit(RelopGeqNode ctx) {

    }

    @Override
    public void visit(RelopLessNode ctx) {

    }

    @Override
    public void visit(RelopGreaterNode ctx) {

    }

    @Override
    public void visit(IdBoolValNode ctx) {

    }

    @Override
    public void visit(BoolValNode ctx) {
        actualParams.add(Type.Boolean);
    }

    @Override
    public void visit(DivisionNode ctx) {
 /*       String leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSimpleName();
        String rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSimpleName();

        try {
            if (leftchildSuper.equals("Numberval")) {
                leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (rightchildSuper.equals("Numberval")) {
                rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (leftchildSuper.equals("Aexpr") && rightchildSuper.equals("Aexpr")) {
                System.out.println("Division");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }

    @Override
    public void visit(IdNode ctx) {
        Attributes foundId = symbolTable.retrieveSymbol(ctx.id);
        actualParams.add(foundId.type);
    }

    @Override
    public void visit(MinusNode ctx) {
/*        String leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSimpleName();
        String rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSimpleName();

        try {
            if (leftchildSuper.equals("Numberval")) {
                leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (rightchildSuper.equals("Numberval")) {
                rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (leftchildSuper.equals("Aexpr") && rightchildSuper.equals("Aexpr")) {
                System.out.println("Minus");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }

    @Override
    public void visit(ModNode ctx) {
   /*     String leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSimpleName();
        String rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSimpleName();

        try {
            if (leftchildSuper.equals("Numberval")) {
                leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (rightchildSuper.equals("Numberval")) {
                rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (leftchildSuper.equals("Aexpr") && rightchildSuper.equals("Aexpr")) {
                System.out.println("Mod");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }


    @Override
    public void visit(NumvalNode ctx) {
        actualParams.add(Type.Number);
    }

    @Override
    public void visit(PiNode ctx) {
        actualParams.add(Type.Number);
    }

    @Override
    public void visit(PlusNode ctx) {

/*
        String leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSimpleName();
        String rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSimpleName();

        try {
            if (leftchildSuper.equals("Numberval")) {
                leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (rightchildSuper.equals("Numberval")) {
                rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (leftchildSuper.equals("Aexpr") && rightchildSuper.equals("Aexpr")) {
                System.out.println("PLus");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
*/


    }

    @Override
    public void visit(TimesNode ctx) {
/*        String leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSimpleName();
        String rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSimpleName();

        try {
            if (leftchildSuper.equals("Numberval")) {
                leftchildSuper = ctx.leftChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (rightchildSuper.equals("Numberval")) {
                rightchildSuper = ctx.rightChild.getClass().getSuperclass().getSuperclass().getSimpleName();
            }
            if (leftchildSuper.equals("Aexpr") && rightchildSuper.equals("Aexpr")) {
                System.out.println("Times");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }

    @Override
    public void visit(CharValNode ctx) {
        actualParams.add(Type.Char);
    }

    @Override
    public void visit(StringValNode ctx) {
        actualParams.add(Type.String);
    }
}
