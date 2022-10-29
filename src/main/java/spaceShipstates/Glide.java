package spaceShipstates;

import spaceShips.SpaceShipTwo;

public class Glide extends SSTState{

    public Glide(SpaceShipTwo spaceShipTwo){
        this.spaceShipTwo=spaceShipTwo;
    }

    public boolean glide(){
        System.out.println("booms lower");
        System.out.println("space ship two glides to the runway");
        return true;
    }
}
