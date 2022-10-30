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
        spaceShipTwo.getFlightPod().getHybridRocketSystem().getOxidizerTank().burnFuel(200);
        System.out.println("current fuel amount in tank: "+spaceShipTwo.getFlightPod().getHybridRocketSystem().getOxidizerTank().getFuelAmount());
        System.out.println();
        return true;
    }
}
