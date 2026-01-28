package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class OperationTest {
    
    @Test
    public void testOperationValues() {
        Operation[] ops = Operation.values();
        assertEquals(6, ops.length);
    }
    
    @Test
    public void testOperationValueOf() {
        assertEquals(Operation.ADD, Operation.valueOf("ADD"));
        assertEquals(Operation.SUB, Operation.valueOf("SUB"));
        assertEquals(Operation.MUL, Operation.valueOf("MUL"));
        assertEquals(Operation.DIV, Operation.valueOf("DIV"));
        assertEquals(Operation.MOD, Operation.valueOf("MOD"));
        assertEquals(Operation.POW, Operation.valueOf("POW"));
    }
    
    @Test
    public void testAllOperations() {
        // Ensure all operations exist
        assertNotNull(Operation.ADD);
        assertNotNull(Operation.SUB);
        assertNotNull(Operation.MUL);
        assertNotNull(Operation.DIV);
        assertNotNull(Operation.MOD);
        assertNotNull(Operation.POW);
    }
}