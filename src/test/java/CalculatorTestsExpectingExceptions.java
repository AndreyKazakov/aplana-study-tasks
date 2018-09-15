import lesson_7.Calculator;
import lesson_7.CustomMathOperationException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

// here we check performCalculation method work (from Calculator class) with input data causing exceptions
public class CalculatorTestsExpectingExceptions {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void CheckCalculationDivizionByZero() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Not allowed operation: division by zero!");
        Calculator calculator = new Calculator();
        calculator.performCalculation(10.5, 0, "/");
    }

    @Test
    public void CheckCalculationIncorrectSign() {
        thrown.expect(CustomMathOperationException.class);
        thrown.expectMessage("Unrecognized operation!");
        Calculator calculator = new Calculator();
        calculator.performCalculation(1.3, 1.5, ".");
    }

}
