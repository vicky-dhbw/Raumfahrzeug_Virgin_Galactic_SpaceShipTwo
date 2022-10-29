package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class Boost extends SSTState{

    public Boost(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public void boost(){
        System.out.println("Space Ship two climbs vertically");
    }
}
