package com.pantxi.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 doit être égal à 5");
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(6, 3);
        assertEquals(2, result, "6 / 3 doit être égal à 2");
    }
}

