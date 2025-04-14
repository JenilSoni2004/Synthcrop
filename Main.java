package org.example;

import org.example.InventorySystem.InventoryConnector;
import org.example.InventorySystem.InventorySystem;
import org.example.InventorySystem.RawMaterial;
import org.example.MachineSystem.MachineFactory;
import org.example.MachineSystem.ProductionManager;
import org.example.MachineSystem.SynthcorpFactory;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final MachineFactory factory = new SynthcorpFactory();
    private static final InventorySystem inventorySystem = InventoryConnector.getInventorySystem();

    public static void main(String[] args) throws SQLException {
        boolean run = true;

        while (run) {
            printMainMenu();
            int command = sc.nextInt();
            sc.nextLine();

            switch (command) {
                case 1 -> handleProduction();
                case 2 -> handleInventory();
                case 3 -> {
                    System.out.println("Exiting system. Goodbye!");
                    run = false;
                }
                default -> System.out.println("Invalid command. Try again.");
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("\n===== SynthCorp Terminal =====");
        System.out.println("1. Start Production");
        System.out.println("2. View Inventory");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleProduction() throws SQLException {
        System.out.print("Enter quantity to produce: ");
        int quantity = sc.nextInt();
        sc.nextLine(); // Consume newline
        ProductionManager manager = new ProductionManager(factory, quantity);
        manager.startProduction();
    }

    private static void handleInventory() {
        boolean inventoryMenu = true;
        while (inventoryMenu) {
            printInventoryMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> inventorySystem.displayMaterials();
                case 2 -> addItemToInventory();
                case 3 -> deleteItemFromInventory();
                case 4 -> updateInventoryItem();
                case 5 -> inventoryMenu = false;
                default -> System.out.println("Invalid inventory option.");
            }
        }
    }

    private static void printInventoryMenu() {
        System.out.println("\n--- Inventory Menu ---");
        System.out.println("1. View Inventory");
        System.out.println("2. Add Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Update Item");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void addItemToInventory() {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter minimum requirement: ");
        int minReq = sc.nextInt();
        sc.nextLine();

        RawMaterial material = new RawMaterial(name, quantity, minReq);
        inventorySystem.addmaterial(material);
        System.out.println("Item added.");
    }

    private static void deleteItemFromInventory() {
        System.out.print("Enter item name to delete: ");
        String name = sc.nextLine();
        inventorySystem.deleteMaterial(name);
        System.out.println("Item deleted.");
    }

    private static void updateInventoryItem() {
        System.out.print("Enter item name to update: ");
        String name = sc.nextLine();
        System.out.print("Enter new quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter new minimum requirement: ");
        int minReq = sc.nextInt();
        sc.nextLine();

        inventorySystem.updateMaterial(name, quantity, minReq);
        System.out.println("Item updated.");
    }
}
