package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class ReEntry extends SSTState{

    public ReEntry(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean reEnter(){
        System.out.println("the journey back home begins.....");
        System.out.println("VSS preparing to reenter earth's atmosphere.......");
        System.out.println();
        return true;
    }
}
