package org.example.MachineSystem.ToolMachines;

import org.example.MachineSystem.Interfaces.ToolMachine;

public class DrillingMachine extends ToolMachine {
    public DrillingMachine(String machineId) {
        super(machineId);
    }
    @Override
    public void operate() {
        start();
        System.out.println("Machine is drilling holes into frame");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        stop();
        System.out.println("drilling complete.");
    }
}
