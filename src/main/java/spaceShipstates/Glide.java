package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class Glide extends SSTState{

    public Glide(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean glide(){
        System.out.println("BOOMS lower");
        System.out.println("VSS glides to the runway...........");
        spaceShipTwo.getFlightPod().getHybridRocketSystem().getOxidizerTank().burnFuel(100);
        System.out.println("current fuel amount in tank: "+spaceShipTwo.getFlightPod().getHybridRocketSystem().getOxidizerTank().getFuelAmount());
        System.out.println();
        return true;
    }
}
