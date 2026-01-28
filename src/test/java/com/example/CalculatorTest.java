package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.calculate(10, 5, Operation.ADD));
    }
    
    @Test
    public void testAdditionNegative() {
        Calculator calc = new Calculator();
        assertEquals(-5, calc.calculate(-10, 5, Operation.ADD));
    }
    
    @Test
    public void testAdditionBothNegative() {
        Calculator calc = new Calculator();
        assertEquals(-15, calc.calculate(-10, -5, Operation.ADD));
    }
    
    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.calculate(10, 5, Operation.SUB));
    }
    
    @Test
    public void testSubtractionNegative() {
        Calculator calc = new Calculator();
        assertEquals(-15, calc.calculate(-10, 5, Operation.SUB));
    }
    
    @Test
    public void testSubtractionBothNegative() {
        Calculator calc = new Calculator();
        assertEquals(-5, calc.calculate(-10, -5, Operation.SUB));
    }
    
    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.calculate(10, 5, Operation.MUL));
    }
    
    @Test
    public void testMultiplicationZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.calculate(10, 0, Operation.MUL));
    }
    
    @Test
    public void testMultiplicationNegative() {
        Calculator calc = new Calculator();
        assertEquals(-50, calc.calculate(-10, 5, Operation.MUL));
    }
    
    @Test
    public void testMultiplicationBothNegative() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.calculate(-10, -5, Operation.MUL));
    }
    
    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.calculate(10, 5, Operation.DIV));
    }
    
    @Test
    public void testDivisionNegative() {
        Calculator calc = new Calculator();
        assertEquals(-2, calc.calculate(-10, 5, Operation.DIV));
    }
    
    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculate(10, 0, Operation.DIV);
        });
    }
    
    @Test
    public void testModulo() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.calculate(10, 5, Operation.MOD));
    }
    
    @Test
    public void testModuloRemainder() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.calculate(10, 7, Operation.MOD));
    }
    
    @Test
    public void testModuloNegative() {
        Calculator calc = new Calculator();
        assertEquals(-3, calc.calculate(-10, 7, Operation.MOD));
    }
    
    @Test
    public void testPower() {
        Calculator calc = new Calculator();
        assertEquals(100, calc.calculate(10, 2, Operation.POW));
    }
    
    @Test
    public void testPowerZero() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.calculate(5, 0, Operation.POW));
    }
    
    @Test
    public void testPowerOne() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.calculate(10, 1, Operation.POW));
    }
    
    @Test
    public void testPowerNegativeBase() {
        Calculator calc = new Calculator();
        assertEquals(9, calc.calculate(-3, 2, Operation.POW));
    }
    
    @Test
    public void testPowerLarge() {
        Calculator calc = new Calculator();
        assertEquals(1000, calc.calculate(10, 3, Operation.POW));
    }
    
    @Test
    public void testPowerNegativeResult() {
        Calculator calc = new Calculator();
        assertEquals(-8, calc.calculate(-2, 3, Operation.POW));
    }
}