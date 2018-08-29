package lesson_5;

public class Calculator implements IShow {

    private double result;

    public Double getResult() {
        return Double.valueOf(result);
    }

    public void performCalculation(double operand1, double operand2, String operation) throws ArithmeticException {
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
                result = Operation.div(operand1, operand2);
                break;
            default:
                throw new ArithmeticException("Unrecognized operation!");
        }
    }

    @Override
    public void show(Object object) {
        System.out.printf("Result is: %.4f", object); //shows calculated result formatted
    }
}

