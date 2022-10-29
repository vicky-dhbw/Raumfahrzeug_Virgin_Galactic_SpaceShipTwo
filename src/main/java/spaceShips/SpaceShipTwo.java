package spaceShips;

import persons.Passenger;
import persons.Pilot;
import spaceShipsComponents.FlightPod;
import spaceShipsComponents.Wing;
import spaceShipstates.*;

import java.util.Arrays;
import java.util.List;

public class SpaceShipTwo {

    private final Wing rightWing=new Wing();
    private final Wing leftWing=new Wing();

    private final FlightPod flightPod=new FlightPod();

    private final List<Passenger> passengers;
    private final List<Pilot> pilots;

    private SSTState currentState;

    private final Apogee apogee;
    private final Boost boost;
    private final ReEntry reEntry;
    private final Glide glide;
    private final SSTLanding sstLanding;

    public SpaceShipTwo(){
        passengers= Arrays.asList(new Passenger[6]);
        pilots=Arrays.asList(new Pilot[2]);
        apogee=new Apogee(this);
        boost=new Boost(this);
        reEntry=new ReEntry(this);
        glide=new Glide(this);
        sstLanding=new SSTLanding(this);
    }


    public void setCurrentState(SSTState sstState){
        this.currentState=sstState;
    }
    public Wing getRightWing() {
        return rightWing;
    }

    public Wing getLeftWing() {
        return leftWing;
    }

    public FlightPod getFlightPod() {
        return flightPod;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public Apogee getApogee() {
        return apogee;
    }

    public Boost getBoost() {
        return boost;
    }

    public ReEntry getReEntry() {
        return reEntry;
    }

    public Glide getGlide() {
        return glide;
    }

    public SSTLanding getSstLanding() {
        return sstLanding;
    }

    public SSTState getCurrentState() {
        return currentState;
    }
}
