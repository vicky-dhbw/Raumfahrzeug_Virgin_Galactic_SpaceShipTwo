package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class Boost extends SSTState{

    public Boost(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean boost(){
        System.out.println("3 seconds since VSS has been released...........");
        System.out.println("VSS BOOSTS -------- ");
        System.out.println("VSS climbs vertically up towards space.....");
        System.out.println();
        return true;
    }
}
