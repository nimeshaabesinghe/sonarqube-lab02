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
        assertThrows(UserServiceException.class, () -> {
            service.findUser("testuser");
        });
    }
    
    @Test
    public void testDeleteUser() {
        UserService service = new UserService();
        assertThrows(UserServiceException.class, () -> {
            service.deleteUser("testuser");
        });
    }
    
    @Test
    public void testFindUserWithNull() {
        UserService service = new UserService();
        assertThrows(UserServiceException.class, () -> {
            service.findUser(null);
        });
    }
    
    @Test
    public void testDeleteUserWithNull() {
        UserService service = new UserService();
        assertThrows(UserServiceException.class, () -> {
            service.deleteUser(null);
        });
    }
}