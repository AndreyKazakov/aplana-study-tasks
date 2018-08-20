package lesson_3;

import java.util.Scanner;

/**
 * Performs arithmetic operations with two fractional numbers.
 *
 * @author Andrey Kazakov by Aplana
 * @see #readDataFromConsole() method - for reading data from console
 * @see #add(double, double) method - for addition operation
 * @see #sub(double, double) method - for subtraction operation
 * @see #mul(double, double) method - for multiplication operation
 * @see #div(double, double) method - for division operation
 * @see #performCalculation() method - for the whole calculation process
 */

public class Calculator {

    private double operand1;
    private double operand2;
    private String operation;

    /**
     * Reads data from console.
     * It reads both of operands as well as the sign of operation.
     */
    private void readDataFromConsole() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        operand1 = Double.valueOf(scanner.next().replace(",", "."));
        // we read String value, then make replacement of a comma to a period for user convenience,  then convert String value to double.

        System.out.println("Enter the second number:");
        operand2 = Double.valueOf(scanner.next().replace(",", ".")); //same as line 32

        System.out.println("Choose the sign of operation (available values: + - * /):");
        operation = scanner.next().trim(); // trim helps us to avoid useless spaces

        scanner.close();
    }

    /**
     * Performs addition of two double values.
     *
     * @param value1 - 1st operand
     * @param value2 - 2nd operand
     * @return double value as a result of addition
     */
    public double add(double value1, double value2) {
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
    public double sub(double value1, double value2) {
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
    public double mul(double value1, double value2) {
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
    public double div(double value1, double value2) {
        if (value2 != 0) {
            double result = value1 / value2;
            return result;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    /**
     * Performs the whole process of calculation
     */
    public void performCalculation() {
        double result;

        try {
            readDataFromConsole(); //reads data from console
        } catch (NumberFormatException nfe) {
            System.out.println("The number has incorrect format");
            return;
        }

        switch (operation) { //selects method for calculation according to entered sign
            case "+":
                result = add(operand1, operand2);
                break;
            case "-":
                result = sub(operand1, operand2);
                break;
            case "*":
                result = mul(operand1, operand2);
                break;
            case "/":
                try {
                    result = div(operand1, operand2);
                } catch (ArithmeticException ae) {      //in case of exception we show a message for user and stop program
                    System.out.println("Division by zero is not allowed");
                    return;
                }
                break;
            default:
                System.out.println("Not allowed operation has been entered");  //if user enters incorrect operation we show message and stop programm
                return;
        }

        System.out.printf("Result is: %.4f", result); //shows calculated result formatted
    }

}