package service;

import ast.*;
import ast.abstracts.FuncCalls;
import ast.abstracts.FuncDcl;
import ast.abstracts.Node;
import gen.SafeCBaseVisitor;
import gen.SafeCLexer;
import gen.SafeCParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CSTToASTVisitorTest extends SafeCBaseVisitor<Node> {

    CSTToASTVisitor cstToASTVisitor;

    @BeforeEach
    public void setup(){
        cstToASTVisitor = new CSTToASTVisitor();
    }

    /*
     * Creates a SafeCParser from string
     */
    SafeCParser getParserFromString(String string) throws IOException {
        SafeCLexer lexer = new SafeCLexer(CharStreams.fromString(string));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        return new SafeCParser(commonTokenStream);
    }

    /*
     * ProgNode can be many things, we have tested with safedcl and function
     */
    @Test
    void testVisitProg() throws IOException {
        SafeCParser parser = getParserFromString("""
                #1 number decl1;
                #1 string decl2;
                number stop(){
                    on = false;
                	return 0;
                }""");
        ProgNode progNode = (ProgNode) cstToASTVisitor.visitProg(parser.prog());

        assertEquals(3, progNode.nodes.size());
        assertEquals("SafeDclNode",progNode.nodes.get(0).getClass().getSimpleName());
        assertEquals("SafeDclNode",progNode.nodes.get(1).getClass().getSimpleName());
        assertEquals("FuncDcl",progNode.nodes.get(2).getClass().getSimpleName());
    }

    /*
     * If the Declaration that ends up  FuncDcl, dclassignSemi or structdcl
     */
    @Test
    void testVisitDeclaration() throws IOException {
        //funcdcl
        SafeCParser parser = getParserFromString("""
                void start(){
                    on = true;
                    return 0;
                }""");
        Node node = cstToASTVisitor.visitDeclaration(parser.declaration());
        assertEquals("FuncDcl",node.getClass().getSimpleName());

        //dclassignsemi
        parser = getParserFromString("#1 number decl3;");
        node = cstToASTVisitor.visitDeclaration(parser.declaration());
        assertEquals("SafeDclNode",node.getClass().getSimpleName());

        //structdcl
        parser = getParserFromString("""
                $ poopx {
                 #7 string x;
                 }""");
        node = cstToASTVisitor.visitDeclaration(parser.declaration());
        assertEquals("StructNode",node.getClass().getSimpleName());
    }

    /*
     * If the VisitStructDcl ends up beeing a StructDcl
     */
    @Test
    void testVisitStructdcl() throws IOException {
        SafeCParser parser = getParserFromString("""
                $ poopx {
                #7 string x;
                }""");
        StructNode structNode = (StructNode) cstToASTVisitor.visitStructdcl(parser.structdcl());
        assertEquals("StructNode",structNode.getClass().getSimpleName());
    }

    @Test
    void testVisitStructblock() throws IOException {
        SafeCParser parser = getParserFromString("{#7 number x = 5;}");
        StructBlockNode structBlockNode = (StructBlockNode) cstToASTVisitor.visitStructblock(parser.structblock());
        assertEquals(1,structBlockNode.safeDclNodes.size());
        assertEquals("StructBlockNode", structBlockNode.getClass().getSimpleName());
    }

    @Test
    void testVisitDclassignsemi() throws IOException {
        //VAssign test
        SafeCParser parser = getParserFromString("x = 8;");
        Node node = cstToASTVisitor.visitDclassignsemi(parser.dclassignsemi());
        assertEquals("AssignNode",node.getClass().getSimpleName());
        //Safedcl test
        parser = getParserFromString("#7 number x;");
        node = cstToASTVisitor.visitDclassignsemi(parser.dclassignsemi());
        assertEquals("SafeDclNode",node.getClass().getSimpleName());
    }
    /*
     * This one is wierd in the Grammar, so it will be hard to make this kind of guess of what the result
     * will become, since it as actual and recursive as fields.
     */
    @Test
    void testVisitDclassignsemicommand() throws IOException {
        SafeCParser parser = getParserFromString("""
                #7 number x = 7;\s
                if(x==y){}
                #7 number x = 8;""");
        DclAssignSemiCommandNode dclAssignSemiCommandNode = (DclAssignSemiCommandNode) cstToASTVisitor.visitDclassignsemicommand(parser.dclassignsemicommand());
        assertEquals("DclAssignSemiCommandNode", dclAssignSemiCommandNode.getClass().getSimpleName());
    }

    @Test
    void testVisitSafedeclaration() throws IOException {
        //Declaration
        SafeCParser parser = getParserFromString("#7 number x;");
        SafeDclNode safeDclNode = (SafeDclNode) cstToASTVisitor.visitSafedeclaration(parser.safedeclaration());
        assertEquals("#7",safeDclNode.safety);
        assertEquals("NumDclNode",safeDclNode.variable.getClass().getSimpleName());
        assertEquals("SafeDclNode", safeDclNode.getClass().getSimpleName());

        //Declaration + Assignment
        parser = getParserFromString("#3 number x = 10;");
        safeDclNode = (SafeDclNode) cstToASTVisitor.visitSafedeclaration(parser.safedeclaration());
        assertEquals("#3",safeDclNode.safety);
        assertEquals("NumDclAssignNode",safeDclNode.variable.getClass().getSimpleName());
        assertEquals("SafeDclNode", safeDclNode.getClass().getSimpleName());

    }

    @Test
    void testVisitParams() throws IOException {
        //number x, number y, number z
        SafeCParser parser = getParserFromString("number x, string y, boolean z, char c, [number] a");
        FormalParamsNode formalParamsNode = (FormalParamsNode) cstToASTVisitor.visitParams(parser.params());
        assertEquals(5, formalParamsNode.vdcls.size());
        assertEquals("FormalParamsNode", formalParamsNode.getClass().getSimpleName());
        assertEquals("NumDclNode", formalParamsNode.vdcls.get(0).getClass().getSimpleName());
        assertEquals("StringDclNode", formalParamsNode.vdcls.get(1).getClass().getSimpleName());
        assertEquals("BoolDclNode", formalParamsNode.vdcls.get(2).getClass().getSimpleName());
        assertEquals("CharDclNode", formalParamsNode.vdcls.get(3).getClass().getSimpleName());
        assertEquals("ArrayDeclNode", formalParamsNode.vdcls.get(4).getClass().getSimpleName());
    }

    @Test
    void testVisitBlock() throws IOException {
        //EmptyNode
        SafeCParser parser = getParserFromString("{}");
        Node node = cstToASTVisitor.visitBlock(parser.block());
        assertEquals("EmptyNode", node.getClass().getSimpleName());

        //DclAssignSemiCommandNode
        parser = getParserFromString("{#7 number x;}");
        node = cstToASTVisitor.visitBlock(parser.block());
        assertEquals("DclAssignSemiCommandNode", node.getClass().getSimpleName());

    }

    @Test
    void testVisitCaseblock() throws IOException {
        SafeCParser parser = getParserFromString("#7 number x; break;");
        CaseBlockNode caseBlockNode = cstToASTVisitor.visitCaseblock(parser.caseblock());
        assertEquals("DclAssignSemiCommandNode", caseBlockNode.dclAssignCommand.getClass().getSimpleName());
        assertEquals("break;",caseBlockNode.optbreak);
        assertEquals("CaseBlockNode",caseBlockNode.getClass().getSimpleName());
    }

    @Test
    void testVisitVdcl() throws IOException {
        //NumDcl
        SafeCParser parser = getParserFromString("number x");
        Node node = cstToASTVisitor.visitVdcl(parser.vdcl());
        assertEquals("NumDclNode", node.getClass().getSimpleName());
        //CharDcl
        parser = getParserFromString("char x");
        node = cstToASTVisitor.visitVdcl(parser.vdcl());
        assertEquals("CharDclNode", node.getClass().getSimpleName());
        //StringDcl
        parser = getParserFromString("string x");
        node = cstToASTVisitor.visitVdcl(parser.vdcl());
        assertEquals("StringDclNode", node.getClass().getSimpleName());
        //BooleanDcl
        parser = getParserFromString("boolean x");
        node = cstToASTVisitor.visitVdcl(parser.vdcl());
        assertEquals("BoolDclNode",node.getClass().getSimpleName());
        //ArrayDcl
        parser = getParserFromString("[number] x");
        node = cstToASTVisitor.visitVdcl(parser.vdcl());
        assertEquals("ArrayDeclNode",node.getClass().getSimpleName());

    }

    @Test
    void testVisitArraydecl() throws IOException {
        SafeCParser parser = getParserFromString("[number] x");
        ArrayDeclNode arrayDeclNode = (ArrayDeclNode) cstToASTVisitor.visitArraydecl(parser.arraydecl());
        assertEquals("ArrayDeclNode",arrayDeclNode.getClass().getSimpleName());
        assertEquals("x", arrayDeclNode.id);
        assertEquals("NumberLitteralNode",arrayDeclNode.arrdcltype.getClass().getSimpleName());
    }

    @Test
    void testVisitArrdcltype() throws IOException {
        //NUMDCL
        SafeCParser parser = getParserFromString("number");
        Node node = cstToASTVisitor.visitArrdcltype(parser.arrdcltype());
        assertEquals("NumberLitteralNode", node.getClass().getSimpleName());
        //CHARDCL
        parser = getParserFromString("char");
        node = cstToASTVisitor.visitArrdcltype(parser.arrdcltype());
        assertEquals("CharLitteralNode", node.getClass().getSimpleName());
        //STRDCL
        parser = getParserFromString("string");
        node = cstToASTVisitor.visitArrdcltype(parser.arrdcltype());
        assertEquals("StringLitteralNode", node.getClass().getSimpleName());
        //BOOLDCL;
        parser = getParserFromString("boolean");
        node = cstToASTVisitor.visitArrdcltype(parser.arrdcltype());
        assertEquals("BoolLitteralNode", node.getClass().getSimpleName());
    }

    @Test
    void testVisitVassign() throws IOException {

        //number
        SafeCParser parser = getParserFromString("x = 10");
        AssignNode assignNode = cstToASTVisitor.visitVassign(parser.vassign());
        assertEquals("AssignNode", assignNode.getClass().getSimpleName());
        assertEquals("x",assignNode.id);
        assertEquals("NumvalNode", assignNode.atypes.getClass().getSimpleName());

        //boolean
        parser = getParserFromString("x = true;");
        assignNode = cstToASTVisitor.visitVassign(parser.vassign());
        assertEquals("x",assignNode.id);
        assertEquals("BoolValNode", assignNode.atypes.getClass().getSimpleName());

        //char
        parser = getParserFromString("x = 'c';");
        assignNode = cstToASTVisitor.visitVassign(parser.vassign());
        assertEquals("x",assignNode.id);
        assertEquals("CharValNode", assignNode.atypes.getClass().getSimpleName());

        //string
        parser = getParserFromString("x = \"Name\"");
        assignNode = cstToASTVisitor.visitVassign(parser.vassign());
        assertEquals("x",assignNode.id);
        assertEquals("StringValNode", assignNode.atypes.getClass().getSimpleName());

        //Func
        parser = getParserFromString("x = x(x)");
        assignNode = cstToASTVisitor.visitVassign(parser.vassign());
        assertEquals("x",assignNode.id);
        assertEquals("FuncCalls", assignNode.atypes.getClass().getSimpleName());

    }

    @Test
    void testVisitVdclassign() throws IOException {
        //number
        SafeCParser parser = getParserFromString("number x = 7");
        Node node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("NumDclAssignNode", node.getClass().getSimpleName());
        //Char
        parser = getParserFromString("char x = 'c'");
        node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("CharDclAssignNode", node.getClass().getSimpleName());
        //String
        parser = getParserFromString("string x = \"fuel\"");
        node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("StringDclAssignNode", node.getClass().getSimpleName());
        //Bool
        parser = getParserFromString("boolean x = true");
        node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("BoolDclAssignNode", node.getClass().getSimpleName());
        //Array
        parser = getParserFromString("[number] x = [10]");
        node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("ArrayNumNode", node.getClass().getSimpleName());


    }

    @Test
    void testVisitArraydclassign() throws IOException {
        //number
        SafeCParser parser = getParserFromString("[number] x = [10,8,10,44];");
        Node node = cstToASTVisitor.visitArraydclassign(parser.arraydclassign());
        assertEquals("ArrayNumNode", node.getClass().getSimpleName());
        //char
        parser = getParserFromString("[char] x = ['a','b','c','d','e']");
        node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("ArrayCharNode", node.getClass().getSimpleName());
        //String
        parser = getParserFromString("[string] x = [\"Jonathan\",\"Tommy\", \"KarlEmil\", \"Nicolai\"]");
        node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("ArrayStringNode", node.getClass().getSimpleName());
        //Bool
        parser = getParserFromString("[boolean] x = [true, false, true, false]");
        node = cstToASTVisitor.visitVdclassign(parser.vdclassign());
        assertEquals("ArrayBoolNode", node.getClass().getSimpleName());
    }

    @Test
    void testVisitNumarraydclassign() throws IOException {
        SafeCParser parser = getParserFromString("[number] x = [10,8,10,44];");
        ArrayNumNode arraydclassign = (ArrayNumNode) cstToASTVisitor.visitNumarraydclassign(parser.numarraydclassign());
        assertEquals("ArrayNumNode", arraydclassign.getClass().getSimpleName());
        assertEquals("x", arraydclassign.id);
        assertEquals("ArrayNumValuesNode",arraydclassign.numArray.getClass().getSimpleName());
    }

    @Test
    void testVisitChararraydclassign() throws IOException {
        SafeCParser parser = getParserFromString("[char] y = ['a','b','c','d','e']");
        ArrayCharNode arrayCharNode = (ArrayCharNode) cstToASTVisitor.visitChararraydclassign(parser.chararraydclassign());
        assertEquals("ArrayCharNode", arrayCharNode.getClass().getSimpleName());
        assertEquals("y", arrayCharNode.id);
        assertEquals("ArrayCharValuesNode",arrayCharNode.charArray.getClass().getSimpleName());
    }

    @Test
    void testVisitStringarraydclassign() throws IOException {
        SafeCParser parser = getParserFromString("[string] z = [\"Jonathan\",\"Tommy\", \"KarlEmil\", \"Nicolai\"]");
        ArrayStringNode arrayStringNode = (ArrayStringNode) cstToASTVisitor.visitStringarraydclassign(parser.stringarraydclassign());
        assertEquals("ArrayStringNode", arrayStringNode.getClass().getSimpleName());
        assertEquals("z", arrayStringNode.id);
        assertEquals("ArrayStrValuesNode",arrayStringNode.stringArray.getClass().getSimpleName());
    }

    @Test
    void testVisitBoolarraydclassign() throws IOException {
        SafeCParser parser = getParserFromString("[boolean] w = [true, false, true, false]");
        ArrayBoolNode arrayBoolNode = (ArrayBoolNode) cstToASTVisitor.visitBoolarraydclassign(parser.boolarraydclassign());
        assertEquals("ArrayBoolNode", arrayBoolNode.getClass().getSimpleName());
        assertEquals("w", arrayBoolNode.id);
        assertEquals("ArrayBoolValuesNode",arrayBoolNode.boolArray.getClass().getSimpleName());
    }

    @Test
    void testVisitDatatype() throws IOException {
        //Numberliteral
        SafeCParser parser = getParserFromString("number");
        Node node = cstToASTVisitor.visitDatatype(parser.datatype());
        assertEquals("NumberLitteralNode",node.getClass().getSimpleName());
        //CharLiteral
        parser = getParserFromString("char");
        node = cstToASTVisitor.visitDatatype(parser.datatype());
        assertEquals("CharLitteralNode",node.getClass().getSimpleName());
        //StringLiteral
        parser = getParserFromString("string");
        node = cstToASTVisitor.visitDatatype(parser.datatype());
        assertEquals("StringLitteralNode",node.getClass().getSimpleName());
        //BoolLiteral
        parser = getParserFromString("boolean");
        node = cstToASTVisitor.visitDatatype(parser.datatype());
        assertEquals("BoolLitteralNode",node.getClass().getSimpleName());
        //VoidLiteral
        parser = getParserFromString("void");
        node = cstToASTVisitor.visitDatatype(parser.datatype());
        assertEquals("VoidLitteralNode",node.getClass().getSimpleName());
    }

    @Test
    void testVisitAtypes() throws IOException {
        //aexpr
        SafeCParser parser = getParserFromString("10 + 10 - 48");
        Node node = cstToASTVisitor.visitAtypes(parser.atypes());
        assertEquals("MinusNode", node.getClass().getSimpleName());
        // bexpr
        parser = getParserFromString("x == true");
        node = cstToASTVisitor.visitAtypes(parser.atypes());
        assertEquals("IdBoolValNode", node.getClass().getSimpleName());
        // CHARVAL
        parser = getParserFromString("'c'");
        node = cstToASTVisitor.visitAtypes(parser.atypes());
        assertEquals("CharValNode", node.getClass().getSimpleName());
        // STRVAL
        parser = getParserFromString("\"string\"");
        node = cstToASTVisitor.visitAtypes(parser.atypes());
        assertEquals("StringValNode", node.getClass().getSimpleName());
        // funccalls
        parser = getParserFromString("cat()");
        node = cstToASTVisitor.visitAtypes(parser.atypes());
        assertEquals("FuncCalls", node.getClass().getSimpleName());
        // TODO arrayassign is not part of visitor atm
        //parser = getParserFromString("[19, 10]");
        //node = cstToASTVisitor.visitAtypes(parser.atypes());
        //assertEquals("", node.getClass().getSimpleName());
    }

    @Test
    void testVisitArrayassign() throws IOException {
        SafeCParser parser = getParserFromString("[10]");
        Node node = cstToASTVisitor.visitArrayassign(parser.arrayassign());
        assertEquals("ArrayNumValuesNode",node.getClass().getSimpleName());


    }

    @Test
    void testVisitArraydata() throws IOException {
        SafeCParser parser = getParserFromString("10,20,30");
        Node node = cstToASTVisitor.visitArraydata(parser.arraydata());
        assertEquals("ArrayNumValuesNode", node.getClass().getSimpleName());

    }

    @Test
    void testVisitNumarray() throws IOException {
        SafeCParser parser = getParserFromString("10,20,30");
        Node node = cstToASTVisitor.visitNumarray(parser.numarray());
        assertEquals("ArrayNumValuesNode", node.getClass().getSimpleName());
    }

    @Test
    void testVisitChararray() throws IOException {
        SafeCParser parser = getParserFromString("'c','a','b'");
        Node node = cstToASTVisitor.visitChararray(parser.chararray());
        assertEquals("ArrayCharValuesNode", node.getClass().getSimpleName());
    }

    @Test
    void testVisitStrarray() throws IOException {
        SafeCParser parser = getParserFromString("\"Jonathan\",\"Tommy\",\"Karlemil\", \"Nicolai\"");
        Node node = cstToASTVisitor.visitStrarray(parser.strarray());
        assertEquals("ArrayStrValuesNode", node.getClass().getSimpleName());
    }

    @Test
    void testVisitBoolarray() throws IOException {
        SafeCParser parser = getParserFromString("true, false, true, false");
        Node node = cstToASTVisitor.visitBoolarray(parser.boolarray());
        assertEquals("ArrayBoolValuesNode", node.getClass().getSimpleName());
    }
        //TODO To be continued
    @Test
    void testVisitCommand() throws IOException {
        SafeCParser parser = getParserFromString("if(true){}");
        Node node = cstToASTVisitor.visitCommand(parser.command());
        assertEquals("IfStatementNode",node.getClass().getSimpleName());
    }

    @Test
    void testVisitFunccalls() throws IOException{
        SafeCParser parser = getParserFromString("x(y)");
        FuncCalls funcCalls = cstToASTVisitor.visitFunccalls(parser.funccalls());
        assertEquals("FuncCalls", funcCalls.getClass().getSimpleName());
    }

    @Test
    void testVisitFuncdcl() throws IOException {
        SafeCParser parser = getParserFromString("number x () {return x;}");
        FuncDcl funcDcl = cstToASTVisitor.visitFuncdcl(parser.funcdcl());
        assertEquals("x", funcDcl.id);
        assertEquals("FuncBlockNode", funcDcl.funcblock.getClass().getSimpleName());
        assertNull(funcDcl.params);
        assertEquals("NumberLitteralNode", funcDcl.datatype.getClass().getSimpleName());
        assertEquals("FuncDcl", funcDcl.getClass().getSimpleName());
    }

    @Test
    void testVisitFuncblock() throws IOException {
        SafeCParser parser = getParserFromString("{x = 7; return x;}");
        FuncBlockNode funcBlockNode = cstToASTVisitor.visitFuncblock(parser.funcblock());
        assertEquals("FuncBlockNode", funcBlockNode.getClass().getSimpleName());
        assertEquals("IdNode", funcBlockNode.returnValue.getClass().getSimpleName());
        assertEquals("DclAssignSemiCommandNode", funcBlockNode.dclAssignSemiCommand.getClass().getSimpleName());
    }

    @Test
    void testVisitCallparams() throws IOException {
        SafeCParser parser = getParserFromString("x, y, x, i");
        ActualParamsNode actualParamsNode = cstToASTVisitor.visitCallparams(parser.callparams());
        assertEquals("ActualParamsNode", actualParamsNode.getClass().getSimpleName());
        assertEquals(4, actualParamsNode.vals.size());
        for (int i = 0; i < actualParamsNode.vals.size(); i++) {
            assertEquals("IdNode", actualParamsNode.vals.get(i).getClass().getSimpleName());
        }

    }

    @Test
    void testVisitCtrlstruct() throws IOException {
        //Forloop
        SafeCParser parser = getParserFromString("for(number x = 7; x < 10; x = x + 1){}");
        Node node = cstToASTVisitor.visitCtrlstruct(parser.ctrlstruct());
        assertEquals("ForLoop", node.getClass().getSimpleName());

        //whileloop
        parser = getParserFromString("while(x <10){}");
        node = cstToASTVisitor.visitCtrlstruct(parser.ctrlstruct());
        assertEquals("WhileLoop", node.getClass().getSimpleName());




    }

    @Test
    void testVisitForLoop() {

    }

    @Test
    void testVisitWhileLoop() {
    }

    @Test
    void testVisitIfStatement() {
    }

    @Test
    void testVisitSwitchStatement() {
    }

    @Test
    void testVisitIflogic() {
    }

    @Test
    void testVisitForparams() {
    }

    @Test
    void testVisitScase() {
    }

    @Test
    void testVisitDefcase() {
    }

    @Test
    void testVisitNumdecl() {
    }

    @Test
    void testVisitBooldecl() {
    }

    @Test
    void testVisitChardecl() {
    }

    @Test
    void testVisitStringdecl() {
    }

    @Test
    void testVisitNumdclassign() {
    }

    @Test
    void testVisitChardclassign() {
    }

    @Test
    void testVisitStringdclassign() {
    }

    @Test
    void testVisitBooldclassign() {
    }

    @Test
    void testVisitBexprRelop() {
    }

    @Test
    void testVisitNOTBexpr() {
    }

    @Test
    void testVisitBexprIDBoolval() {
    }

    @Test
    void testVisitBexprBop() {
    }

    @Test
    void testVisitBexprParens() {
    }

    @Test
    void testVisitBexprBoolval() {
    }

    @Test
    void testVisitBop() {
    }

    @Test
    void testVisitVals() {
    }

    @Test
    void testVisitRelop() {
    }

    @Test
    void testVisitAexprTimesDivNode() {
    }

    @Test
    void testVisitAexprAddSubNode() {
    }

    @Test
    void testVisitAexprParensNode() {
    }

    @Test
    void testVisitAexprIdNode() {
    }

    @Test
    void testVisitAexprNumbervalNode() {
    }

    @Test
    void testVisitAexprNumvalNode() {
    }

    @Test
    void testVisitAexprPiNode() {
    }

}