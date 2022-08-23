import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnNotDefinedIfTheNumberIsNegative(){
        final Factorial factorial = new Factorial();
        final Integer result = factorial.getFactorial(-1);
        assertEquals(null, result);

    }

}
