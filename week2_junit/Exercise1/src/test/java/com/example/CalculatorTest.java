package com.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

 @Test
 public void testAdd() {
     Calculator calc = new Calculator();
     int result = calc.add(5, 3);
     assertEquals(8, result);
 }

 @Test
 public void testSubtract() {
     Calculator calc = new Calculator();
     int result = calc.subtract(5, 2);
     assertEquals(3, result);
 }
}

