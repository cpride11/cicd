package edu.una.csis.cicd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        double result = Calculator.calculate(5, 3, 1); 
        assertEquals(8, result, "Addition should be correct");
    }

    @Test
    public void testSubtract() {
        double result = Calculator.calculate(5, 3, 2); 
        assertEquals(2, result, "Subtraction should be correct");
    }

    @Test
    public void testMultiply() {
        double result = Calculator.calculate(5, 3, 3); 
        assertEquals(15, result, "Multiplication should be correct");
    }

    @Test
    public void testDivide() {
        double result = Calculator.calculate(6, 3, 4); 
        assertEquals(2, result, "Division should be correct");
    }

    @Test
    public void testDivideByZero() {
        // Test division by zero, expecting an ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            Calculator.calculate(5, 0, 4); // Divide by zero
        }, "Division by zero should throw ArithmeticException");
    }

    @Test
    public void testInvalidOperation() {
        // Test an invalid operation, expecting an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculate(5, 3, 99); // Invalid operation
        }, "Invalid operation should throw IllegalArgumentException");
    }
}
