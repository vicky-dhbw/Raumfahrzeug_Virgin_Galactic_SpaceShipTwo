package spaceShips;

import persons.Passenger;
import persons.Pilot;
import spaceShipsComponents.FlightPod;
import spaceShipsComponents.Wing;

public class SpaceShipTwo {

    private final Wing rightWing=new Wing();
    private final Wing leftWing=new Wing();

    private final FlightPod flightPod=new FlightPod();

    private final Passenger[] passengers;
    private final Pilot[] pilots;

    public SpaceShipTwo(){
        passengers=new Passenger[6];
        pilots=new Pilot[2];
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

    public Passenger[] getPassengers() {
        return passengers;
    }

    public Pilot[] getPilots() {
        return pilots;
    }
}
