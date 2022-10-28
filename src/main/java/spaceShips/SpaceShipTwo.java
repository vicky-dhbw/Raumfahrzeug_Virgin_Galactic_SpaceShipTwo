package spaceShips;

import persons.Passenger;
import persons.Pilot;
import spaceShipsComponents.FlightPod;
import spaceShipsComponents.Wing;
import spaceShipstates.SSTState;

import java.util.Arrays;
import java.util.List;

public class SpaceShipTwo {

    private final Wing rightWing=new Wing();
    private final Wing leftWing=new Wing();

    private final FlightPod flightPod=new FlightPod();

    private final List<Passenger> passengers;
    private final List<Pilot> pilots;

    private SSTState currentState;

    public SpaceShipTwo(){
        passengers= Arrays.asList(new Passenger[6]);
        pilots=Arrays.asList(new Pilot[2]);
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

}
