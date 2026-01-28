package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calc.calculate(10, 5, Operation.ADD));
    }

    @Test
    void testSub() {
        assertEquals(5, calc.calculate(10, 5, Operation.SUB));
    }

    @Test
    void testMul() {
        assertEquals(50, calc.calculate(10, 5, Operation.MUL));
    }

    @Test
    void testDiv() {
        assertEquals(2, calc.calculate(10, 5, Operation.DIV));
    }

    @Test
    void testMod() {
        assertEquals(0, calc.calculate(10, 5, Operation.MOD));
    }

    @Test
    void testPow() {
        assertEquals(100, calc.calculate(10, 2, Operation.POW));
    }
}
