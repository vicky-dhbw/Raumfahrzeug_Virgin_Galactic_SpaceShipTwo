package spaceShipsComponents;

public class Wing {

    private Evelon evelon;
    private Rudder rudder;
    private FeatherMechanism featherMechanism;
    private RollThrusters rollThrusters;

    private ThermalProtectionSystem thermalProtectionSystem;
    private ElectricServoHorizontalStabilizers electricServoHorizontalStabilizers;

    public Wing(){
        evelon=new Evelon();
        rudder=new Rudder();
        featherMechanism=new FeatherMechanism();
        rollThrusters=new RollThrusters();
        thermalProtectionSystem=new ThermalProtectionSystem();
        electricServoHorizontalStabilizers=new ElectricServoHorizontalStabilizers();
    }

    public Evelon getEvelon() {
        return evelon;
    }

    public void setEvelon(Evelon evelon) {
        this.evelon = evelon;
    }

    public Rudder getRudder() {
        return rudder;
    }

    public void setRudder(Rudder rudder) {
        this.rudder = rudder;
    }

    public FeatherMechanism getFeatherMechanism() {
        return featherMechanism;
    }

    public void setFeatherMechanism(FeatherMechanism featherMechanism) {
        this.featherMechanism = featherMechanism;
    }

    public RollThrusters getRollThrusters() {
        return rollThrusters;
    }

    public void setRollThrusters(RollThrusters rollThrusters) {
        this.rollThrusters = rollThrusters;
    }

    public ThermalProtectionSystem getThermalProtectionSystem() {
        return thermalProtectionSystem;
    }

    public void setThermalProtectionSystem(ThermalProtectionSystem thermalProtectionSystem) {
        this.thermalProtectionSystem = thermalProtectionSystem;
    }

    public ElectricServoHorizontalStabilizers getElectricServoHorizontalStabilizers() {
        return electricServoHorizontalStabilizers;
    }

    public void setElectricServoHorizontalStabilizers(ElectricServoHorizontalStabilizers electricServoHorizontalStabilizers) {
        this.electricServoHorizontalStabilizers = electricServoHorizontalStabilizers;
    }
}
