package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class ReEntry extends SSTState{

    public ReEntry(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean reEntry(){
        System.out.println("the journey back home begins.....");
        System.out.println("space ship reentering earth's atmosphere.......");
        return true;
    }
}
