package lesson_5;

public class MainProgram {
    public static void main(String[] args) {

        // 1st part - object "reader" reads operands and sign of operation from console
        // it can throw exception if user enters operands incorrectly
        Reader reader = new Reader();
        reader.show("Calculator v2.0 by Aplana.\n---------------------------");
        try {
            reader.readDataFromConsole();
        } catch (NumberFormatException nfe) {
            System.out.println("The number has incorrect format");
            return;
        }

        //2nd part - object "calculator" gets values from "reader", performs calculations and keeps result
        // it can throw exception if sign of operation is not correct or if user tries to divide by zero
        Calculator calculator = new Calculator();
        try {
            calculator.performCalculation(reader.getOperand1(), reader.getOperand2(), reader.getOperation());
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
            return;
        }

        //3rd part - result gotten from "calculator" is shown by its method
        calculator.show(calculator.getResult());
    }
}
