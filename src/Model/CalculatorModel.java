package Model;

import javax.swing.*;

public class CalculatorModel {

    /**
     * Main function of this class used to calculate the answer based on the provided operator.
     *
     * @param num1     the first operand
     * @param num2     the second operand
     * @param operator the operator that determines the arithmetic operation to perform
     * @return the result of the calculation as a String, or an error message if the operator is not found
     **/
    public static String calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "-":
                return Double.toString(subtract(num1, num2));
            case "+":
                return Double.toString(add(num1, num2));
            case "/":
                try {
                    double result = divide(num1, num2);
                    return Double.toString(result);
                } catch (ArithmeticException e) {
                    return "\n" + e.getMessage() + "\n";
                }
            case "*":
                return Double.toString(multiply(num1, num2));
        }
        return "Error: operator not found";
    }

    public static double add(double a, double b) {
        return a + b;
    }


    public static double subtract(double a, double b) {
        return a - b;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: Divide by zero");
        }
        return a / b;
    }

}
