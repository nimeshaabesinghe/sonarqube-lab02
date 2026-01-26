package main.java.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserService {

    private static final String DB_URL = "jdbc:mysql://localhost/db";
    private static final String DB_USER = "root";

    // Password from environment variable (Sonar-friendly)
    private static final String DB_PASSWORD =
            System.getenv("DB_PASSWORD");

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                DB_URL, DB_USER, DB_PASSWORD);
    }

    // FIXED: No SQL Injection
    public void findUser(String username) throws Exception {
        String query = "SELECT * FROM users WHERE name = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);
            ps.executeQuery();
        }
    }

    // FIXED: Safe delete
    public void deleteUser(String username) throws Exception {
        String query = "DELETE FROM users WHERE name = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);
            ps.executeUpdate();
        }
    }
}
