package org.example;

import org.example.MachineSystem.MachineFactory;
import org.example.MachineSystem.ProductionManager;
import org.example.MachineSystem.SynthcorpFactory;

public class Main {
    public static void main(String[] args) {
        MachineFactory factory=new SynthcorpFactory();
        ProductionManager manager = new ProductionManager(factory);
        manager.startProduction();

    }
}