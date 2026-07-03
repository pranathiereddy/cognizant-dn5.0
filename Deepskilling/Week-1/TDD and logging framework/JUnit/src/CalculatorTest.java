import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 3, b = 4;
        // Act
        int result = calc.add(a, b);
        // Assert
        assertEquals(7, result);
    }
}