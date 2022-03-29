import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends Aexpr2BaseVisitor<ASTNode>{
    @Override public ASTNode visitAexprTermNode(Aexpr2Parser.AexprTermNodeContext ctx) {
        System.out.println("tissemand");
        return visitChildren(ctx);
    }

    @Override public ASTNode visitAexprAddSubNode(Aexpr2Parser.AexprAddSubNodeContext ctx) {
        ASTNode leftChild;
        ASTNode rightChild;

        //if (ctx.children.size())

        if (ctx.op.getType() == Aexpr2Parser.PLUS){

        }

        System.out.println("tis");
        return visitChildren(ctx); }

    @Override public ASTNode visitAexprPartNode(Aexpr2Parser.AexprPartNodeContext ctx) {
        System.out.println("kone");
        return visitChildren(ctx); }

    @Override public ASTNode visitAexprTimesDivModNode(Aexpr2Parser.AexprTimesDivModNodeContext ctx) {
        System.out.println("mand");
        return visitChildren(ctx); }

    @Override public ASTNode visitAexprParensNode(Aexpr2Parser.AexprParensNodeContext ctx) {
        System.out.println("tisse");
        return visitChildren(ctx); }

    @Override public ASTNode visitAexprIdNode(Aexpr2Parser.AexprIdNodeContext ctx) {
        System.out.println("pisse");
        return visitChildren(ctx); }

    @Override public ASTNode visitAexprNumberValNode(Aexpr2Parser.AexprNumberValNodeContext ctx) {
        System.out.println("fedt");
        return visitChildren(ctx); }

    @Override public ASTNode visitAexprNumValNode(Aexpr2Parser.AexprNumValNodeContext ctx) {
        System.out.println("orn");
        return visitChildren(ctx); }

    @Override public ASTNode visitAexprPiNode(Aexpr2Parser.AexprPiNodeContext ctx) {
        System.out.println("ani");
        return visitChildren(ctx); }
}
