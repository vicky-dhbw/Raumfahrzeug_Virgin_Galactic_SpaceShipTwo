package spaceShipstates;

import persons.Passenger;
import spaceShips.SpaceShipTwo;

public class SSTLanding extends SSTState{

    public SSTLanding(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean landSST(){
        System.out.println("VSS glides to a landing ............");
        System.out.println("VSS lands successfully ------");
        System.out.println("END OF JOURNEY");

        System.out.println();
        System.out.println("Tourists leaving VSS...");

        for(int i=0;i<Configuration.INSTANCE.numberOfPassengers;i++){
            spaceShipTwo.getPassengers()[i]=null;
        }
        return true;
    }
}
