package service;

import ast.*;
import ast.abstracts.*;
import gen.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSTToASTVisitor extends SafeCBaseVisitor<Node> {


    @Override
    public Node visitProg(SafeCParser.ProgContext ctx) {
        ProgNode progNode = new ProgNode();
        for(int i = 0; i < ctx.declaration().size(); i++){
            progNode.nodes.add(visit(ctx.declaration().get(i)));
        }
        return progNode;
    }

    @Override
    public Node visitDeclaration(SafeCParser.DeclarationContext ctx) {
        if(ctx.dclassignsemi() != null){
            return visit(ctx.dclassignsemi());
        } else if(ctx.structdcl() != null){
            return visit(ctx.structdcl());
        } else if (ctx.funcdcl() != null){
            return visit(ctx.funcdcl());
        }
        throw new RuntimeException("declaration not valid.");
    }

    @Override
    public Node visitStructdcl(SafeCParser.StructdclContext ctx) {
        return new StructNode(ctx.ID().toString(), visit(ctx.structblock()));
    }

    @Override
    public Node visitStructblock(SafeCParser.StructblockContext ctx) {
        StructBlockNode structBlocknode = new StructBlockNode();
        for(int i = 0; i < ctx.safedeclaration().size(); i++){
            structBlocknode.safeDclNodes.add(visit(ctx.safedeclaration().get(i)));
        }
        return structBlocknode;
    }

    @Override
    public Node visitDclassignsemi(SafeCParser.DclassignsemiContext ctx) {
        if(ctx.vassign() != null){
            return visit(ctx.vassign());
        } else if ( ctx.safedeclaration() != null){
            return visit(ctx.safedeclaration());
        }
        throw new RuntimeException("Dclassignsemi not valid.");
    }

    @Override
    public Node visitDclassignsemicommand(SafeCParser.DclassignsemicommandContext ctx) {
        if(ctx.dclassignsemicommand() != null){
            if(ctx.dclassignsemi() != null){
                return new DclAssignSemiCommandNode(visit(ctx.dclassignsemi()), visit(ctx.dclassignsemicommand()));
            } else if(ctx.command() != null){
                return new DclAssignSemiCommandNode(visit(ctx.command()), visit(ctx.dclassignsemicommand()));
            }
        } else if(ctx.dclassignsemicommand() == null){
            if (ctx.dclassignsemi() != null){
                return new DclAssignSemiCommandNode(visit(ctx.dclassignsemi()), null);
            } else if(ctx.command() != null){
                return new DclAssignSemiCommandNode(visit(ctx.command()), null);
            } else if(ctx.dclassignsemi() == null && ctx.command() == null) {
                return new EmptyNode();
            }
        }
        throw new RuntimeException("dclAssignSemiCommand not valid.");
    }

    @Override
    public Node visitSafedeclaration(SafeCParser.SafedeclarationContext ctx) {
        if(ctx.vdclassign() != null){
            return new SafeDclNode(ctx.SAFETY().toString(), visit(ctx.vdclassign()));
        } else if(ctx.vdcl() != null){
            return new SafeDclNode(ctx.SAFETY().toString(), visit(ctx.vdcl()));
        }
        throw new RuntimeException("safedeclaration not valid.");
    }

    @Override
    public Node visitParams(SafeCParser.ParamsContext ctx) {
        FormalParamsNode astFormalParamsNode = new FormalParamsNode();
        for(int i = 0; i < ctx.vdcl().size();i++){
            astFormalParamsNode.vdcls.add(visit(ctx.vdcl().get(i)));
        }
        return astFormalParamsNode;
    }

    @Override
    public Node visitBlock(SafeCParser.BlockContext ctx) {
        return visit(ctx.dclassignsemicommand());
    }

    @Override
    public CaseBlockNode visitCaseblock(SafeCParser.CaseblockContext ctx) {
        if(ctx.BREAK() != null){
            return new CaseBlockNode(visit(ctx.dclassignsemicommand()), ctx.BREAK().toString());
        } else {
            return new CaseBlockNode(visit(ctx.dclassignsemicommand()));
        }
    }

    @Override
    public Node visitVdcl(SafeCParser.VdclContext ctx) {
      if(ctx.numdecl() != null){
          return visit(ctx.numdecl());
      }else if(ctx.chardecl() != null){
          return visit(ctx.chardecl());
      }else if(ctx.stringdecl() != null){
          return visit(ctx.stringdecl());
      }else if(ctx.booldecl() != null){
          return visit(ctx.booldecl());
      }else if (ctx.arraydecl() != null){
          return visit(ctx.arraydecl());
      }else{
          throw new RuntimeException("Something went wrong in visitVdcl");
      }
    }

    @Override
    public Node visitArraydecl(SafeCParser.ArraydeclContext ctx) {
        return new ArrayDeclNode(visit(ctx.arrdcltype()),ctx.ID().toString());
    }

    @Override
    public Node visitArrdcltype(SafeCParser.ArrdcltypeContext ctx) {
        if(ctx.NUMDCL() != null){
            return new NumberLitteralNode();
        } else if (ctx.CHARDCL() != null){
            return new CharLitteralNode();
        } else if(ctx.STRDCL() != null){
            return new StringLitteralNode();
        } else if (ctx.BOOLDCL() != null){
            return new BoolLitteralNode();
        }
        throw new RuntimeException("Datatype not valid exception.");
    }

    @Override
    public AssignNode visitVassign(SafeCParser.VassignContext ctx) {
        return new AssignNode(ctx.ID().toString(), visit(ctx.atypes()));
    }

    @Override
    public Node visitVdclassign(SafeCParser.VdclassignContext ctx) {
        if(ctx.numdclassign() != null){
            return visit(ctx.numdclassign());
        }else if(ctx.chardclassign() != null){
            return visit(ctx.chardclassign());
        }else if(ctx.stringdclassign() != null){
            return visit(ctx.stringdclassign());
        }else if(ctx.booldclassign() != null){
            return visit(ctx.booldclassign());
        }else if(ctx.arraydclassign() != null){
            return visit(ctx.arraydclassign());
        }
        throw new RuntimeException("Something went wrong in VisitVdeclAssign");
    }

    @Override
    public Node visitArraydclassign(SafeCParser.ArraydclassignContext ctx) {
        if(ctx.numarraydclassign() != null){
            return visit(ctx.numarraydclassign());
        }else if(ctx.chararraydclassign() != null){
            return visit(ctx.chararraydclassign());
        }else if(ctx.stringarraydclassign() != null){
            return visit(ctx.stringarraydclassign());
        }else if (ctx.boolarraydclassign() != null){
            return visit(ctx.boolarraydclassign());
        }
        throw new RuntimeException("Something went wrong in visitArrayDclAssign");
    }

    @Override
    public Node visitNumarraydclassign(SafeCParser.NumarraydclassignContext ctx) {
        return new ArrayNumNode(ctx.ID().toString(), visit(ctx.numarray()));
    }

    @Override
    public Node visitChararraydclassign(SafeCParser.ChararraydclassignContext ctx) {
        return new ArrayCharNode(ctx.ID().toString(), visit(ctx.chararray()));
    }

    @Override
    public Node visitStringarraydclassign(SafeCParser.StringarraydclassignContext ctx) {
        return new ArrayStringNode(ctx.ID().toString(), visit(ctx.strarray()));
    }

    @Override
    public Node visitBoolarraydclassign(SafeCParser.BoolarraydclassignContext ctx) {
        return new ArrayBoolNode(ctx.ID().toString(), visit(ctx.boolarray()));
    }

    @Override
    public Node visitDatatype(SafeCParser.DatatypeContext ctx) {
        if(ctx.NUMDCL() != null){
            return new NumberLitteralNode();
        } else if (ctx.CHARDCL() != null){
            return new CharLitteralNode();
        } else if(ctx.STRDCL() != null){
            return new StringLitteralNode();
        } else if (ctx.BOOLDCL() != null){
            return new BoolLitteralNode();
        } else if (ctx.VOIDDCL() != null){
            return new VoidLitteralNode();
        }
        throw new RuntimeException("Datatype not valid exception.");
    }

    @Override
    public Node visitAtypes(SafeCParser.AtypesContext ctx) {
        if(ctx.CHARVAL() != null){
            return new CharValNode(ctx.CHARVAL().toString());
        } else if(ctx.STRVAL() != null){
            return new StringValNode(ctx.STRVAL().toString());
        } else if(ctx.aexpr() != null){
            return visit(ctx.aexpr());
        } else if(ctx.bexpr() != null){
            return visit(ctx.bexpr());
        } else if (ctx.funccalls() != null){
            return visit(ctx.funccalls());
        } else {
            throw new RuntimeException("Atypes not valid.");
        }
    }

    @Override
    public Node visitArrayassign(SafeCParser.ArrayassignContext ctx) {
        return visit(ctx.arraydata());
    }

    @Override
    public Node visitArraydata(SafeCParser.ArraydataContext ctx) {
        if(ctx.numarray() != null){
            return visit(ctx.numarray());
        } else if(ctx.chararray() != null){
            return visit(ctx.chararray());
        } else if(ctx.strarray() != null){
            return visit(ctx.strarray());
        } else if(ctx.boolarray() != null){
            return visit(ctx.boolarray());
        }
        throw new RuntimeException("arraydata not valid.");
    }

    @Override
    public Node visitNumarray(SafeCParser.NumarrayContext ctx) {
        ArrayNumValuesNode astArrayNumValuesNode = new ArrayNumValuesNode();
        for(int i = 0; i < ctx.numberval().size();i++){
            astArrayNumValuesNode.numValues.add(visit(ctx.numberval().get(i)));
        }
        return astArrayNumValuesNode;
    }

    @Override
    public Node visitChararray(SafeCParser.ChararrayContext ctx) {
        ArrayCharValuesNode astArrayCharValuesNode = new ArrayCharValuesNode();
        for(int i = 0; i < ctx.CHARVAL().size();i++){
            astArrayCharValuesNode.charvalues.add(visit(ctx.CHARVAL().get(i)));
        }
        return astArrayCharValuesNode;
    }

    @Override
    public Node visitStrarray(SafeCParser.StrarrayContext ctx) {
        ArrayStrValuesNode astArrayStrValuesNode = new ArrayStrValuesNode();
        for(int i = 0; i < ctx.STRVAL().size();i++){
            astArrayStrValuesNode.strValues.add(visit(ctx.STRVAL().get(i)));
        }
        return astArrayStrValuesNode;
    }

    @Override
    public Node visitBoolarray(SafeCParser.BoolarrayContext ctx) {
        ArrayBoolValuesNode astArrayBoolValuesNode = new ArrayBoolValuesNode();
        for(int i = 0; i < ctx.BOOLVAL().size();i++){
            astArrayBoolValuesNode.boolValues.add(visit(ctx.BOOLVAL().get(i)));
        }
        return astArrayBoolValuesNode;
    }

    @Override
    public Node visitCommand(SafeCParser.CommandContext ctx) {
        if(ctx.ctrlstruct() != null){
            return visit(ctx.ctrlstruct());
        }else if(ctx.funccalls() != null){
            return visit(ctx.funccalls());
        }
        throw new RuntimeException("Something went wrong in visitCommand");
    }

    @Override
    public Node visitFunccalls(SafeCParser.FunccallsContext ctx) {
        if(ctx.callparams() != null){
            return new FuncCalls(ctx.ID().toString(),visit(ctx.callparams()));
        }else if(ctx.callparams() == null){
            return new FuncCalls(ctx.ID().toString());
        }
        throw new RuntimeException("Something went wrong in VisitFuncCalls");
    }

    @Override
    public Node visitFuncdcl(SafeCParser.FuncdclContext ctx) {
        if(ctx.params() != null){
            return new FuncDcl(visit(ctx.datatype()),ctx.ID().toString(),visit(ctx.params()),visit(ctx.funcblock()));
        }else if(ctx.params() == null){
            return new FuncDcl(visit(ctx.datatype()),ctx.ID().toString(),visit(ctx.funcblock()));
        }
        throw new RuntimeException("Something went wrong in visitFuncDcl");
    }

    @Override
    public Node visitFuncblock(SafeCParser.FuncblockContext ctx) {
        return new FuncBlockNode(visit(ctx.dclassignsemicommand()), visit(ctx.vals()));
    }

    @Override
    public Node visitCallparams(SafeCParser.CallparamsContext ctx) {
        ActualParamsNode astActualParamsNode = new ActualParamsNode();
        for(int i = 0; i < ctx.vals().size();i++){
            astActualParamsNode.vals.add(visit(ctx.vals().get(i)));
        }
        return astActualParamsNode;
    }

    @Override
    public Node visitCtrlstruct(SafeCParser.CtrlstructContext ctx) {
        if(ctx.iterative() != null){
            return visit(ctx.iterative());
        }else if(ctx.selective() != null){
            return visit(ctx.selective());
        }
        throw new RuntimeException("Something went wrong in visitCtrlStruct");
    }

    @Override
    public Node visitForLoop(SafeCParser.ForLoopContext ctx) {
        return new ForLoop(visit(ctx.forparams()), visit(ctx.block()));
    }

    @Override
    public Node visitWhileLoop(SafeCParser.WhileLoopContext ctx) {
        return new WhileLoop(visit(ctx.bexpr()),visit(ctx.block()));
    }

    @Override
    public Node visitIfStatement(SafeCParser.IfStatementContext ctx) {
        if(ctx.block().size() == 2){
            return new IfStatementNode(visit(ctx.iflogic()),visit(ctx.block(0)),visit(ctx.block(1)));
        }else{
            return new IfStatementNode(visit(ctx.iflogic()),visit(ctx.block(0)),null);
        }
    }

    @Override
    public Node visitSwitchStatement(SafeCParser.SwitchStatementContext ctx) {
        List<Node> scases = new ArrayList<>();
        for(int i = 0; i < ctx.scase().size(); i++){
            scases.add(visit(ctx.scase().get(i)));
        }
        return new SwitchStatementNode(ctx.ID().toString(),scases,visit(ctx.defcase()));
    }

    @Override
    public Node visitIflogic(SafeCParser.IflogicContext ctx) {
        return visit(ctx.bexpr());
    }

    @Override
    public Node visitForparams(SafeCParser.ForparamsContext ctx) {
        return new ForParams(visit(ctx.numdclassign()), visit(ctx.bexpr()), ctx.ID().toString(), visit(ctx.aexpr()));
    }

    @Override
    public Node visitScase(SafeCParser.ScaseContext ctx) {
        return new ScaseNode(visit(ctx.vals()), visit(ctx.caseblock()));
    }

    @Override
    public Node visitDefcase(SafeCParser.DefcaseContext ctx) {
        return new DefCaseNode(visit(ctx.caseblock()));
    }

    @Override
    public Node visitNumdecl(SafeCParser.NumdeclContext ctx) {
        return new NumDclNode(ctx.ID().toString());
    }

    @Override
    public Node visitBooldecl(SafeCParser.BooldeclContext ctx) {
        return new BoolDclNode(ctx.ID().toString());
    }

    @Override
    public Node visitChardecl(SafeCParser.ChardeclContext ctx) {
        return new CharDclNode(ctx.ID().toString());
    }

    @Override
    public Node visitStringdecl(SafeCParser.StringdeclContext ctx) {
        return new StringDclNode(ctx.ID().toString());
    }

    @Override
    public Node visitNumdclassign(SafeCParser.NumdclassignContext ctx) {
        return new NumDclAssignNode(visit(ctx.numdecl()), visit(ctx.aexpr()));
    }

    @Override
    public Node visitChardclassign(SafeCParser.ChardclassignContext ctx) {
        return new CharDclAssignNode(visit(ctx.chardecl()), new CharValNode(ctx.CHARVAL().toString()));
    }

    @Override
    public Node visitStringdclassign(SafeCParser.StringdclassignContext ctx) {
        return new StringDclAssignNode(visit(ctx.stringdecl()), new StringValNode(ctx.STRVAL().toString()));
    }

    @Override
    public Node visitBooldclassign(SafeCParser.BooldclassignContext ctx) {
        return new BoolDclAssignNode(visit(ctx.booldecl()), visit(ctx.bexpr()));
    }

    @Override
    public Node visitBexprRelop(SafeCParser.BexprRelopContext ctx) {
        if(ctx.relop().EQ() != null){
            return new RelopEqualNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().NEQ() != null){
            return new RelopNotEqualNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().LEQ() != null){
            return new RelopLeqNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().GEQ() != null){
            return new RelopGeqNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().LESS() != null){
            return new RelopLessNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().GREATER() != null){
            return new RelopGreaterNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            throw new RuntimeException("BexprBop bop not valid.");
        }
    }

    @Override
    public Node visitNOTBexpr(SafeCParser.NOTBexprContext ctx) {
        return new NotNode(visit(ctx.bexpr()));
    }

    @Override
    public Node visitBexprIDBoolval(SafeCParser.BexprIDBoolvalContext ctx) {
        return new IdBoolValNode(ctx.ID().getText(), ctx.BOOLVAL().getText());
    }

    @Override
    public Node visitBexprBop(SafeCParser.BexprBopContext ctx) {
        if(ctx.bop().AND() != null){
            return new AndNode(visit(ctx.bexpr(0)), visit(ctx.bexpr(1)));
        } else if(ctx.bop().OR() != null){
            return new OrNode(visit(ctx.bexpr(0)), visit(ctx.bexpr(1)));
        } else {
            throw new RuntimeException("BexprBop bop not valid.");
        }
    }

    @Override
    public Node visitBexprParens(SafeCParser.BexprParensContext ctx) {
        return visit(ctx.bexpr());
    }

    @Override
    public Node visitBexprBoolval(SafeCParser.BexprBoolvalContext ctx) {
        if(ctx.BOOLVAL().getSymbol().getType() == SafeCParser.BOOLVAL){
            return new BoolValNode(ctx.BOOLVAL().toString());
        } else {
            throw new RuntimeException("BexprBoolVal not valid input.");
        }
    }

    @Override
    public Node visitBop(SafeCParser.BopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Node visitVals(SafeCParser.ValsContext ctx) {
        if(ctx.CHARVAL() != null){
            return new CharValNode(ctx.CHARVAL().toString());
        } else if (ctx.STRVAL() != null){
            return new StringValNode(ctx.STRVAL().toString());
        } else if (ctx.BOOLVAL() != null){
            return new BoolValNode(ctx.BOOLVAL().toString());
        } else if (ctx.ID() != null){
            return new IdNode(ctx.ID().toString());
        } else if(visit(ctx.numberval()) != null) {
            return visit(ctx.numberval());
        }
        throw new RuntimeException("Vals undefined.");
    }

    @Override
    public Node visitRelop(SafeCParser.RelopContext ctx) {
      throw new RuntimeException("I dont think we should ever be here because, it all should have been done in VisitBexprRelop ");
    }

    @Override
    public Node visitAexprTimesDivNode(SafeCParser.AexprTimesDivNodeContext ctx) {
        if(ctx.op.getType() == SafeCParser.TIMES){
            return new TimesNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.op.getType() == SafeCParser.DIVISION){
            return new DivisionNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            return new ModNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        }
    }

    @Override
    public Node visitAexprAddSubNode(SafeCParser.AexprAddSubNodeContext ctx) {
        if(ctx.op.getType() == SafeCParser.PLUS){
            return new PlusNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            return new MinusNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        }
    }
   
    @Override 
    public Node visitAexprParensNode(SafeCParser.AexprParensNodeContext ctx) {
        return visit(ctx.aexpr());
    }
    
    @Override 
    public Node visitAexprIdNode(SafeCParser.AexprIdNodeContext ctx) {
        return new IdNode(ctx.ID().getText());
    }
    
    @Override 
    public Node visitAexprNumbervalNode(SafeCParser.AexprNumbervalNodeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Node visitAexprNumvalNode(SafeCParser.AexprNumvalNodeContext ctx) {
        return new NumvalNode(ctx.NUMVAL().toString());
    }

    @Override
    public Node visitAexprPiNode(SafeCParser.AexprPiNodeContext ctx) {
        return new PiNode();
    }
   
}
