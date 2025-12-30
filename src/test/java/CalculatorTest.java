import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(7, Calculator.add(3, 4));
        assertEquals(0, Calculator.add(0, 0));
        assertEquals(-5, Calculator.add(-2, -3));
    }
}
