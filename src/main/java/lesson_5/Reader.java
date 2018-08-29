package lesson_5;

import java.util.Scanner;

public class Reader implements IShow {

    private double operand1;
    private double operand2;
    private String operation;

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public String getOperation() {
        return operation;
    }


    /**
     * Reads two operands and sign of operation from console.
     */
    public void readDataFromConsole() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);

        show("Enter the first number:");
        operand1 = Double.valueOf(scanner.next().replace(",", "."));
        // we read String value, then make replacement of a comma to a period for user convenience,  then convert String value to double.

        show("Enter the second number:");
        operand2 = Double.valueOf(scanner.next().replace(",", ".")); //same as line 32

        show("Choose the sign of operation (available values: + - * /):");
        operation = scanner.next().trim(); // trim helps us to avoid useless spaces

        scanner.close();
    }

    @Override
    public void show(Object object) {
        System.out.println(object);
    }
}
