package spaceShipstates;

import spaceShips.WhiteKnightTwo;

public abstract class WKTState {

    protected WhiteKnightTwo whiteKnightTwo;

    public boolean takeOff(){
        System.out.println("space ship two must be attached to the white knight two first...");
        return false;
    }

    public boolean releaseSpaceShipTwo(){
        System.out.println("white knight should take off first....");
        return false;
    }

    public boolean land(){
        System.out.println("white knight should release space ship two first");
        return false;
    }
}
