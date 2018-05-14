package interpreter;

/**
 * Optional utils classs, helper methods to execute the expression
 *
 *
 *
 * */
public class ExpressionUtils {

    /**
     *
     * returns a boolean of true or false depending on the type of operator it is
     *
     *
     * */
    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*"))
            return true;
        else
            return false;
    }


    /**
     *
     * gets the corresponding operator class and instantiates it based on the operator String and operands
     *
     * */
    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Subtract(left, right);
            case "*":
                return new Product(left, right);
        }
        return null;
    }
}
