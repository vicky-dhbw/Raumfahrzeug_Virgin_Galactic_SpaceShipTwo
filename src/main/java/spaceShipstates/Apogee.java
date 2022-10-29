package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class Apogee extends SSTState{

    public Apogee(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean apogee(){
        System.out.println("spaces ship reaches space.... ");
        System.out.println("pilot experiences micro-gravity");
        return true;
    }
}
