package spaceShipstates;

import spaceShips.WhiteKnightTwo;

public class Release extends WKTState{

    public Release(WhiteKnightTwo whiteKnightTwo){
        this.whiteKnightTwo=whiteKnightTwo;
    }

    public void releaseSpaceShip(){
        System.out.println("releasing space ship");
        whiteKnightTwo.setSpaceShipTwo(null);
    }
}
