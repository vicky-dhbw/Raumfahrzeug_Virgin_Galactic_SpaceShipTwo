package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class Apogee extends SSTState{

    public Apogee(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean apogee(){
        System.out.println("VSS reaches space.... HEIGHT about: 328000 and 361000 feet ---");
        System.out.println("Pilot and Passengers experience micro-gravity........");
        System.out.println();
        return true;
    }
}
