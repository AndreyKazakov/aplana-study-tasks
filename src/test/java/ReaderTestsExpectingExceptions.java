import lesson_7.Reader;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

// here we check readDataFromConsole method work (from Reader class) with input data causing exceptions
@RunWith(Parameterized.class)
public class ReaderTestsExpectingExceptions {

    private String userPseudoInput;

    public ReaderTestsExpectingExceptions(String userPseudoInput) {
        this.userPseudoInput = userPseudoInput;
    }

    @Parameterized.Parameters(name = "{index}: userPseudoInput is: {0}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"0..5 5 +"}, //on this user input we should get exception for the first operand
                {"q 5 +"}, //on this user input we should get exception for the first operand
                {"5 0..5 +"}, //on this user input we should get exception for the second operand
                {"5 q +"} //on this user input we should get exception for the second operand
        });
    }

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void CheckReaderIncorrectFormatOfOperands() { // we want to check that readDataFromConsole method throws NumberFormatException if operands are entered incorrectly
        thrown.expect(NumberFormatException.class);
        ByteArrayInputStream in = new ByteArrayInputStream(userPseudoInput.getBytes()); // on lines 37-38 we emulate user input from console
        System.setIn(in);
        try {
        Reader reader = new Reader();
        reader.readDataFromConsole();
        } finally {
            System.setIn(System.in);
        }
    }


}

