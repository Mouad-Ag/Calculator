package com.pantxi.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    public void testAdditionParametree(int a, int b, int resultatAttendu) {
        int result = Calculator.add(a, b);
        assertEquals(resultatAttendu, result,
                () -> a + " + " + b + " devrait être égal à " + resultatAttendu);
    }
}