package lesson_5;

public class Calculator {

    private double result;

    public void performCalculation(double operand1, double operand2, String operation) {
        switch (operation) { //selects method for calculation according to entered sign
            case "+":
                result = Operation.add(operand1, operand2);
                break;
            case "-":
                result = Operation.sub(operand1, operand2);
                break;
            case "*":
                result = Operation.mul(operand1, operand2);
                break;
            case "/":
                try {
                    result = Operation.div(operand1, operand2);
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

