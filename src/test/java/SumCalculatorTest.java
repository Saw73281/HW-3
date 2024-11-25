import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSum1() {
        int result = sumCalculator.sum(1);
        System.out.println("Result of sum(1): " + result);
        assertEquals(1, result);
    }

    @Test
    public void testSum3() {
        int result = sumCalculator.sum(3);
        System.out.println("Result of sum(3): " + result);
        assertEquals(6, result);
    }

    @Test
    public void testSum0() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> sumCalculator.sum(0)
        );
        System.out.println("Caught exception for sum(0): " + exception.getMessage());
        assertEquals("n must be greater than or equal to 1", exception.getMessage());
    }
}