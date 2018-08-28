package lesson_5;

public class Operation {

    /**
     * Performs addition of two double values.
     *
     * @param value1 - 1st operand
     * @param value2 - 2nd operand
     * @return double value as a result of addition
     */
    public static double add(double value1, double value2) {
        double result = value1 + value2;
        return result;
    }

    /**
     * Performs subtraction between two double values.
     *
     * @param value1 - 1st operand
     * @param value2 - 2nd operand
     * @return double value as a result of subtraction
     */
    public static double sub(double value1, double value2) {
        double result = value1 - value2;
        return result;
    }

    /**
     * Performs multiplication of two double values.
     *
     * @param value1 - 1st operand
     * @param value2 - 2nd operand
     * @return double value as a result of multiplication
     */
    public static double mul(double value1, double value2) {
        double result = value1 * value2;
        return result;
    }

    /**
     * Divide 1st operand by 2nd operand. This method throws ArithmeticException in case when the 2nd operand is zero.
     *
     * @param value1 - double value; it's dividend
     * @param value2 - double value: it's divisor
     * @return double value as a result of division
     */
    public static double div(double value1, double value2) {
        if (value2 != 0) {
            double result = value1 / value2;
            return result;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}
