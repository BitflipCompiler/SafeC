package service;

import ast.*;
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
     * Creates a SafeCParser from file path
     */
    SafeCParser getParserFromPath(String path) throws IOException {
        CharStream charStream = CharStreams.fromFileName(path);
        SafeCLexer lexer = new SafeCLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        return new SafeCParser(commonTokenStream);
    }
    SafeCParser getParserFromString(String string) throws IOException {
        SafeCLexer lexer = new SafeCLexer(CharStreams.fromString(string));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        return new SafeCParser(commonTokenStream);
    }

    /*
     * If there are 3 declarations and each of them are SafeDclNode's
     */
    @Test
    void testVisitProg() throws IOException {
        SafeCParser parser = getParserFromPath("src/test/java/service/testfiles/ProgTest.txt");
        ProgNode progNode = (ProgNode) cstToASTVisitor.visitProg(parser.prog());

        if(progNode.nodes.size() == 3){
            assertTrue(true);
        }
        System.out.println(progNode.nodes.get(0));
        assertEquals("SafeDclNode",progNode.nodes.get(0).getClass().getSimpleName());
        assertEquals("SafeDclNode",progNode.nodes.get(1).getClass().getSimpleName());
        assertEquals("SafeDclNode",progNode.nodes.get(2).getClass().getSimpleName());
    }

    /*
     * If the Declaration that ends up beeing choosen is FuncDcl
     */
    @Test
    void testVisitDeclaration() throws IOException {
        SafeCParser parser = getParserFromPath("src/test/java/service/testfiles/DeclarationTest.txt");
        Node node = cstToASTVisitor.visitDeclaration(parser.declaration());
        //System.out.println(node.getClass().getSimpleName());
        if(node.getClass().getSimpleName().equals("FuncDcl")){
            assertTrue(true);
        }else {
            assertFalse(false);
        }
    }

    /*
     * If the VisitStructDcl ends up beeing a StructDcl
     */
    @Test
    void testVisitStructdcl() throws IOException {
        SafeCParser parser = getParserFromPath("src/test/java/service/testfiles/StructDclTest.txt");
        StructNode structNode = (StructNode) cstToASTVisitor.visitStructdcl(parser.structdcl());

        assertEquals("StructNode",structNode.getClass().getSimpleName());
    }

    @Test
    void testVisitStructblock() throws IOException {
        SafeCParser parser = getParserFromString("");
        StructBlockNode structBlockNode = (StructBlockNode) cstToASTVisitor.visitStructblock(parser.structblock());

    }

    @Test
    void testVisitDclassignsemi() throws IOException {
    }

    @Test
    void testVisitDclassignsemicommand() throws IOException {
        SafeCParser parser = getParserFromString("x = 10;");
        DclAssignSemiCommandNode dclAssignSemiCommandNode = (DclAssignSemiCommandNode) cstToASTVisitor.visitDclassignsemicommand(parser.dclassignsemicommand());
        //System.out.println(dclAssignSemiCommandNode.actual.getClass());
    }

    //TODO to be continued

    @Test
    void testVisitSafedeclaration() {
    }

    @Test
    void testVisitParams() {
    }

    @Test
    void testVisitBlock() {
    }

    @Test
    void testVisitCaseblock() {
    }

    @Test
    void testVisitVdcl() {
    }

    @Test
    void testVisitArraydecl() {
    }

    @Test
    void testVisitArrdcltype() {
    }

    @Test
    void testVisitVassign() {
    }

    @Test
    void testVisitVdclassign() {
    }

    @Test
    void testVisitArraydclassign() {
    }

    @Test
    void testVisitNumarraydclassign() {
    }

    @Test
    void testVisitChararraydclassign() {
    }

    @Test
    void testVisitStringarraydclassign() {
    }

    @Test
    void testVisitBoolarraydclassign() {
    }

    @Test
    void testVisitDatatype() {
    }

    @Test
    void testVisitAtypes() {
    }

    @Test
    void testVisitArrayassign() {
    }

    @Test
    void testVisitArraydata() {
    }

    @Test
    void testVisitNumarray() {
    }

    @Test
    void testVisitChararray() {
    }

    @Test
    void testVisitStrarray() {
    }

    @Test
    void testVisitBoolarray() {
    }

    @Test
    void testVisitCommand() {
    }

    @Test
    void testVisitFunccalls() {
    }

    @Test
    void testVisitFuncdcl() {
    }

    @Test
    void testVisitFuncblock() {
    }

    @Test
    void testVisitCallparams() {
    }

    @Test
    void testVisitCtrlstruct() {
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