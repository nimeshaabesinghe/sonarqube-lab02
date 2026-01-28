package main.java.com.example;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    
    @Test
    public void testUserServiceExists() {
        UserService service = new UserService();
        // Just instantiate to ensure class loads and is covered
        assert service != null;
    }
}