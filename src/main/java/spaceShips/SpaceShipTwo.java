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

    private WhiteKnightTwo whiteKnightTwo;

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

    public void setWhiteKnightTwo(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }
    public void setCurrentState(SSTState sstState){
        this.currentState=sstState;
    }

    public void boost(){
        if(whiteKnightTwo.getCurrentState()== getWhiteKnightTwo().getRelease()){
            currentState=boost;
            boost.boost();
        }
        else{
            System.out.println("white knight must first release space ship two !!!!");
        }
    }

    public void apogee(){
        if(currentState==boost){
            currentState=apogee;
            apogee.apogee();
        }
        else{
            System.out.println("space ship two must boost first !!!");
        }
    }

    public void reEnter(){
        if(currentState==apogee){
            currentState=reEntry;
            reEntry.reEntry();
        }
        else {
            System.out.println("space ship two must reach space first and do apogee");
        }
    }

    public void glide(){
        if(currentState==reEntry){
            currentState=glide;
            glide.glide();
        }
        else{
            System.out.println("space ship must first start reentering earth's atmosphere");
        }
    }

    public void landSST(){
        if(currentState==glide){
            currentState=sstLanding;
            sstLanding.landSST();
        }
        else{
            System.out.println("space ship two must first glide to the runway.....");
        }
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

    public WhiteKnightTwo getWhiteKnightTwo() {
        return whiteKnightTwo;
    }
}
