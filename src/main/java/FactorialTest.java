import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnNotDefinedIfTheNumberIsNegative(){
        final Factorial factorial = new Factorial();
        final Integer result = factorial.getFactorial(-1);
        assertEquals(null, result);

    }

    @Test
    void shouldReturnOneIfTheNumberIsZero() {
        final Factorial factorial = new Factorial();
        final Integer result = factorial.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    void shouldReturnValidNumberIfTheNumberIsGreaterThanZero() {
        final Factorial factorial = new Factorial();
        final Integer result = factorial.getFactorial(5);
        assertEquals(120, result);
    }

}
