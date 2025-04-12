package org.example;

import org.example.MachineSystem.MachineFactory;
import org.example.MachineSystem.ProductionManager;
import org.example.MachineSystem.SynthcorpFactory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        MachineFactory factory=new SynthcorpFactory();
        ProductionManager manager = new ProductionManager(factory,1);
        manager.startProduction();

    }
}