package org.example.InventorySystem;

import org.example.Connection.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;

public class InventoryConnector {
    private static InventorySystem inventorySystem;

    private InventoryConnector() {

    }

    public static InventorySystem getInventorySystem() {
        if (inventorySystem == null) {
            try {
                Connection connection = ConnectionDB.getConnection();
                inventorySystem = new InventorySystem(connection);
            } catch (SQLException e) {
                System.err.println("Failed to initialize InventorySystem: " + e.getMessage());
            }
        }
        return inventorySystem;
    }
}
