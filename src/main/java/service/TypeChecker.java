package service;

import ast.*;
import ast.abstracts.*;

import java.util.ArrayList;

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
        System.out.println("SafeDclNode");
    }

    @Override
    public void visit(StructBlockNode ctx) {
        
    }

    @Override
    public void visit(StructNode ctx) {
        
    }

    @Override
    public void visit(FuncDcl ctx) {

    }

    @Override
    public void visit(FormalParamsNode ctx) {
        /*for (Node node : ctx.vdcls) {
            visit(node);
        }*/
        //List<Node> paramnodes = new ArrayList<>(ctx.vdcls);
        //System.out.println(paramnodes.get(0).getClass().getSimpleName());

    }

    @Override
    public void visit(FuncBlockNode ctx) {
        visit(ctx.dclAssignSemiCommand);
    }

    @Override
    public void visit(FuncCalls ctx) {
        FuncAttributes foundFunc = (FuncAttributes) symbolTable.retrieveSymbol(ctx.id);
        /*visit(foundFunc.formalParams);*/
        ArrayList<Type> formalParams = foundFunc.getFormalParams();
        visit(ctx.callparams);
        for(int i = 0; i < formalParams.size(); i++){
            if(!actualParams.get(i).equals(formalParams.get(i))){
                throw new RuntimeException("actual param: " + actualParams.get(i) + " different than: " + formalParams.get(i));
            }
        }
    }

    @Override
    public void visit(ActualParamsNode ctx) {
        for (Node node: ctx.vals) {
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
    public void visit(WhileLoop ctx) {
        
    }

    @Override
    public void visit(ForLoop ctx) {
        
    }

    @Override
    public void visit(ForParams ctx) {
        
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        
    }

    @Override
    public void visit(AssignNode ctx) {

        Attributes foundId = symbolTable.retrieveSymbol(ctx.id);
        String atypesNormal = ctx.atypes.getClass().getSimpleName();
        String atypesSuper = ctx.atypes.getClass().getSuperclass().getSimpleName();

        if (foundId == null) {
            visit(ctx.atypes);
        } else {
            if (atypesSuper.equals("Aexpr") || ctx.atypes.getClass().getSuperclass().getSuperclass().getSimpleName().equals("Aexpr")) {
                if (foundId.type == Type.Number) {
                    visit(ctx.atypes);
                } else {
                    throw new RuntimeException("Type " + foundId.type + " does not match with type " + atypesSuper);
                }
            } else if (atypesSuper.equals("Bexpr")) {
                if (foundId.type == Type.Boolean) {
                    visit(ctx.atypes);
                } else {
                    throw new RuntimeException("Type " + foundId.type + " does not match with type " + atypesSuper);
                }
            } else if (atypesSuper.equals("ArrayData")) {
                if (foundId.type == Type.Number || foundId.type == Type.Char || foundId.type == Type.String || foundId.type == Type.Boolean) {
                    visit(ctx.atypes);
                } else {
                    throw new RuntimeException("Type " + foundId.type + " does not match with type " + atypesSuper);
                }
            } else if (foundId.type == Type.Char && atypesNormal.equals("CharValNode")) {
                System.out.println("Char");
            } else if (foundId.type == Type.String && atypesNormal.equals("StringValNode")) {
                System.out.println("String");
            } else if (atypesNormal.equals("FuncCalls")){
                visit(ctx.atypes);
            } else {
                throw new RuntimeException("Her: Type " + foundId.type + "does not match with normal type " + atypesNormal + " or super: " + atypesSuper);
            }
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
        symbolTable.enterSymbol(new Attributes(ctx.id,arrayType,true));
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
        symbolTable.enterSymbol(new Attributes(ctx.id,Type.Char,true));
    }

    @Override
    public void visit(NumDclAssignNode ctx) {
        
    }

    @Override
    public void visit(NumDclNode ctx) {
        //TODO: Få Id til at være en del af formalParams.
        formalParams.add(Type.Number);
        symbolTable.enterSymbol(new Attributes(ctx.id,Type.Number,true));
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        
    }

    @Override
    public void visit(StringDclNode ctx) {
        formalParams.add(Type.String);
        symbolTable.enterSymbol(new Attributes(ctx.id, Type.String,true));
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
    public void visit(Bexpr ctx) {
        
    }

    @Override
    public void visit(BoolDclAssignNode ctx) {
        
    }

    @Override
    public void visit(BoolDclNode ctx) {
        formalParams.add(Type.Boolean);
        symbolTable.enterSymbol(new Attributes(ctx.id,Type.Boolean,true));
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
    public void visit(Numberval ctx) {

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
