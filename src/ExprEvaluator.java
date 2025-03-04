package src;

public class ExprEvaluator implements ExprVisitor<Float> {
    /*
     * Part 2: impelement the visitor pattern for expressions
     */
    public Float visitPlusExpr(PlusExpr expr) {
        return expr.getE1().accept(this) + expr.getE2().accept(this);
    }
    public Float visitMinusExpr(MinusExpr expr){
        return expr.getE1().accept(this) - expr.getE2().accept(this);
    }
    public Float visitTimesExpr(TimesExpr expr){
        return expr.getE1().accept(this) * expr.getE2().accept(this);
    }
    public Float visitDivExpr(DivExpr expr){
        return expr.getE1().accept(this) / expr.getE2().accept(this);
    }
    public Float visitFloatExpr(FloatExpr expr) {
        return expr.literal;
    }
}

