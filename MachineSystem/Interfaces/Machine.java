package org.example.MachineSystem.Interfaces;

public abstract class Machine {
    protected String machineId;
    protected MachineState state;

    public Machine(String machineId) {
        this.machineId = machineId;
        this.state = MachineState.Idle;
    }

    public String getMachineId() {
        return machineId;
    }

    public MachineState getState() {
        return state;
    }

    public void setState(MachineState state) {
        this.state = state;
    }
    public void start()
    {
        if(state==MachineState.Idle)
        {
            setState(MachineState.Active);
            System.out.println("Machine"+machineId+"started");
        }
        else
        {
            System.out.println("Machine"+machineId+"is already active");
        }
    }
    public void stop()
    {
        if(state==MachineState.Active)
        {
            setState(MachineState.Idle);
            System.out.println("Machine"+machineId+"Stopped");
        }
        else
        {
            System.out.println("Machine " + machineId + " cannot be stopped from state: " + state);
        }
    }
    public abstract void operate();

}
