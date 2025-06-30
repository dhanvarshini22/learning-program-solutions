package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationsTest {

    @Test
    public void testMultiply() {
        MathOperations math = new MathOperations();
        assertEquals(20, math.multiply(4, 5));
    }

    @Test
    public void testIsPositive() {
        MathOperations math = new MathOperations();
        assertTrue(math.isPositive(10));
        assertFalse(math.isPositive(-5));
    }

    @Test
    public void testGreet() {
        MathOperations math = new MathOperations();
        assertEquals("Hello, Alice!", math.greet("Alice"));
        assertEquals("Hello, Guest!", math.greet(""));
        assertEquals("Hello, Guest!", math.greet(null));
    }
}
