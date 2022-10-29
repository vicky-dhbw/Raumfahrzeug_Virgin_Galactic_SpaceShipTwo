package spaceShipstates;

import spaceShips.WhiteKnightTwo;

public class WKTLanding extends WKTState{

    public WKTLanding(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }

    public boolean landWKT() {
        System.out.println("WHITE KNIGHT TWO preparing to land....");
        System.out.println();
        return true;
    }
}
