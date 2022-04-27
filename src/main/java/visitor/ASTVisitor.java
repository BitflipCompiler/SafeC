package visitor;

import ast.*;
import ast.abstracts.*;

public abstract class ASTVisitor {

    public void visit(Node ctx){
        ctx.accept(this);
    }

    public abstract void visit(NotNode ctx);

    public abstract void visit(AndNode ctx);

    public abstract void visit(RelopEqualNode ctx);

    public abstract void visit(RelopNotEqualNode ctx);

    public abstract void visit(RelopLeqNode ctx);

    public abstract void visit(RelopGeqNode ctx);

    public abstract void visit(RelopLessNode ctx);

    public abstract void visit(RelopGreaterNode ctx);

    public abstract void visit(IdBoolValNode ctx);

    public abstract void visit(BoolValNode ctx);

    public abstract void visit(DivisionNode ctx);

    public abstract void visit(IdNode ctx);

    public abstract void visit(MinusNode ctx);

    public abstract void visit(ModNode ctx);

    public abstract void visit(Numberval ctx);

    public abstract void visit(NumvalNode ctx);

    public abstract void visit(PiNode ctx);

    public abstract void visit(PlusNode ctx);

    public abstract void visit(TimesNode ctx);

    public abstract void visit(ActualParamsNode ctx);

    public abstract void visit(ArrayBoolNode ctx);

    public abstract void visit(ArrayBoolValuesNode ctx);

    public abstract void visit(ArrayCharNode ctx);

    public abstract void visit(ArrayCharValuesNode ctx);

    public abstract void visit(ArrayDeclNode ctx);

    public abstract void visit(ArrayNumNode ctx);

    public abstract void visit(ArrayNumValuesNode ctx);

    public abstract void visit(ArrayStringNode ctx);

    public abstract void visit(ArrayStrValuesNode ctx);

    public abstract void visit(AssignNode ctx);

    public abstract void visit(Bexpr ctx);

    public abstract void visit(BoolDclAssignNode ctx);

    public abstract void visit(BoolDclNode ctx);

    public abstract void visit(BoolLitteralNode ctx);

    public abstract void visit(CaseBlockNode ctx);

    public abstract void visit(CharDclAssignNode ctx);

    public abstract void visit(CharDclNode ctx);

    public abstract void visit(CharValNode ctx);

    public abstract void visit(DclAssignSemiCommandNode ctx);

    public abstract void visit(DefCaseNode ctx);

    public abstract void visit(ForLoopNode ctx);

    public abstract void visit(FormalParamsNode ctx);

    public abstract void visit(ForParamsNode ctx);

    public abstract void visit(FuncBlockNode ctx);

    public abstract void visit(FuncCallsNode ctx);

    public abstract void visit(FuncDclNode ctx);

    public abstract void visit(IfStatementNode ctx);

    public abstract void visit(NumberLitteralNode ctx);

    public abstract void visit(NumDclAssignNode ctx);

    public abstract void visit(NumDclNode ctx);

    public abstract void visit(OrNode ctx);

    public abstract void visit(ProgNode ctx);

    public abstract void visit(SafeDclNode ctx);

    public abstract void visit(ScaseNode ctx);

    public abstract void visit(StringDclAssignNode ctx);

    public abstract void visit(StringDclNode ctx);

    public abstract void visit(StringLitteralNode ctx);

    public abstract void visit(StringValNode ctx);

    public abstract void visit(StructBlockNode ctx);

    public abstract void visit(StructDclNode ctx);

    public abstract void visit(SwitchStatementNode ctx);

    public abstract void visit(VoidLitteralNode ctx);

    public abstract void visit(WhileLoop ctx);

}
