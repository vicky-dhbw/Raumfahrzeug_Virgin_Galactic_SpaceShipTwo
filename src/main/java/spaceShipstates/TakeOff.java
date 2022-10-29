package spaceShipstates;

import spaceShips.WhiteKnightTwo;

public class TakeOff extends WKTState{

    public TakeOff(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }

    public void takeOff(){
        System.out.println("White Knight Two taking off.....");
    }
}
