import lesson_7.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTests {

    @Test
    public void test1() {
        double actual = Operation.add(1.3, 2.6);
        assertEquals(3.9, actual,0);
    }
}
