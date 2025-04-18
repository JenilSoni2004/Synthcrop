package org.example.MachineSystem.WorkFlowRobots;

import org.example.MachineSystem.Interfaces.WorkFlowRobot;

public class AssemblyRobot extends WorkFlowRobot {
    public AssemblyRobot(String machineId) {
        super(machineId);
    }

    @Override
    public void operate() {
        start();
        System.out.println("Machine is assembling the parts");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        stop();
        System.out.println("Assembly complete.");
    }
}
