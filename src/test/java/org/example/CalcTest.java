package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0));
        assertEquals(1, ScientificCalculator.factorial(1));
        assertEquals(2, ScientificCalculator.factorial(2));
        assertEquals(6, ScientificCalculator.factorial(3));
        assertEquals(24, ScientificCalculator.factorial(4));
        assertEquals(120, ScientificCalculator.factorial(6));
    }

    @Test
    void testSquareRoot() {
        assertEquals(2.0, Math.sqrt(4), 0.0001);
        assertEquals(3.0, Math.sqrt(9), 0.0001);
        assertEquals(5.0, Math.sqrt(25), 0.0001);
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, Math.log(1), 0.0001);
        assertEquals(1.0, Math.log(Math.E), 0.0001);
    }

    @Test
    void testPowerFunction() {
        assertEquals(8.0, Math.pow(2, 3), 0.0001);
        assertEquals(27.0, Math.pow(3, 3), 0.0001);
        assertEquals(16.0, Math.pow(4, 2), 0.0001);
    }
}
