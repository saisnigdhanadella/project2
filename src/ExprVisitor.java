package src;

public interface ExprVisitor<R> {
    /*
     * Part 2: Implement the visitor pattern for expressions
     */
    R visitPlusExpr(PlusExpr expr);
    R visitMinusExpr(MinusExpr expr);
    R visitTimesExpr(TimesExpr expr);
    R visitDivExpr(DivExpr expr);
    R visitFloatExpr(FloatExpr expr);
}

