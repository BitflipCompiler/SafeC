package service;

import ast.*;
import ast.abstracts.*;

import java.util.ArrayList;
import java.util.List;

public class TypeChecker extends SymbolTableFill {


    public TypeChecker(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public void visit(ProgNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(SafeDclNode ctx) {
        System.out.println("SafeDclNode");
    }

    @Override
    public void visit(StructBlockNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(StructNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(FuncDcl ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(FormalParamsNode ctx) {
        for (Node node : ctx.vdcls) {
            visit(node);
        }
        //List<Node> paramnodes = new ArrayList<>(ctx.vdcls);
        //System.out.println(paramnodes.get(0).getClass().getSimpleName());

    }

    @Override
    public void visit(FuncBlockNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(FuncCalls ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ActualParamsNode ctx) {

    }

    @Override
    public void visit(IfStatementNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(SwitchStatementNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ScaseNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(CaseBlockNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(DefCaseNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(WhileLoop ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ForLoop ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ForParams ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(DclAssignSemiCommandNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(AssignNode ctx) {

        Attributes foundId = symbolTable.retrieveSymbol(ctx.id);
        String atypesSuper = ctx.atypes.getClass().getSuperclass().getSimpleName();

        if (foundId == null) {
            visit(ctx.atypes);
            return ;
        }
        switch (atypesSuper) {
            case "Aexpr" -> {
                if (foundId.type == Type.Number) {
                    System.out.println("Aexpr");
                    visit(ctx.atypes);
                } else {
                    throw new RuntimeException("Type " + foundId.type + "does not match with type " + atypesSuper);
                }
            }

            case "Bexpr" -> {
                if (foundId.type == Type.Boolean) {
                    System.out.println("Bexpr");
                    visit(ctx.atypes);
                } else {
                    throw new RuntimeException("Type " + foundId.type + "does not match with type " + atypesSuper);
                }
            }

            case "FuncCalls" -> {
                if (foundId.type == Type.Number || foundId.type == Type.Char || foundId.type == Type.String || foundId.type == Type.Boolean || foundId.type == Type.Void) {
                    System.out.println("Funccalls");
                    visit(ctx.atypes);
                } else {
                    throw new RuntimeException("Type " + foundId.type + "does not match with type " + atypesSuper);
                }
            }

            case "ArrayData" -> {
                if (foundId.type == Type.Number || foundId.type == Type.Char || foundId.type == Type.String || foundId.type == Type.Boolean) {
                    System.out.println("ArrayAssign");
                    visit(ctx.atypes);
                } else {
                    throw new RuntimeException("Type " + foundId.type + "does not match with type " + atypesSuper);
                }
            }

            default -> {
                String atypesNormal = ctx.atypes.getClass().getSimpleName();
                if (foundId.type == Type.Char && atypesNormal.equals("CharValNode")) {
                    System.out.println("Char");
                } else if (foundId.type == Type.String && atypesNormal.equals("StringValNode")) {
                    System.out.println("String");
                } else {
                    throw new RuntimeException("Type " + foundId.type + "does not match with type " + atypesNormal);
                }
            }


        }

    }

    @Override
    public void visit(ArrayBoolNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayBoolValuesNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayCharNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayCharValuesNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayDeclNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayNumNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayNumValuesNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayStringNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(ArrayStrValuesNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(CharDclAssignNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(CharDclNode ctx) {
        System.out.println("CharDclNode");
    }

    @Override
    public void visit(NumDclAssignNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(NumDclNode ctx) {
        //TODO: Få Id til at være en del af formalParams.
        //ctx.id == x
    }

    @Override
    public void visit(StringDclAssignNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(StringDclNode ctx) {
        System.out.println("StringDclNode");
    }

    @Override
    public void visit(NumberLitteralNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(StringLitteralNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(BoolLitteralNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(VoidLitteralNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(Bexpr ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(BoolDclAssignNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(BoolDclNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(NotNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(AndNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(OrNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(RelopEqualNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(RelopNotEqualNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(RelopLeqNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(RelopGeqNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(RelopLessNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(RelopGreaterNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(IdBoolValNode ctx) {
        super.visit(ctx);
    }

    @Override
    public void visit(BoolValNode ctx) {
        super.visit(ctx);
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

    }

    @Override
    public void visit(PiNode ctx) {

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

    }

    @Override
    public void visit(StringValNode ctx) {

    }
}
