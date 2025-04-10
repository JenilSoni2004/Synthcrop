package org.example.MachineSystem;

import org.example.MachineSystem.Interfaces.ToolMachine;
import org.example.MachineSystem.Interfaces.WorkFlowRobot;

public class ProductionManager {
    private final MachineFactory factory;

    public ProductionManager(MachineFactory factory) {
        this.factory = factory;
    }

    public void startProduction() {
        System.out.println("\n🔧 Starting Tool Machine Workflow...");
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

        System.out.println("\n✅ Laptop Production Completed Successfully!");
    }
}

