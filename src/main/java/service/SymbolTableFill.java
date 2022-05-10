package service;

import ast.*;
import ast.abstracts.*;
import exceptions.InvalidTypeDeclarationException;
import exceptions.MultipleLocalDeclarationException;
import visitor.ASTVisitor;

/**
 * This class responsibility is to fill the {@link SymbolTable } with usefull information (Type,Scope, etc.)
 * It uses the {@link ASTVisitor} to visit the different nodes and get the needed information.
 */

public class SymbolTableFill extends ASTVisitor {

    SymbolTable symbolTable;
    int lineNumber = 0;

    public SymbolTableFill(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public void visit(ProgNode ctx) {
        symbolTable.openScope();
        for (Node node: ctx.nodes) {
            visit(node);
        }
        symbolTable.closeScope();
    }

    @Override
    public void visit(SafeDclNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        visit(ctx.variable);
    }

    //STRUCT
    @Override
    public void visit(StructBlockNode ctx) {
        ctx.setLineNumber(lineNumber);
        for (Node node: ctx.safeDclNodes) {
            visit(node);
        }
    }

    @Override
    public void visit(StructDclNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Struct,false));
        symbolTable.openScope();
        visit(ctx.structBlock);
        symbolTable.closeScope();
    }

    //FUNCTIONS
    @Override
    public void visit(FuncDclNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);

        String datatype = ctx.datatype.getClass().getSimpleName();
        Type funcType = this.getDataType(datatype);
        symbolTable.enterSymbol(new FuncAttributes(ctx.id, funcType,false, ctx.funcblock,ctx.formalParams, ctx.returnValue));

        symbolTable.openScope();
        symbolTable.enterSymbol(new FuncAttributes(ctx.id, funcType,false, ctx.funcblock,ctx.formalParams, ctx.returnValue));
        visit(ctx.funcblock);
        //System.out.println(symbolTable);

        //type checking has to be done as late as possible, while still having access to the local variables
        ctx.accept(new TypeChecker(symbolTable));
        symbolTable.closeScope();

    }

    public Type getDataType(String datatype) {
        if (datatype.startsWith("Num")){
            return Type.Number;
        } else if (datatype.startsWith("Void")){
            return Type.Void;
        } else if (datatype.startsWith("String")){
            return Type.String;
        } else if (datatype.startsWith("Bool")){
            return Type.Boolean;
        } else if (datatype.startsWith("Char")){
            return Type.Char;
        }
        throw new InvalidTypeDeclarationException("Datatype not viable: " +
                datatype, lineNumber, datatype);
    }

    @Override
    public void visit(FormalParamsNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(FuncBlockNode ctx) {
        ctx.setLineNumber(lineNumber);
        visit(ctx.dclAssignSemiCommand);
        //visit(ctx.returnValue);
    }

    @Override
    public void visit(FuncCallsNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }

        if(ctx.actualParamsNode != null){
            visit(ctx.actualParamsNode);
        }
    }

    @Override
    public void visit(ActualParamsNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        ctx.accept(new TypeChecker(symbolTable));
        for (Node node: ctx.vals) {
            visit(node);
        }
    }

    @Override
    public void visit(IfStatementNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        //visit(ctx.iflogic);
        ctx.iflogic.accept(new TypeChecker(symbolTable));
        if(ctx.ifThenBlock != null){
            symbolTable.openScope();
            visit(ctx.ifThenBlock);
            symbolTable.closeScope();
        } else if (ctx.elseBlock != null){
            symbolTable.openScope();
            visit(ctx.elseBlock);
            symbolTable.closeScope();
        }
    }

    //SWITCH
    @Override
    public void visit(SwitchStatementNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);

        symbolTable.openScope();
        for (Node node: ctx.scases) {
            symbolTable.openScope();
            visit(node);
            symbolTable.closeScope();
        }
        symbolTable.openScope();

        visit(ctx.defcase);
        symbolTable.closeScope();

        symbolTable.closeScope();
    }

    @Override
    public void visit(ScaseNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        //visit(ctx.vals);
        visit(ctx.caseblock);
    }

    @Override
    public void visit(CaseBlockNode ctx) {
        ctx.setLineNumber(lineNumber);
        visit(ctx.dclAssignCommand);
    }

    @Override
    public void visit(DefCaseNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        visit(ctx.caseblock);
    }

    @Override
    public void visit(WhileLoopNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        //visit(ctx.bexpr);
        symbolTable.openScope();
        visit(ctx.block);
        symbolTable.closeScope();
    }


    @Override
    public void visit(ForLoopNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        visit(ctx.forparams);
        symbolTable.openScope();
        visit(ctx.block);
        symbolTable.closeScope();
    }

    @Override
    public void visit(ForParamsNode ctx) {
        ctx.setLineNumber(lineNumber);
        visit(ctx.numdclassign);
        //visit(ctx.bexpr);
        //symbolTable.enterSymbol(ctx.id, new Attributes(ctx.id, Type.Number));
        //visit(ctx.aexpr);
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        ctx.setLineNumber(lineNumber);
        visit(ctx.actual);
        if(ctx.recursion != null){
            visit(ctx.recursion);
        }
    }

    @Override
    public void visit(AssignNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        ctx.accept(new TypeChecker(symbolTable));
        visit(ctx.atypes);
    }

    //ARRAYS
    @Override
    public void visit(ArrayBoolNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayBool,false));
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(ArrayCharNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayChar,false));
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id,null,false));
        visit(ctx.arrdcltype);
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayNum,false));
    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(ArrayStringNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayStr,false));
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    //DCLS and DCLASSIGNS
    @Override
    public void visit(CharDclAssignNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.charDcl);
        ctx.charval.accept(new TypeChecker(symbolTable));
    }

    @Override
    public void visit(CharDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Char,false));

    }
    @Override
    public void visit(NumDclAssignNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.numdecl);
        ctx.aexpr.accept(new TypeChecker(symbolTable));
    }

    @Override
    public void visit(NumDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        if (symbolTable.isDeclaredLocally(ctx.id)){
            throw new MultipleLocalDeclarationException("Number declaration multiple times in local scope: " +
                    ctx.id + " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), ctx.id);
        } else {
            symbolTable.enterSymbol(new Attributes(ctx.id, Type.Number,false));
        }
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.stringdcl);
        ctx.stringval.accept(new TypeChecker(symbolTable));
    }

    @Override
    public void visit(StringDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        if (symbolTable.isDeclaredLocally(ctx.id)){
            throw new MultipleLocalDeclarationException("String declaration multiple times in local scope: " +
                    ctx.id + " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), ctx.id);
        } else {
            //System.out.println("goes here string:" + ctx.id);
            symbolTable.enterSymbol(new Attributes(ctx.id, Type.String,false));
        }
    }

    //DATATYPES
    @Override
    public void visit(NumberLitteralNode ctx) {
        ctx.setLineNumber(lineNumber);

    }

    @Override
    public void visit(StringLitteralNode ctx) {
        ctx.setLineNumber(lineNumber);

    }
    @Override
    public void visit(BoolLitteralNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(VoidLitteralNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(BoolDclAssignNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.boolDcl);
        ctx.bexpr.accept(new TypeChecker(symbolTable));
    }

    @Override
    public void visit(BoolDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Boolean,false));
    }


    @Override
    public void visit(NotNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(AndNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(OrNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(RelopLessNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        ctx.setLineNumber(lineNumber);
    }


    @Override
    public void visit(IdBoolValNode ctx) {
        ctx.setLineNumber(lineNumber);

    }

    @Override
    public void visit(BoolValNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
    }

    @Override
    public void visit(DivisionNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(IdNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id,null,false));
    }

    @Override
    public void visit(MinusNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(ModNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(NumvalNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
    }

    @Override
    public void visit(PiNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(PlusNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(TimesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }


    //VALS
    @Override
    public void visit(CharValNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }

    }

    @Override
    public void visit(StringValNode ctx) {
        ctx.setLineNumber(lineNumber);
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
    }
}
