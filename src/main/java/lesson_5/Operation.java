package lesson_5;

public class Operation {

    public static double add(double value1, double value2) {
        double result = value1 + value2;
        return result;
    }

    public static double sub(double value1, double value2) {
        double result = value1 - value2;
        return result;
    }

    public static double mul(double value1, double value2) {
        double result = value1 * value2;
        return result;
    }

    public static double div(double value1, double value2) {
        if (value2 != 0) {
            double result = value1 / value2;
            return result;
        } else {
            throw new ArithmeticException("Not allowed operation: division by zero!");
        }
    }
}
