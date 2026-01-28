package main.java.com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    
    @Test
    public void testUserServiceExists() {
        UserService service = new UserService();
        assertNotNull(service);
    }
    
    @Test
    public void testFindUser() {
        UserService service = new UserService();
        assertThrows(Exception.class, () -> {
            service.findUser("testuser");
        });
    }
    
    @Test
    public void testDeleteUser() {
        UserService service = new UserService();
        assertThrows(Exception.class, () -> {
            service.deleteUser("testuser");
        });
    }
}