import java.util.ArrayList;
import java.util.List;

public class CSTToASTVisitor extends Aexpr2BaseVisitor<ASTNode> {


    @Override
    public ASTNode visitProg(Aexpr2Parser.ProgContext ctx) {
        ASTProgNode progNode = new ASTProgNode();
        for(int i = 0; i < ctx.declaration().size(); i++){
            progNode.nodes.add(visit(ctx.declaration().get(i)));
        }
        return progNode;
    }

    @Override
    public ASTNode visitDeclaration(Aexpr2Parser.DeclarationContext ctx) {
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
    public ASTNode visitStructdcl(Aexpr2Parser.StructdclContext ctx) {
        return new ASTStructNode(ctx.ID().toString(), visit(ctx.structblock()));
    }

    @Override
    public ASTNode visitStructblock(Aexpr2Parser.StructblockContext ctx) {
        ASTStructBlockNode structBlocknode = new ASTStructBlockNode();
        for(int i = 0; i < ctx.safedeclaration().size(); i++){
            structBlocknode.safeDclNodes.add(visit(ctx.safedeclaration().get(i)));
        }
        return structBlocknode;
    }

    @Override
    public ASTNode visitDclassignsemi(Aexpr2Parser.DclassignsemiContext ctx) {
        if(ctx.vassign() != null){
            return visit(ctx.vassign());
        } else if ( ctx.safedeclaration() != null){
            return visit(ctx.safedeclaration());
        }
        throw new RuntimeException("Dclassignsemi not valid.");
    }

    @Override
    public ASTNode visitDclassignsemicommand(Aexpr2Parser.DclassignsemicommandContext ctx) {
        ASTDclAssignSemi astDclAssignSemi = new ASTDclAssignSemi();
        ASTCommandNode astCommandNode = new ASTCommandNode();
        if(ctx.dclassignsemi() != null){
            for(int i = 0; i < ctx.dclassignsemi().size(); i++){
               astDclAssignSemi.nodes.add(visit(ctx.dclassignsemi().get(i)));
            }
        }else if(ctx.command() != null) {
            for (int i = 0; i < ctx.command().size(); i++) {
                 astCommandNode.nodes.add(visit(ctx.command().get(i)));
            }
        }
        return new ASTDclAssignSemiCommandNode(astDclAssignSemi, astCommandNode);
    }

    @Override
    public ASTNode visitSafedeclaration(Aexpr2Parser.SafedeclarationContext ctx) {
        if(ctx.vdclassign() != null){
            return new ASTSafeDclNode(ctx.SAFETY().toString(), visit(ctx.vdclassign()));
        } else if(ctx.vdcl() != null){
            return new ASTSafeDclNode(ctx.SAFETY().toString(), visit(ctx.vdcl()));
        }
        throw new RuntimeException("safedeclaration not valid.");
    }

    @Override
    public ASTNode visitParams(Aexpr2Parser.ParamsContext ctx) {
        ASTFormalParamsNode astFormalParamsNode = new ASTFormalParamsNode();
        for(int i = 0; i < ctx.vdcl().size();i++){
            astFormalParamsNode.vdcls.add(visit(ctx.vdcl().get(i)));
        }
        return astFormalParamsNode;
    }

    @Override
    public ASTNode visitBlock(Aexpr2Parser.BlockContext ctx) {
        return visit(ctx.dclassignsemicommand());
    }

    @Override
    public ASTNode visitCaseblock(Aexpr2Parser.CaseblockContext ctx) {
        if(ctx.BREAK() != null){
            return new ASTCaseBlockNode(visit(ctx.dclassignsemicommand()), ctx.BREAK().toString());
        } else {
            return new ASTCaseBlockNode(visit(ctx.dclassignsemicommand()));
        }
    }

    @Override
    public ASTNode visitVdcl(Aexpr2Parser.VdclContext ctx) {
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
    public ASTNode visitArraydecl(Aexpr2Parser.ArraydeclContext ctx) {
        return new ASTArrayDecl(visit(ctx.arrdcltype()),ctx.ID().toString());
    }

    @Override
    public ASTNode visitArrdcltype(Aexpr2Parser.ArrdcltypeContext ctx) {
        if(ctx.NUMDCL() != null){
            return new ASTNumberLitteralNode();
        } else if (ctx.CHARDCL() != null){
            return new ASTCharLitteralNode();
        } else if(ctx.STRDCL() != null){
            return new ASTStringLitteralNode();
        } else if (ctx.BOOLDCL() != null){
            return new ASTBoolLitteralNode();
        }
        throw new RuntimeException("Datatype not valid exception.");
    }

    @Override
    public ASTNode visitVassign(Aexpr2Parser.VassignContext ctx) {
        return new ASTAssignNode(ctx.ID().toString(), visit(ctx.atypes()));
    }

    @Override
    public ASTNode visitVdclassign(Aexpr2Parser.VdclassignContext ctx) {
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
    public ASTNode visitArraydclassign(Aexpr2Parser.ArraydclassignContext ctx) {
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
    public ASTNode visitNumarraydclassign(Aexpr2Parser.NumarraydclassignContext ctx) {
        return new ASTArrayNumNode(ctx.ID().toString(), visit(ctx.numarray()));
    }

    @Override
    public ASTNode visitChararraydclassign(Aexpr2Parser.ChararraydclassignContext ctx) {
        return new ASTArrayCharNode(ctx.ID().toString(), visit(ctx.chararray()));
    }

    @Override
    public ASTNode visitStringarraydclassign(Aexpr2Parser.StringarraydclassignContext ctx) {
        return new ASTArrayStringNode(ctx.ID().toString(), visit(ctx.strarray()));
    }

    @Override
    public ASTNode visitBoolarraydclassign(Aexpr2Parser.BoolarraydclassignContext ctx) {
        return new ASTArrayBoolNode(ctx.ID().toString(), visit(ctx.boolarray()));
    }

    @Override
    public ASTNode visitDatatype(Aexpr2Parser.DatatypeContext ctx) {
        if(ctx.NUMDCL() != null){
            return new ASTNumberLitteralNode();
        } else if (ctx.CHARDCL() != null){
            return new ASTCharLitteralNode();
        } else if(ctx.STRDCL() != null){
            return new ASTStringLitteralNode();
        } else if (ctx.BOOLDCL() != null){
            return new ASTBoolLitteralNode();
        } else if (ctx.VOIDDCL() != null){
            return new ASTVoidLitteralNode();
        }
        throw new RuntimeException("Datatype not valid exception.");
    }

    @Override
    public ASTNode visitAtypes(Aexpr2Parser.AtypesContext ctx) {
        if(ctx.CHARVAL() != null){
            return new ASTCharValNode(ctx.CHARVAL().toString());
        } else if(ctx.STRVAL() != null){
            return new ASTStringValNode(ctx.STRVAL().toString());
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
    public ASTNode visitArrayassign(Aexpr2Parser.ArrayassignContext ctx) {
        return visit(ctx.arraydata());
    }

    @Override
    public ASTNode visitArraydata(Aexpr2Parser.ArraydataContext ctx) {
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
    public ASTNode visitNumarray(Aexpr2Parser.NumarrayContext ctx) {
        ASTArrayNumValuesNode astArrayNumValuesNode = new ASTArrayNumValuesNode();
        for(int i = 0; i < ctx.numberval().size();i++){
            astArrayNumValuesNode.numValues.add(visit(ctx.numberval().get(i)));
        }
        return astArrayNumValuesNode;
    }

    @Override
    public ASTNode visitChararray(Aexpr2Parser.ChararrayContext ctx) {
        ASTArrayCharValuesNode astArrayCharValuesNode = new ASTArrayCharValuesNode();
        for(int i = 0; i < ctx.CHARVAL().size();i++){
            astArrayCharValuesNode.charvalues.add(visit(ctx.CHARVAL().get(i)));
        }
        return astArrayCharValuesNode;
    }

    @Override
    public ASTNode visitStrarray(Aexpr2Parser.StrarrayContext ctx) {
        ASTArrayStrValuesNode astArrayStrValuesNode = new ASTArrayStrValuesNode();
        for(int i = 0; i < ctx.STRVAL().size();i++){
            astArrayStrValuesNode.strValues.add(visit(ctx.STRVAL().get(i)));
        }
        return astArrayStrValuesNode;
    }

    @Override
    public ASTNode visitBoolarray(Aexpr2Parser.BoolarrayContext ctx) {
        ASTArrayBoolValuesNode astArrayBoolValuesNode = new ASTArrayBoolValuesNode();
        for(int i = 0; i < ctx.BOOLVAL().size();i++){
            astArrayBoolValuesNode.boolValues.add(visit(ctx.BOOLVAL().get(i)));
        }
        return astArrayBoolValuesNode;
    }

    @Override
    public ASTNode visitCommand(Aexpr2Parser.CommandContext ctx) {
        if(ctx.ctrlstruct() != null){
            return visit(ctx.ctrlstruct());
        }else if(ctx.funccalls() != null){
            return visit(ctx.funccalls());
        }
        throw new RuntimeException("Something went wrong in visitCommand");
    }

    @Override
    public ASTNode visitFunccalls(Aexpr2Parser.FunccallsContext ctx) {
        if(ctx.callparams() != null){
            return new ASTFuncCalls(ctx.ID().toString(),visit(ctx.callparams()));
        }else if(ctx.callparams() == null){
            return new ASTFuncCalls(ctx.ID().toString());
        }
        throw new RuntimeException("Something went wrong in VisitFuncCalls");
    }

    @Override
    public ASTNode visitFuncdcl(Aexpr2Parser.FuncdclContext ctx) {
        if(ctx.params() != null){
            return new ASTFuncDcl(visit(ctx.datatype()),ctx.ID().toString(),visit(ctx.params()),visit(ctx.funcblock()));
        }else if(ctx.params() == null){
            return new ASTFuncDcl(visit(ctx.datatype()),ctx.ID().toString(),visit(ctx.funcblock()));
        }
        throw new RuntimeException("Something went wrong in visitFuncDcl");
    }

    @Override
    public ASTNode visitFuncblock(Aexpr2Parser.FuncblockContext ctx) {
        return new ASTFuncBlockNode(visit(ctx.dclassignsemicommand()), visit(ctx.vals()));
    }

    @Override
    public ASTNode visitCallparams(Aexpr2Parser.CallparamsContext ctx) {
        ASTActualParamsNode astActualParamsNode = new ASTActualParamsNode();
        for(int i = 0; i < ctx.vals().size();i++){
            astActualParamsNode.vals.add(visit(ctx.vals().get(i)));
        }
        return astActualParamsNode;
    }

    @Override
    public ASTNode visitCtrlstruct(Aexpr2Parser.CtrlstructContext ctx) {
        if(ctx.iterative() != null){
            return visit(ctx.iterative());
        }else if(ctx.selective() != null){
            return visit(ctx.selective());
        }
        throw new RuntimeException("Something went wrong in visitCtrlStruct");
    }

    @Override
    public ASTNode visitForLoop(Aexpr2Parser.ForLoopContext ctx) {
        return new ASTForLoop(visit(ctx.forparams()), visit(ctx.block()));
    }

    @Override
    public ASTNode visitWhileLoop(Aexpr2Parser.WhileLoopContext ctx) {
        return new ASTWhileLoop(visit(ctx.bexpr()),visit(ctx.block()));
    }

    @Override
    public ASTNode visitIfStatement(Aexpr2Parser.IfStatementContext ctx) {
        if(ctx.block().size() == 2){
            return new ASTIfStatementNode(visit(ctx.iflogic()),visit(ctx.block(0)),visit(ctx.block(1)));
        }else{
            return new ASTIfStatementNode(visit(ctx.iflogic()),visit(ctx.block(0)),null);
        }
    }

    @Override
    public ASTNode visitSwitchStatement(Aexpr2Parser.SwitchStatementContext ctx) {
        List<ASTNode> scases = new ArrayList<>();
        for(int i = 0; i < ctx.scase().size(); i++){
            scases.add(visit(ctx.scase().get(i)));
        }
        return new ASTSwitchStatementNode(ctx.ID().toString(),scases,visit(ctx.defcase()));
    }

    @Override
    public ASTNode visitIflogic(Aexpr2Parser.IflogicContext ctx) {
        return visit(ctx.bexpr());
    }

    @Override
    public ASTNode visitForparams(Aexpr2Parser.ForparamsContext ctx) {
        return new ASTForParams(visit(ctx.numdclassign()), visit(ctx.bexpr()), ctx.ID().toString(), visit(ctx.aexpr()));
    }

    @Override
    public ASTNode visitScase(Aexpr2Parser.ScaseContext ctx) {
        return new ASTScaseNode(visit(ctx.vals()), visit(ctx.caseblock()));
    }

    @Override
    public ASTNode visitDefcase(Aexpr2Parser.DefcaseContext ctx) {
        return new ASTDefCaseNode(visit(ctx.caseblock()));
    }

    @Override
    public ASTNode visitNumdecl(Aexpr2Parser.NumdeclContext ctx) {
        return new ASTNumDclNode(ctx.ID().toString());
    }

    @Override
    public ASTNode visitBooldecl(Aexpr2Parser.BooldeclContext ctx) {
        return new ASTBoolDclNode(ctx.ID().toString());
    }

    @Override
    public ASTNode visitChardecl(Aexpr2Parser.ChardeclContext ctx) {
        return new ASTCharDclNode(ctx.ID().toString());
    }

    @Override
    public ASTNode visitStringdecl(Aexpr2Parser.StringdeclContext ctx) {
        return new ASTStringDclNode(visit(ctx.ID()).toString());
    }

    @Override
    public ASTNode visitNumdclassign(Aexpr2Parser.NumdclassignContext ctx) {
        return new ASTNumDclAssignNode(visit(ctx.numdecl()), visit(ctx.aexpr()));
    }

    @Override
    public ASTNode visitChardclassign(Aexpr2Parser.ChardclassignContext ctx) {
        return new ASTCharDclAssignNode(visit(ctx.chardecl()), new ASTCharValNode(visit(ctx.CHARVAL()).toString()));
    }

    @Override
    public ASTNode visitStringdclassign(Aexpr2Parser.StringdclassignContext ctx) {
        return new ASTStringDclAssignNode(visit(ctx.stringdecl()), new ASTStringValNode(visit(ctx.STRVAL()).toString()));
    }

    @Override
    public ASTNode visitBooldclassign(Aexpr2Parser.BooldclassignContext ctx) {
        return new ASTBoolDclAssignNode(visit(ctx.booldecl()), visit(ctx.bexpr()));
    }

    @Override
    public ASTNode visitBexprRelop(Aexpr2Parser.BexprRelopContext ctx) {
        if(ctx.relop().EQ() != null){
            return new ASTRelopEqualNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().NEQ() != null){
            return new ASTRelopNotEqualNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().LEQ() != null){
            return new ASTRelopLeqNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().GEQ() != null){
            return new ASTRelopGeqNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().LESS() != null){
            return new ASTRelopLessNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.relop().GREATER() != null){
            return new ASTRelopGreaterNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            throw new RuntimeException("BexprBop bop not valid.");
        }
    }

    @Override
    public ASTNode visitNOTBexpr(Aexpr2Parser.NOTBexprContext ctx) {
        return new ASTNotNode(visit(ctx.bexpr()));
    }

    @Override
    public ASTNode visitBexprIDBoolval(Aexpr2Parser.BexprIDBoolvalContext ctx) {
        return new ASTIdBoolValNode(ctx.ID().getText(), ctx.BOOLVAL().getText());
    }

    @Override
    public ASTNode visitBexprBop(Aexpr2Parser.BexprBopContext ctx) {
        if(ctx.bop().AND() != null){
            return new ASTAndNode(visit(ctx.bexpr(0)), visit(ctx.bexpr(1)));
        } else if(ctx.bop().OR() != null){
            return new ASTOrNode(visit(ctx.bexpr(0)), visit(ctx.bexpr(1)));
        } else {
            throw new RuntimeException("BexprBop bop not valid.");
        }
    }

    @Override
    public ASTNode visitBexprParens(Aexpr2Parser.BexprParensContext ctx) {
        return visit(ctx.bexpr());
    }

    @Override
    public ASTNode visitBexprBoolval(Aexpr2Parser.BexprBoolvalContext ctx) {
        if(ctx.BOOLVAL().getSymbol().getType() == Aexpr2Parser.BOOLVAL){
            return new ASTBoolValNode(ctx.BOOLVAL().toString());
        } else {
            throw new RuntimeException("BexprBoolVal not valid input.");
        }
    }

    @Override
    public ASTNode visitBop(Aexpr2Parser.BopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitVals(Aexpr2Parser.ValsContext ctx) {
        if(ctx.CHARVAL() != null){
            return new ASTCharValNode(ctx.CHARVAL().toString());
        } else if (ctx.STRVAL() != null){
            return new ASTStringValNode(ctx.STRVAL().toString());
        } else if (ctx.BOOLVAL() != null){
            return new ASTBoolValNode(ctx.BOOLVAL().toString());
        } else if (ctx.ID() != null){
            return new ASTIdNode(ctx.ID().toString());
        } else if(visit(ctx.numberval()) != null) {
            return visit(ctx.numberval());
        }
        throw new RuntimeException("Vals undefined.");
    }

    @Override
    public ASTNode visitRelop(Aexpr2Parser.RelopContext ctx) {
      throw new RuntimeException("I dont think we should ever be here because, it all should have been done in VisitBexprRelop ");
    }

    @Override
    public ASTNode visitAexprTimesDivNode(Aexpr2Parser.AexprTimesDivNodeContext ctx) {
        if(ctx.op.getType() == Aexpr2Parser.TIMES){
            return new ASTTimesNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else if(ctx.op.getType() == Aexpr2Parser.DIVISION){
            return new ASTDivisionNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            return new ASTModNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        }
    }

    @Override
    public ASTNode visitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx) {
        if(ctx.op.getType() == Aexpr2Parser.PLUS){
            return new ASTPlusNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        } else {
            return new ASTMinusNode(visit(ctx.aexpr(0)), visit(ctx.aexpr(1)));
        }
    }
   
    @Override 
    public ASTNode visitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx) {
        return visit(ctx.aexpr());
    }
    
    @Override 
    public ASTNode visitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx) {
        return new ASTIdNode(ctx.ID().getText());
    }
    
    @Override 
    public ASTNode visitAexprNumbervalNode(Aexpr2Parser.AexprNumbervalNodeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ASTNode visitAexprNumvalNode(Aexpr2Parser.AexprNumvalNodeContext ctx) {
        return new ASTNumvalNode(ctx.NUMVAL().toString());
    }

    @Override
    public ASTNode visitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx) {
        return new ASTPiNode();
    }
   
}
