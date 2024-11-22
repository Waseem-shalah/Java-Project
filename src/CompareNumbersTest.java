import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompareNumbersTest {

    @Test
    public void testNormalComparison() {
        assertEquals("A", CompareNumbers.compare(4, 2, CompareNumbers.Mode.NORMAL));
        assertEquals("B", CompareNumbers.compare(3, 7, CompareNumbers.Mode.NORMAL));
        assertEquals("Equal", CompareNumbers.compare(5, 5, CompareNumbers.Mode.NORMAL));
    }

    @Test
    public void testOppositesComparison() {
        assertEquals("B", CompareNumbers.compare(3, -5, CompareNumbers.Mode.OPPOSITES));
        assertEquals("A", CompareNumbers.compare(-2, 7, CompareNumbers.Mode.OPPOSITES));
        assertEquals("Equal", CompareNumbers.compare(0, 0, CompareNumbers.Mode.OPPOSITES));
    }

    @Test
    public void testReciprocalsComparison() {
        assertEquals("A", CompareNumbers.compare(2, 4, CompareNumbers.Mode.RECIPROCALS));
        assertEquals("B", CompareNumbers.compare(0.5, 0.1, CompareNumbers.Mode.RECIPROCALS));
        assertThrows(IllegalArgumentException.class, () -> CompareNumbers.compare(0, 2, CompareNumbers.Mode.RECIPROCALS));
    }
}
