public class MyVisitor extends Aexpr2BaseVisitor<ASTNode>{
    int indentation = 0;
    @Override public ASTNode visitAexpr(Aexpr2Parser.AexprContext ctx) {
        indentation = 0;
        System.out.println(indentation + "visiting Aexpr");

        return visitChildren(ctx); }

    @Override public ASTNode visitTerm(Aexpr2Parser.TermContext ctx) {
        indentation++;
        System.out.println(indentation +"visiting Term");

        return visitChildren(ctx); }

    @Override public ASTNode visitPart(Aexpr2Parser.PartContext ctx) {
        indentation++;
        System.out.println(indentation +"visiting Part");
        return visitChildren(ctx); }

    @Override public ASTNode visitNumberval(Aexpr2Parser.NumbervalContext ctx) {
        indentation++;
        System.out.println(indentation +"visiting Numberval");
        return visitChildren(ctx);
    }

}
