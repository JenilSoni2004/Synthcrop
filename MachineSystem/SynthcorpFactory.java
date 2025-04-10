package org.example.MachineSystem;

import org.example.MachineSystem.ToolMachines.CuttingMachine;
import org.example.MachineSystem.ToolMachines.DrillingMachine;
import org.example.MachineSystem.ToolMachines.WeldingMachine;
import org.example.MachineSystem.WorkFlowRobots.AssemblyRobot;
import org.example.MachineSystem.WorkFlowRobots.PackagingRobot;
import org.example.MachineSystem.WorkFlowRobots.QualityControlRobot;

public class SynthcorpFactory implements MachineFactory{
    public CuttingMachine createCuttingMachine() {
        return new CuttingMachine("CuttingMachine-1");
    }
    public DrillingMachine createDrillingMachine() {
        return new DrillingMachine("DrillingMachine-1");
    }
    public WeldingMachine createWeldingMachine() {
        return new WeldingMachine("WeldingMachine-1");
    }
    public AssemblyRobot createAssemblyRobot() {
        return new AssemblyRobot("AssemblyRobot-1");
    }
    public QualityControlRobot createQualityControlRobot() {
        return new QualityControlRobot("QualityControlRobot-1");
    }
    public PackagingRobot createPackagingRobot() {
        return new PackagingRobot("PackagingRobot-1");
    }
}
