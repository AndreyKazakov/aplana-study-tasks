import lesson_7.Operation;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class OperationTests {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void CheckOperationAdd() {
        double operand1 = 1.3;
        double operand2 = 2.6;
        double actual = Operation.add(operand1, operand2);
        assertEquals(3.9, actual, 1e-8);
    }

    @Test
    public void CheckOperationSub() {
        double operand1 = 1.3;
        double operand2 = 2.6;
        double actual = Operation.sub(operand1, operand2);
        assertEquals(-1.3, actual, 1e-8);
    }

    @Test
    public void CheckOperationMul() {
        double operand1 = 1.3;
        double operand2 = 2.6;
        double actual = Operation.mul(operand1, operand2);
        assertEquals(3.38, actual, 1e-8);
    }

    @Test
    public void CheckOperationDiv() {
        double operand1 = 1.3;
        double operand2 = 2.6;
        double actual = Operation.div(operand1, operand2);
        assertEquals(0.5, actual, 1e-8);
    }

    @Test
    public void CheckOperationDivByZero() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Not allowed operation: division by zero!");
        double operand1 = 1.3;
        double operand2 = 0;
        double actual = Operation.div(operand1, operand2);
    }
}
