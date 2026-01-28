package main.java.com.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        
        assertDoesNotThrow(() -> {
            App.main(new String[]{});
        });
        
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    
    @Test
    public void testAppExists() {
        App app = new App();
        assertNotNull(app);
    }
    
    @Test
    public void testMainWithNullArgs() {
        assertDoesNotThrow(() -> {
            App.main(null);
        });
    }
    
    @Test
    public void testMainWithEmptyArgs() {
        assertDoesNotThrow(() -> {
            App.main(new String[]{});
        });
    }
}