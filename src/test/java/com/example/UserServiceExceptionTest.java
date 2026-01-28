package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class UserServiceExceptionTest {
    
    @Test
    public void testExceptionWithMessageAndCause() {
        Exception cause = new Exception("Root cause");
        UserServiceException exception = new UserServiceException("Test error", cause);
        assertEquals("Test error", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }
    
    @Test
    public void testExceptionWithNullCause() {
        UserServiceException exception = new UserServiceException("Test error", null);
        assertEquals("Test error", exception.getMessage());
        assertNull(exception.getCause());
    }
    
    @Test
    public void testExceptionWithDifferentMessages() {
        Exception cause = new RuntimeException("Database error");
        UserServiceException exception = new UserServiceException("Failed to process user", cause);
        assertEquals("Failed to process user", exception.getMessage());
        assertTrue(exception.getCause() instanceof RuntimeException);
    }
}