package org.example.MachineSystem;

import org.example.LaptopDAO;
import org.example.LaptopProductionPlan;
import org.example.MachineSystem.Interfaces.ToolMachine;
import org.example.MachineSystem.Interfaces.WorkFlowRobot;

import java.sql.SQLException;

public class ProductionManager {
    private final MachineFactory factory;
    private final int laptopQuantity;

    public ProductionManager(MachineFactory factory, int laptopQuantity) {
        this.factory = factory;
        this.laptopQuantity = laptopQuantity;

        // Set this quantity in the global LaptopProductionPlan
        LaptopProductionPlan.setLaptopQuantity(laptopQuantity);
    }

    public void startProduction() throws SQLException {
        System.out.println("\n🔧 Starting Tool Machine Workflow for " + laptopQuantity + " laptops...");

        ToolMachine cutter = factory.createCuttingMachine();
        ToolMachine driller = factory.createDrillingMachine();
        ToolMachine welder = factory.createWeldingMachine();

        cutter.operate();
        driller.operate();
        welder.operate();

        System.out.println("\n🤖 Starting Workflow Robot Sequence...");
        WorkFlowRobot assembler = factory.createAssemblyRobot();
        WorkFlowRobot quality = factory.createQualityControlRobot();
        WorkFlowRobot packer = factory.createPackagingRobot();

        assembler.operate();
        quality.operate();
        packer.operate();
        LaptopDAO.insertProducedLaptops(laptopQuantity);
        System.out.println("\n✅ Laptop Production of " + laptopQuantity + " units completed successfully!");
    }
}
