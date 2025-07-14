
import com.oregoom.unittest.Calculadora;
import com.oregoom.unittest.DivisionByZeroException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testMultiply() {
        assertEquals(4.6, calculadora.multiply(2.0, 2.3));
    }

    @Test
    public void testDivision() {
        assertEquals(3.0, calculadora.divide(6.0, 2.0));
    }

    @Test
    public void testInvalidDivision() {
        assertThrows(DivisionByZeroException.class, () -> {
            calculadora.divide(6.0, 0.0);
        });

    }

    @Test
    public void testPositiveAbs() {
    assertEquals(3.0, calculadora.abs(3.0));
    }
    
     @Test
    public void testNegativeAbs() {
    assertEquals(3.0, calculadora.abs(3.0));
    }

}
