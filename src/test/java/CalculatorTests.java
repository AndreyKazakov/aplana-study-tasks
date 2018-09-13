import lesson_7.Calculator;
import lesson_7.CustomMathOperationException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void CheckCalculationAdd() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(1.3, 2.6, "+");
        double actual = calculator.getResult();
        assertEquals(3.9, actual, 1e-8);
    }

    @Test
    public void CheckCalculationAddForNegative() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(-1, -2, "+");
        double actual = calculator.getResult();
        assertEquals(-3, actual, 1e-8);
    }

    @Test
    public void CheckCalculationSub() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(5.03, 2.6, "-");
        double actual = calculator.getResult();
        assertEquals(2.43, actual, 1e-8);
    }

    @Test
    public void CheckCalculationSubForNegative() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(-5, -2, "-");
        double actual = calculator.getResult();
        assertEquals(-3, actual, 1e-8);
    }

    @Test
    public void CheckCalculationMul() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(0.35, 2.6, "*");
        double actual = calculator.getResult();
        assertEquals(0.91, actual, 1e-8);
    }

    @Test
    public void CheckCalculationMulForZero() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(2.5, 0, "*");
        double actual = calculator.getResult();
        assertEquals(0, actual, 1e-8);
    }

    @Test
    public void CheckCalculationDiv() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(1.3, 2.6, "/");
        double actual = calculator.getResult();
        assertEquals(0.5, actual, 1e-8);
    }

    @Test
    public void CheckCalculationDivForZero() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(0, 2.6, "/");
        double actual = calculator.getResult();
        assertEquals(0, actual, 1e-8);
    }

    @Test
    public void CheckCalculationDivByZero() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Not allowed operation: division by zero!");
        Calculator calculator = new Calculator();
        calculator.performCalculation(1.3, 0, "/");
    }

    @Test
    public void CheckCalculationIncorrectSign() {
        thrown.expect(CustomMathOperationException.class);
        thrown.expectMessage("Unrecognized operation!");
        Calculator calculator = new Calculator();
        calculator.performCalculation(1.3, 1.5, ".");
    }


}
