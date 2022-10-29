package spaceShipstates;

import spaceShips.WhiteKnightTwo;

public class WKTLanding extends WKTState{

    public WKTLanding(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }

    public boolean landWKT() {
        System.out.println("white knight two landing....");
        return true;
    }
}
