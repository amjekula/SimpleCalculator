package za.co.altron;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        int total = calculator.add(10, 6);

        assertEquals(16, total);
    }

    @Test
    public void multiply() {
        int total = calculator.multiply(10, 6);

        assertEquals(60, total);
    }
}