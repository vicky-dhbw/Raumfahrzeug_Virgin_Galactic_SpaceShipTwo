package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class SSTLanding extends SSTState{

    public SSTLanding(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean landSST(){
        System.out.println("VSS glides to a landing ............");
        System.out.println("VSS lands successfully ------");
        return true;
    }
}
