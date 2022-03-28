public class MyVisitor extends Aexpr2BaseVisitor<Object>{

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitAexpr(Aexpr2Parser.AexprContext ctx) {
        System.out.println("visiting Aexpr");
        return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitTerm(Aexpr2Parser.TermContext ctx) {
        System.out.println("visiting Term");
        return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPart(Aexpr2Parser.PartContext ctx) {
        System.out.println("visiting Part");
        return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitNumberval(Aexpr2Parser.NumbervalContext ctx) {
        System.out.println("visiting Numberval");
        return visitChildren(ctx); }

}
