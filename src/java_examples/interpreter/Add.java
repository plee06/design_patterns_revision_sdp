package interpreter;

/**
 * operation specific Expression
 *
 *
 * */
public class Add implements Expression{

    // two instance variables that have a left and right Expression for add
    private final Expression leftExpression;
    private final Expression rightExpression;

    // add constructor which sets the left and right expressions
    public Add(Expression leftExpression,Expression rightExpression ){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    // the "interpret" method implemented here which is that it adds the left and right. called recursively
    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }


}
