package spaceShips;

import persons.Passenger;
import persons.Pilot;
import spaceShipsComponents.FlightPod;
import spaceShipsComponents.Wing;
import spaceShipstates.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpaceShipTwo {

    private final Wing rightWing=new Wing();
    private final Wing leftWing=new Wing();

    private final FlightPod flightPod=new FlightPod();

    private WhiteKnightTwo whiteKnightTwo;

    private final Passenger[] passengers;
    private final Pilot[] pilots;


    private SSTState currentState;

    private final Apogee apogee;
    private final Boost boost;
    private final ReEntry reEntry;
    private final Glide glide;
    private final SSTLanding sstLanding;

    public SpaceShipTwo(){
        passengers= new Passenger[Configuration.INSTANCE.numberOfPassengers];
        pilots=new Pilot[Configuration.INSTANCE.numberOFPilots];
        apogee=new Apogee(this);
        boost=new Boost(this);
        reEntry=new ReEntry(this);
        glide=new Glide(this);
        sstLanding=new SSTLanding(this);


        welcomePilots();
        welcomingPassengersOnBoard();

    }

    public void welcomingPassengersOnBoard(){
        System.out.println("VSS WELCOMING TOURISTS ON BOARD.....");
        System.out.println();
        for(int i=0;i<Configuration.INSTANCE.numberOfPassengers;i++){
            passengers[i]=new Passenger();
        }
    }

    public void welcomePilots(){
        for(int i=0;i<Configuration.INSTANCE.numberOFPilots;i++){
           pilots[i]=new Pilot();
        }
        System.out.println("------------------------------------");
        System.out.println("Pilots boarding VSS....");
        System.out.println();

    }

    public void setWhiteKnightTwo(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }
    public void setCurrentState(SSTState sstState){
        this.currentState=sstState;
    }

    public boolean boost(){
        if(whiteKnightTwo.getCurrentState()== getWhiteKnightTwo().getRelease()){
            currentState=boost;
            return currentState.boost();
        }
        else{
            System.out.println("white knight must first release space ship two !!!!");
            return false;
        }
    }

    public boolean apogee(){
        if(currentState==boost){
            currentState=apogee;
            return currentState.apogee();
        }
        else{
            System.out.println("space ship two must boost first !!!");
            return false;
        }
    }

    public boolean reEnter(){
        if(currentState==apogee){
            currentState=reEntry;
            return reEntry.reEnter();
        }
        else {
            System.out.println("space ship two must reach space first and do apogee");
            return false;
        }
    }

    public boolean glide(){
        if(currentState==reEntry){
            currentState=glide;
            return currentState.glide();
        }
        else{
            System.out.println("space ship must first start reentering earth's atmosphere");
            return false;
        }
    }

    public boolean landSST(){
        if(currentState==glide){
            currentState=sstLanding;
            return currentState.landSST();
        }
        else{
            System.out.println("space ship two must first glide to the runway.....");
            return false;
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

    public Passenger[] getPassengers() {
        return passengers;
    }

    public Pilot[] getPilots() {
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
