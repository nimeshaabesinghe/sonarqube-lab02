package main.java.com.example;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    
    @Test
    public void testUserServiceExists() {
        UserService service = new UserService();
        assert service != null;
    }
}