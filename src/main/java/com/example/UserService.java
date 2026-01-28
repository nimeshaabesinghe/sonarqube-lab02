package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private static final String DB_URL = "jdbc:mysql://localhost/db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public void findUser(String username) throws UserServiceException {
        String query = "SELECT id, name, email FROM users WHERE name = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);
            ps.executeQuery();
            logger.info("User found: {}", username);

        } catch (SQLException e) {
            // FIX: Removed logger.error. We are rethrowing, so the caller will handle logging.
            throw new UserServiceException("Failed to find user: " + username, e);
        }
    }

    public void deleteUser(String username) throws UserServiceException {
        String query = "DELETE FROM users WHERE name = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, username);
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                logger.info("User deleted: {}", username);
            } else {
                logger.warn("No user deleted. User not found: {}", username);
            }

        } catch (SQLException e) {
            // FIX: Removed logger.error.
            throw new UserServiceException("Failed to delete user: " + username, e);
        }
    }
}