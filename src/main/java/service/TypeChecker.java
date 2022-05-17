package service;

import ast.*;
import ast.abstracts.*;
import exceptions.*;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class {@link TypeChecker} is resposible for checking that the Types in the inout are correct.
 * If the types are missmatched an exeption will be thrown.
 */

public class TypeChecker extends SymbolTableFill {

    public ArrayList<Type> actualParams = new ArrayList<>();
    public ArrayList<Type> formalParams = new ArrayList<>();
    public boolean isAexpr = false;
    public boolean isFuncCall = false;
    public boolean isBexpr = false;

    public TypeChecker(SymbolTable symbolTable, int lineNumber) {
        super(symbolTable);
        this.lineNumber = lineNumber;
    }

    public Type getDataType(String datatype) {
        if (datatype.startsWith("Num")) {
            return Type.Number;
        } else if (datatype.startsWith("Void")) {
            return Type.Void;
        } else if (datatype.startsWith("String")) {
            return Type.String;
        } else if (datatype.startsWith("Bool")) {
            return Type.Boolean;
        } else if (datatype.startsWith("Char")) {
            return Type.Char;
        } else if (datatype.startsWith("Id")) {

        } else {
            throw new InvalidTypeDeclarationException("Datatype not viable: " +
                    datatype, lineNumber, datatype);
        }
        return null;
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
        //if return value is a variable
        if (ctx.funcblock.getReturnValue() instanceof IdNode) {
            IdNode id = (IdNode) ctx.funcblock.getReturnValue();
            Attributes foundId = symbolTable.retrieveSymbol(id.getId());
            if (ctx.datatype instanceof NumberLitteralNode) {
                if (foundId.type != Type.Number) {
                    throw new IllegalTypeException("func datatype: Number" +
                            " not equal to return type: " + ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.Number, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof CharLitteralNode) {
                if (foundId.type != Type.Char) {
                    throw new IllegalTypeException("func datatype: Char" +
                            " not equal to return type: " + ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.Number, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof StringLitteralNode) {
                if (foundId.type != Type.String) {
                    throw new IllegalTypeException("func datatype: String" +
                            " not equal to return type: " + ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.Number, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof BoolLitteralNode) {
                if (foundId.type != Type.Boolean) {
                    throw new IllegalTypeException("func datatype: Boolean" +
                            " not equal to return type: " + ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.Number, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof VoidLitteralNode) {
                //do nothing because of void return type
            } else {
                throw new IllegalTypeException("func datatype: " + ctx.datatype.getClass().getSimpleName() +
                        " not valid." +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                        Type.FuncVoid, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
            }
            //if return value is not a variable
        } else {
            if (ctx.datatype instanceof NumberLitteralNode) {
                if (!(ctx.funcblock.getReturnValue() instanceof Numberval)) {
                    throw new IllegalTypeException("func datatype: Number" +
                            " not equal to return type: " + ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.Number, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof CharLitteralNode) {
                if (!(ctx.funcblock.getReturnValue() instanceof CharValNode)) {
                    throw new IllegalTypeException("func datatype: Char not equal to return type: " +
                            ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.Char, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof StringLitteralNode) {
                if (!(ctx.funcblock.getReturnValue() instanceof StringValNode)) {
                    throw new IllegalTypeException("func datatype: String not equal to return type: " +
                            ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.String, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof BoolLitteralNode) {
                if (!(ctx.funcblock.getReturnValue() instanceof BoolValNode)) {
                    throw new IllegalTypeException("func datatype: Boolean not equal to return type: "
                            + ctx.funcblock.getReturnValue().getClass().getSimpleName() +
                            " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                            Type.Number, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
                }
            } else if (ctx.datatype instanceof VoidLitteralNode) {
                //do nothing because of void
            } else {
                throw new IllegalTypeException("func datatype: " + ctx.datatype.getClass().getSimpleName() +
                        " not valid." +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(),
                        Type.FuncVoid, getDataType(ctx.funcblock.getReturnValue().getClass().getSimpleName()));
            }
        }
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
        isFuncCall = true;
        FuncAttributes foundFunc = (FuncAttributes) symbolTable.retrieveSymbol(ctx.id);
        Map<String, Type> formalParams = foundFunc.getFormalParams();
        //Hvis der ikke er nogle actual params skal vi ikke visit.
        if (ctx.actualParamsNode != null) {
            visit(ctx.actualParamsNode);
            int i = 0;
            if (actualParams.size() == formalParams.size()) {
                for (Map.Entry<String, Type> formalparam : formalParams.entrySet()) {
                    if (formalparam.getValue() != actualParams.get(i)) {
                        throw new IllegalTypeException("actual param: " + actualParams.get(i) +
                                " different than: " + formalparam.getValue() +
                                " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), actualParams.get(i), formalparam.getValue());
                    }
                    i++;
                }
            } else {
                throw new ParamSizeException("Actual params size: " + actualParams.size() +
                        " Formal params size: " + " " + formalParams.size() +
                        "at line: " + lineNumber, lineNumber, actualParams.size(), formalParams.size());
            }
        }
        isFuncCall = false;
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
        /*if(ctx.atypes instanceof Aexpr){
            if(foundId.type.equals(Type.Number)){
                visit(ctx.atypes);
            } else{
                throw new IllegalTypeException("Aexpr assignment error: Type: " + foundId.type +
                        " different from type: " + Type.Number +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), foundId.type, Type.Number);
            }
        } else if (ctx.atypes instanceof Bexpr){
            if(foundId.type.equals(Type.Boolean)){
                visit(ctx.atypes);
            } else {
                throw new IllegalTypeException("Bexpr assignment error: Type: " + foundId.type +
                        " different from type: " + Type.Boolean +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), foundId.type, Type.Boolean);
            }
        } else if(ctx.atypes instanceof CharValNode){
            if(!foundId.type.equals(Type.Char)){
                throw new IllegalTypeException("Char assignment error: Type: " + foundId.type +
                        " different from type: " + Type.Char +
                        " at line: " + ctx.getLineNumber(), lineNumber, foundId.type, Type.Char);
            }
        } else if(ctx.atypes instanceof StringValNode){
            if(!foundId.type.equals(Type.String)){
                throw new IllegalTypeException("String assignment error: Type: " + foundId.type +
                        " different from type: " + Type.String +
                        " at line: " + ctx.getLineNumber(), lineNumber, foundId.type, Type.String);
            }
        } else*/ if(ctx.atypes instanceof FuncCallsNode) {
            FuncCallsNode funcCall = (FuncCallsNode) ctx.atypes;
            FuncAttributes foundFunc = (FuncAttributes) symbolTable.retrieveSymbol(funcCall.id);
            if (foundId.type.equals(foundFunc.type)) {
                visit(ctx.atypes);
            } else {
                throw new IllegalTypeException("Function call error: Type: " + foundId.type +
                        " different from type: " + foundFunc.type +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), foundId.type, foundFunc.type);
            }

        } else if (ctx.atypes instanceof IdNode) {
            if (formalparams == null) {

            } else if (foundId.type == formalparams.getValue()) {
                //visit(ctx.atypes);

            } else {
                throw new IdTypeCheckException("Type : " + foundId.type +
                        " does not match with type " + formalparams.getValue() +
                        " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), foundId.name);
            }

        } else {
            if (formalparams == null) {
                evalAssign(ctx, foundId.type);
            } else {
                evalAssign(ctx, formalparams.getValue());
            }
        }
    }

    private void evalAssign(AssignNode ctx, Type type) {
        String atypesNormal = ctx.atypes.getClass().getSimpleName();
        String atypesSuper = ctx.atypes.getClass().getSuperclass().getSimpleName();
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
                        " and {Number, Boolean} at line: " + ctx.getLineNumber(), ctx.getLineNumber(), type, Type.Boolean);
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
                    " does not match with type " + getDataType(atypesNormal).toString() +
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
        ctx.setLineNumber(lineNumber);
        visit(ctx.bexpr);
    }

    @Override
    public void visit(BoolDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        formalParams.add(Type.Boolean);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Boolean, true));
    }

    @Override
    public void visit(NotNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.value);
        isBexpr = false;
    }

    @Override
    public void visit(AndNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(OrNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(RelopLessNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        visit(ctx.leftChild);
        visit(ctx.rightChild);
        isBexpr = false;
    }

    @Override
    public void visit(IdBoolValNode ctx) {
        isBexpr = true;
        ctx.setLineNumber(lineNumber);
        Attributes foundid = symbolTable.retrieveSymbol(ctx.id.getId());
        if (foundid.type != Type.Boolean){
            throw new TypeCheckException("Id is not of type boolean at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
            };
        }
        visit(ctx.boolVal);
        isBexpr = false;
    }

    @Override
    public void visit(BoolValNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (isFuncCall) {
            actualParams.add(Type.Boolean);
        }
        if (isBexpr){
            if (!(ctx.value.equals("true") || ctx.value.equals("false"))){
                throw new TypeCheckException("Boolean value not valid at line " + ctx.getLineNumber(), ctx.getLineNumber());
            }
        }
    }

    @Override
    public void visit(DivisionNode ctx) {
        isAexpr = true;
        ctx.setLineNumber(lineNumber);
        if ((ctx.leftChild instanceof Aexpr || ctx.leftChild instanceof Numberval) &&
                (ctx.rightChild instanceof Aexpr || ctx.rightChild instanceof Numberval)) {
            visit(ctx.leftChild);
            visit(ctx.rightChild);
        } else {
            throw new TypeCheckException("Division expression not valid at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
            };
        }
        isAexpr = false;
    }

    @Override
    public void visit(IdNode ctx) {
        Attributes foundId = symbolTable.retrieveSymbol(ctx.id);
        ctx.setLineNumber(lineNumber);
        if (isFuncCall) {
            actualParams.add(foundId.type);
        }
        if (isAexpr){
            if (!(foundId.type.equals(Type.Number))){
                throw new TypeCheckException("Id is not a number at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
                };
            }
        }
        if (isBexpr){
            if (!(foundId.type.equals(Type.Boolean) || foundId.type.equals(Type.Number))){
                throw new TypeCheckException("Id is not a boolean at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
                };
            }
        }
    }

    @Override
    public void visit(MinusNode ctx) {
        isAexpr = true;
        ctx.setLineNumber(lineNumber);
        if ((ctx.leftChild instanceof Aexpr || ctx.leftChild instanceof Numberval) &&
                (ctx.rightChild instanceof Aexpr || ctx.rightChild instanceof Numberval)) {
            visit(ctx.leftChild);
            visit(ctx.rightChild);
        } else {
            throw new TypeCheckException("Minus expression not valid at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
            };
        }
        isAexpr = false;
    }

    @Override
    public void visit(ModNode ctx) {
        isAexpr = true;
        ctx.setLineNumber(lineNumber);
        if ((ctx.leftChild instanceof Aexpr || ctx.leftChild instanceof Numberval) &&
                (ctx.rightChild instanceof Aexpr || ctx.rightChild instanceof Numberval)) {
            visit(ctx.leftChild);
            visit(ctx.rightChild);
        } else {
            throw new TypeCheckException("Modulo expression not valid at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
            };
        }
        isAexpr = false;
    }


    @Override
    public void visit(NumvalNode ctx) {
        ctx.setLineNumber(lineNumber);
        actualParams.add(Type.Number);
    }

    @Override
    public void visit(PiNode ctx) {
        ctx.setLineNumber(lineNumber);
        actualParams.add(Type.Number);
    }

    @Override
    public void visit(PlusNode ctx) {
        isAexpr = true;
        ctx.setLineNumber(lineNumber);
        if ((ctx.leftChild instanceof Aexpr || ctx.leftChild instanceof Numberval) &&
                (ctx.rightChild instanceof Aexpr || ctx.rightChild instanceof Numberval)) {
            visit(ctx.leftChild);
            visit(ctx.rightChild);
        } else {
            throw new TypeCheckException("Plus expression not valid at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
            };
        }
        isAexpr = false;
    }

    @Override
    public void visit(TimesNode ctx) {
        isAexpr = true;
        ctx.setLineNumber(lineNumber);
        if ((ctx.leftChild instanceof Aexpr || ctx.leftChild instanceof Numberval) &&
                (ctx.rightChild instanceof Aexpr || ctx.rightChild instanceof Numberval)) {
            visit(ctx.leftChild);
            visit(ctx.rightChild);
        } else {
            throw new TypeCheckException("Times expression not valid at line " + ctx.getLineNumber(), ctx.getLineNumber()) {
            };
        }
        isAexpr = false;
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
