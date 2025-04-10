package org.example.MachineSystem.ToolMachines;

import org.example.MachineSystem.Interfaces.Machine;
import org.example.MachineSystem.Interfaces.ToolMachine;

public class CuttingMachine extends ToolMachine {
    public CuttingMachine(String machineId) {
        super(machineId);
    }

    @Override
    public void operate() {
        start();
        System.out.println("Laptop frame is cutted");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        stop();
        System.out.println("Cutting complete.");
    }
}
