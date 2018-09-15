import lesson_7.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// here we check performCalculation method work (from Calculator class), i.e. all its math operations with different combinations of input data (not causing exceptions)
@RunWith(Parameterized.class)
public class CalculatorParameterizedTests {

    private double operand1;
    private double operand2;
    private String operation;
    private double result;


    public CalculatorParameterizedTests(double operand1, double operand2, String operation, double result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}: {0} {2} {1} = {3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5.2, 2.3, "+", 7.5},
                {0.2, -3.3, "+", -3.1},
                {-1.2, 3.3, "+", 2.1},
                {-1.2, -3.3, "+", -4.5},
                {5, 0, "+", 5},
                {5.2, 2.3, "-", 2.9},
                {0.2, -3.3, "-", 3.5},
                {-1.2, 3.3, "-", -4.5},
                {-1.2, -3.3, "-", 2.1},
                {0, 5, "-", -5},
                {5.2, 2.3, "*", 11.96},
                {0.2, -3.3, "*", -0.66},
                {-1.2, 3.3, "*", -3.96},
                {-1.2, -3.3, "*", 3.96},
                {5, 0, "*", 0},
                {0, 5, "*", 0},
                {1.3, 2.6, "/", 0.5},
                {2.2, -3.2, "/", -0.6875},
                {-2.2, 3.2, "/", -0.6875},
                {-1.3, -2.6, "/", 0.5},
                {0, 5, "/", 0}
        });
    }

    @Test
    public void CheckCalculations() {
        Calculator calculator = new Calculator();
        calculator.performCalculation(operand1, operand2, operation);
        double actual = calculator.getResult();
        assertEquals(result, actual, 1e-8);
    }
}

