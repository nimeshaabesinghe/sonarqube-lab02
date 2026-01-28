package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testMainMethod() {
        assertDoesNotThrow(() -> {
            App.main(new String[]{});
        });
    }
    
    @Test
    public void testAppExists() {
        App app = new App();
        assertNotNull(app);
    }
}