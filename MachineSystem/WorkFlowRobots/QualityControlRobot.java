package org.example.MachineSystem.WorkFlowRobots;

import org.example.MachineSystem.Interfaces.Machine;
import org.example.MachineSystem.Interfaces.WorkFlowRobot;

public class QualityControlRobot extends WorkFlowRobot {
    public QualityControlRobot(String machineId) {
        super(machineId);
    }

    @Override
    public void operate() {
        start();
        System.out.println("Laptop is tested");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        stop();
        System.out.println("Testing complete.");
    }
}
