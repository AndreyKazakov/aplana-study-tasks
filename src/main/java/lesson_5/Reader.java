package lesson_5;

import java.util.Scanner;

public class Reader {

    private double operand1;
    private double operand2;
    private String operation;

    /**
     * Reads data from console.
     * It reads both of operands as well as the sign of operation.
     */
    public void readDataFromConsole() throws NumberFormatException {
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

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public String getOperation() {
        return operation;
    }
}
