package spaceShipstates;

import spaceShips.WhiteKnightTwo;

public class Release extends WKTState{

    public Release(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }

    public boolean releaseSpaceShipTwo(){
        System.out.println("WHITE KNIGHT TWO with VSS reaches 50 000 feet.....");
        System.out.println("releasing / decoupling VSS ---------- ");
        System.out.println();
        whiteKnightTwo.setSpaceShipTwo(null);
        return true;
    }
}
