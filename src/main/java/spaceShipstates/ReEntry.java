package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class ReEntry extends SSTState{

    public ReEntry(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean reEntry(){
        System.out.println("the journey back home begins");
        return true;
    }
}
