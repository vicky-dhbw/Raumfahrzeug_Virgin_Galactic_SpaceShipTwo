package spaceShipsComponents;

public class FlightPod {

    private final EntryExit entryExit;
    private final Window window;
    private final Thrusters thrusters;
    private final NoseSkid noseSkid;
    private final EmergencyEgress emergencyEgress;
    private final HybridRocketSystem hybridRocketSystem;
    public FlightPod(){
        entryExit=new EntryExit();
        window=new Window();
        thrusters=new Thrusters();
        noseSkid=new NoseSkid();
        emergencyEgress=new EmergencyEgress();
        hybridRocketSystem=new HybridRocketSystem();

    }

    public EntryExit getEntryExit() {
        return entryExit;
    }

    public Window getWindow() {
        return window;
    }

    public Thrusters getThrusters() {
        return thrusters;
    }

    public NoseSkid getNoseSkid() {
        return noseSkid;
    }

    public EmergencyEgress getEmergencyEgress() {
        return emergencyEgress;
    }

    public HybridRocketSystem getHybridRocketSystem() {
        return hybridRocketSystem;
    }
}
