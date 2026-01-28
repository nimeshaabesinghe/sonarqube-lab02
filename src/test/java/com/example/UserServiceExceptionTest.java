package main.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceExceptionTest {
    
    @Test
    public void testExceptionWithMessage() {
        UserServiceException exception = new UserServiceException("Test error");
        assertEquals("Test error", exception.getMessage());
    }
    
    @Test
    public void testExceptionWithMessageAndCause() {
        Exception cause = new Exception("Root cause");
        UserServiceException exception = new UserServiceException("Test error", cause);
        assertEquals("Test error", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }
    
    @Test
    public void testExceptionWithCause() {
        Exception cause = new Exception("Root cause");
        UserServiceException exception = new UserServiceException(cause);
        assertEquals(cause, exception.getCause());
    }
}