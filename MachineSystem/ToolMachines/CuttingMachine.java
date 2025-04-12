package org.example.MachineSystem.ToolMachines;

import org.example.InventorySystem.InventoryConnector;
import org.example.InventorySystem.InventorySystem;
import org.example.LaptopProductionPlan;
import org.example.MachineSystem.Interfaces.Machine;
import org.example.MachineSystem.Interfaces.ToolMachine;

public class CuttingMachine extends ToolMachine {
    public CuttingMachine(String machineId) {
        super(machineId);

    }

    @Override
    public void operate() {
        start();
        System.out.println("Cutting laptop frame...");

        InventorySystem inventory = InventoryConnector.getInventorySystem();
        int aluminumNeeded = LaptopProductionPlan.getQuantityFor("Aluminum");

        if (!inventory.hasSufficientMaterial("Aluminum", aluminumNeeded)) {
            System.out.println("❌ Not enough Aluminum in inventory. Halting production.");
            stop();
            System.exit(1); // You can also throw exception or return depending on design
            return;
        }

        inventory.useMaterial("Aluminum", aluminumNeeded);

        stop();
        System.out.println("✅ Cutting complete.");
    }

}
