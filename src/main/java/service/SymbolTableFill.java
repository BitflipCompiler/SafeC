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
        for (Node node : ctx.nodes) {
            visit(node);
        }
        symbolTable.closeScope();
    }

    @Override
    public void visit(SafeDclNode ctx) {
        if (symbolTable.depth == 0) {
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
        for (Node node : ctx.safeDclNodes) {
            visit(node);
        }
    }

    @Override
    public void visit(StructDclNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Struct, false));
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
        symbolTable.enterSymbol(new FuncAttributes(ctx.id, funcType, false, ctx.funcblock, ctx.formalParams, ctx.returnValue));
        symbolTable.openScope();
        symbolTable.enterSymbol(new FuncAttributes(ctx.id, funcType, false, ctx.funcblock, ctx.formalParams, ctx.returnValue));
        visit(ctx.funcblock);

        //type checking has to be done as late as possible, while still having access to the local variables
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
        symbolTable.closeScope();

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
    }

    @Override
    public void visit(FuncCallsNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        if (ctx.actualParamsNode != null) {
            visit(ctx.actualParamsNode);
        }
    }

    @Override
    public void visit(ActualParamsNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
        for (Node node : ctx.vals) {
            visit(node);
        }
    }

    @Override
    public void visit(IfStatementNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.iflogic.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
        if (ctx.ifThenBlock != null) {
            symbolTable.openScope();
            visit(ctx.ifThenBlock);
            symbolTable.closeScope();
        } else if (ctx.elseBlock != null) {
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
        for (Node node : ctx.scases) {
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
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        ctx.setLineNumber(lineNumber);
        visit(ctx.actual);
        if (ctx.recursion != null) {
            visit(ctx.recursion);
        }
    }

    @Override
    public void visit(AssignNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        visit(ctx.atypes);
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
    }

    //ARRAYS
    @Override
    public void visit(ArrayBoolNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayBool, false));
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(ArrayCharNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayChar, false));
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        lineNumber++;
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, null, false));
        visit(ctx.arrdcltype);
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayNum, false));
    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    @Override
    public void visit(ArrayStringNode ctx) {
        ctx.setLineNumber(lineNumber);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.ArrayStr, false));
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {
        ctx.setLineNumber(lineNumber);
    }

    //DCLS and DCLASSIGNS
    @Override
    public void visit(CharDclAssignNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        visit(ctx.charDcl);
        visit(ctx.charval);
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.charval.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
    }

    @Override
    public void visit(CharDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Char, false));

    }

    @Override
    public void visit(NumDclAssignNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        visit(ctx.numdecl);
        visit(ctx.aexpr);
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.aexpr.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
    }

    @Override
    public void visit(NumDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        if (symbolTable.isDeclaredLocally(ctx.id)) {
            throw new MultipleLocalDeclarationException("Number declaration multiple times in local scope: " +
                    ctx.id + " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), ctx.id);
        } else {
            symbolTable.enterSymbol(new Attributes(ctx.id, Type.Number, false));
        }
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        visit(ctx.stringdcl);
        visit(ctx.stringval);
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.stringval.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
    }

    @Override
    public void visit(StringDclNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        if (symbolTable.isDeclaredLocally(ctx.id)) {
            throw new MultipleLocalDeclarationException("String declaration multiple times in local scope: " +
                    ctx.id + " at line: " + ctx.getLineNumber(), ctx.getLineNumber(), ctx.id);
        } else {
            symbolTable.enterSymbol(new Attributes(ctx.id, Type.String, false));
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
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        visit(ctx.boolDcl);
        visit(ctx.bexpr);
        TypeChecker typeChecker = new TypeChecker(symbolTable, lineNumber);
        ctx.accept(typeChecker);
        lineNumber = typeChecker.lineNumber;
    }

    @Override
    public void visit(BoolDclNode ctx) {
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.Boolean, false));
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
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
    }

    @Override
    public void visit(DivisionNode ctx) {
    }

    @Override
    public void visit(IdNode ctx) {
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
        symbolTable.enterSymbol(new Attributes(ctx.id, null, false));
    }

    @Override
    public void visit(MinusNode ctx) {
    }

    @Override
    public void visit(ModNode ctx) {
    }

    @Override
    public void visit(NumvalNode ctx) {
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
    }

    @Override
    public void visit(PiNode ctx) {
    }

    @Override
    public void visit(PlusNode ctx) {
    }

    @Override
    public void visit(TimesNode ctx) {
    }


    //VALS
    @Override
    public void visit(CharValNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }

    }

    @Override
    public void visit(StringValNode ctx) {
        ctx.setLineNumber(lineNumber);
        if (symbolTable.depth == 0) {
            ctx.isGlobal = true;
        }
    }
}
