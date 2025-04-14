package org.example;

import org.example.Connection.ConnectionDB;
import org.example.InventorySystem.InventoryConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LaptopDAO {
    public static void insertProducedLaptops(int quantity) throws SQLException {
        Connection connection = ConnectionDB.getConnection();

        String sql = "INSERT INTO produced_laptops (quantity) VALUES (?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, quantity);
            stmt.executeUpdate();
            System.out.println("🧾 Saved " + quantity + " laptops to the database.");
        } catch (SQLException e) {
            System.err.println("❌ Error saving produced laptops: " + e.getMessage());
        }
    }
}
