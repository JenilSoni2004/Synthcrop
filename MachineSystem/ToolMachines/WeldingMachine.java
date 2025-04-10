package org.example.MachineSystem.ToolMachines;

import org.example.MachineSystem.Interfaces.ToolMachine;

import javax.tools.Tool;

public class WeldingMachine extends ToolMachine {
    public WeldingMachine(String machineId) {
        super(machineId);
    }

    @Override
    public void operate() {
        start();
        System.out.println("Machine is welding the frame");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        stop();
        System.out.println("Welding complete.");
    }
}
