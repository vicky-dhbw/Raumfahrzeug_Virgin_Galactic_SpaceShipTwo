package spaceShipstates;

import spaceShips.WhiteKnightTwo;

public class TakeOff extends WKTState{

    public TakeOff(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }

    public boolean takeOff(){
        System.out.println("WHITE KNIGHT TWO announcing for TAKE OFF....");
        System.out.println("WHITE KNIGHT TWO taking off.....");
        System.out.println();
        return true;
    }
}
