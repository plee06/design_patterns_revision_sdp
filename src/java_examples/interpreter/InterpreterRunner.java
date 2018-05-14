package interpreter;

import java.util.Stack;

/**
 * running of the Interpreter design pattern
 *
 *
 * */
public class InterpreterRunner {


    public static void main(String[] args) {
        String tokenString = "7 3 - 2 1 + *";

        Stack<Expression> stack = new Stack<>();

        String[] tokenArray = tokenString.split(" ");

        for (String s : tokenArray) {
            // conditional to check if it's actually a valid operator if it is we pop off the
            // expressions and calculate it and then push the result onto the stack
            if (ExpressionUtils.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));
            } else {
                // otherwise its just a number and push it into the stack without calculation
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }

        System.out.println("( " + tokenString + " ): " + stack.pop().interpret());
    }

    /**
     * So what's going on?
     *
     * Basically this interpreter design pattern is used for the creation of or translation of languages.
     *
     * What this design pattern does is that it defines specific classes to correspond to specific language grammar
     * rules (here arithmetic rules of Add, Number, Product, Subtract).
     *
     * We pass in specific language and we then parse it by utilizing these different grammar rules which
     * are in themselves classes, takes the burden off actual Expression objects (think bunch of conditoinals,
     * "fat" objects).
     *
     * Come back to this later
     *
     *
     * */

}
