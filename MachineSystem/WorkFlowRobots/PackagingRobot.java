package org.example.MachineSystem.WorkFlowRobots;

import org.example.MachineSystem.Interfaces.WorkFlowRobot;

public class PackagingRobot extends WorkFlowRobot {
    public PackagingRobot(String machineId) {
        super(machineId);
    }

    @Override
    public void operate() {
        start();
        System.out.println("Machine is packing laptop");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        stop();
        System.out.println("Packing complete.");
    }
}
