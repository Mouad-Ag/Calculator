package com.pantxi.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = Calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 doit être égal à 5");
    }

    @Test
    public void testDivision() {
        int result = Calculator.divide(6, 3);
        assertEquals(2, result, "6 / 3 doit être égal à 2");
    }
}