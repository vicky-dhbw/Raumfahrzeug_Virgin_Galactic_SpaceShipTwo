package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class SSTLanding extends SSTState{

    public SSTLanding(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean sstLand(){
        System.out.println("space ship two glides to a landing");
        return true;
    }
}
