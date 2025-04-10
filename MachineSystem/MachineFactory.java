package org.example.MachineSystem;

import org.example.MachineSystem.ToolMachines.CuttingMachine;
import org.example.MachineSystem.ToolMachines.DrillingMachine;
import org.example.MachineSystem.ToolMachines.WeldingMachine;
import org.example.MachineSystem.WorkFlowRobots.AssemblyRobot;
import org.example.MachineSystem.WorkFlowRobots.PackagingRobot;
import org.example.MachineSystem.WorkFlowRobots.QualityControlRobot;

public interface MachineFactory {
    CuttingMachine createCuttingMachine();
    DrillingMachine createDrillingMachine();
    WeldingMachine createWeldingMachine();
    AssemblyRobot createAssemblyRobot();
    QualityControlRobot createQualityControlRobot();
    PackagingRobot createPackagingRobot();
}