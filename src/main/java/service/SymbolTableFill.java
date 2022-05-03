package service;

import ast.*;
import ast.abstracts.*;
import visitor.ASTVisitor;

/**
 * This class responsibility is to fill the {@link SymbolTable } with usefull information (Type,Scope, etc.)
 * It uses the {@link ASTVisitor} to visit the different nodes and get the needed information.
 */

public class SymbolTableFill extends ASTVisitor {

    SymbolTable symbolTable;

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
        //TODO: safety skal måske gemmes i SymbolTable somehow?
        visit(ctx.variable);
    }

    //STRUCT
    @Override
    public void visit(StructBlockNode ctx) {
        for (Node node: ctx.safeDclNodes) {
            visit(node);
        }
    }

    @Override

    public void visit(StructDclNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Struct,false));
        symbolTable.openScope();
        visit(ctx.structBlock);
        symbolTable.closeScope();
    }

    //FUNCTIONS
    @Override
    public void visit(FuncDclNode ctx) {
        String datatype = ctx.datatype.getClass().getSimpleName();
        Type funcType = this.getDataType(datatype);
        //ArrayList<String> stringFormalParams = ctx.getFormalParams();

        symbolTable.enterSymbol(new FuncAttributes(ctx.id, funcType,false, ctx.funcblock,ctx.formalParams, ctx.returnValue));
        /*if(ctx.params != null){
            ctx.params.accept(new TypeChecker(symbolTable));
        }*/
        symbolTable.openScope();
        symbolTable.enterSymbol(new FuncAttributes(ctx.id, funcType,false, ctx.funcblock,ctx.formalParams, ctx.returnValue));
        visit(ctx.funcblock);
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
        throw new RuntimeException("Datatype not viable.");
    }

    @Override
    public void visit(FormalParamsNode ctx) {
        System.out.println("blablabla");
    }

    @Override
    public void visit(FuncBlockNode ctx) {
        visit(ctx.dclAssignSemiCommand);
        //visit(ctx.returnValue);
    }

    @Override
    public void visit(FuncCallsNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }

        //TODO: skal slå op i symbol table og tjekke om id på func findes
        if(ctx.actualParamsNode != null){
            visit(ctx.actualParamsNode);
        }
    }

    @Override
    public void visit(ActualParamsNode ctx) {
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
        visit(ctx.iflogic);
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
        //TODO: først slå op i symboltable om id eksisterer
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
        //visit(ctx.vals);
        visit(ctx.caseblock);
    }

    @Override
    public void visit(CaseBlockNode ctx) {
        visit(ctx.dclAssignCommand);
    }

    @Override
    public void visit(DefCaseNode ctx) {
        visit(ctx.caseblock);
    }

    @Override
    public void visit(WhileLoopNode ctx) {
        //visit(ctx.bexpr);
        symbolTable.openScope();
        visit(ctx.block);
        symbolTable.closeScope();
    }


    @Override
    public void visit(ForLoopNode ctx) {
        visit(ctx.forparams);
        symbolTable.openScope();
        visit(ctx.block);
        symbolTable.closeScope();
    }

    @Override
    public void visit(ForParamsNode ctx) {
        visit(ctx.numdclassign);
        //visit(ctx.bexpr);
        //symbolTable.enterSymbol(ctx.id, new Attributes(ctx.id, Type.Number));
        //visit(ctx.aexpr);
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        visit(ctx.actual);
        if(ctx.recursion != null){
            visit(ctx.recursion);
        }
    }

    @Override
    public void visit(AssignNode ctx) {
        ctx.accept(new TypeChecker(symbolTable));
        //symbolTable.enterSymbol(ctx.id, new Attributes(ctx.id, null));
        visit(ctx.atypes);
    }

    //ARRAYS
    @Override
    public void visit(ArrayBoolNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayBool,false));
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {

    }

    @Override
    public void visit(ArrayCharNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayChar,false));
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {

    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id,null,false));
        visit(ctx.arrdcltype);
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayNum,false));
    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {

    }

    @Override
    public void visit(ArrayStringNode ctx) {
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayStr,false));
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {

    }

    //DCLS and DCLASSIGNS
    @Override
    public void visit(CharDclAssignNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.charDcl);
        visit(ctx.charval);
    }

    @Override
    public void visit(CharDclNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Char,false));

    }
    @Override
    public void visit(NumDclAssignNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.numdecl);
        visit(ctx.aexpr);
    }

    @Override
    public void visit(NumDclNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        if (symbolTable.isDeclaredLocally(ctx.id)){
            throw new RuntimeException("declarition multiple times in local scope: " + ctx.id);
        } else {
            symbolTable.enterSymbol(new Attributes(ctx.id, Type.Number,false));
        }
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.stringdcl);
        visit(ctx.stringval);
    }

    @Override
    public void visit(StringDclNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        if (symbolTable.isDeclaredLocally(ctx.id)){
            throw new RuntimeException("declarition multiple times in local scope: " + ctx.id);
        } else {
            //System.out.println("goes here string:" + ctx.id);
            symbolTable.enterSymbol(new Attributes(ctx.id, Type.String,false));
        }
    }

    //DATATYPES
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
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        visit(ctx.boolDcl);
        visit(ctx.bexpr);
    }

    @Override
    public void visit(BoolDclNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Boolean,false));
    }


    @Override
    public void visit(NotNode ctx) {
        //visit(ctx.value);

    }

    @Override
    public void visit(AndNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);

    }

    @Override
    public void visit(OrNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopLessNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }


    @Override
    public void visit(IdBoolValNode ctx) {

    }

    @Override
    public void visit(BoolValNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
    }

    @Override
    public void visit(DivisionNode ctx) {
        //ctx.accept(new TypeChecker(symbolTable));
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(IdNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id,null,false));
    }

    @Override
    public void visit(MinusNode ctx) {
        //ctx.accept(new TypeChecker(symbolTable));
        //TYPECHECK

        //CHECK IF LEFTCHILD OR RIGHTCHILD ID IS AN AEXPR
        // IF NOT THROW AN ERROR ("YOU ARE IN A MINUS NODE YOU CAN ONLY BE AN AEXPR")

/*        if(ctx.leftchild.getClass.getSuperclass.equals(ctx.rightchild.getClass.getSuperclass){

            //Begge children har den samme type
        }else if ((ctx.leftchild.getClass.getSuperclass == IdNode || ctx.rightchild.getClass.getSuperclass == IdNode)
            && (ctx.leftchild.getClass.getSuperclass == numberval || ctx.rightchild.getClass.getSuperclass == numberval) ){
                // its maybe cool.
            }else{

            //En af children er anderledes.
        }
*/
    }

    @Override
    public void visit(ModNode ctx) {
        //ctx.accept(new TypeChecker(symbolTable));
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }


    @Override
    public void visit(NumvalNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }


    }

    @Override
    public void visit(PiNode ctx) {

    }

    @Override
    public void visit(PlusNode ctx) {
        //ctx.accept(new TypeChecker(symbolTable));
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }

    @Override
    public void visit(TimesNode ctx) {
        //ctx.accept(new TypeChecker(symbolTable));
        //visit(ctx.leftChild);
        //visit(ctx.rightChild);
    }


    //VALS
    @Override
    public void visit(CharValNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }

    }

    @Override
    public void visit(StringValNode ctx) {
        if(symbolTable.depth == 0){
            ctx.isGlobal = true;
        }

    }
}
