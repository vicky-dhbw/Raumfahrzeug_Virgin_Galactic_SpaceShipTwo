package spaceShips;

import spaceShipstates.Release;
import spaceShipstates.TakeOff;
import spaceShipstates.WKTLanding;
import spaceShipstates.WKTState;

public class WhiteKnightTwo {

    private SpaceShipTwo spaceShipTwo;
    private final TakeOff takeOff;
    private final Release release;
    private final WKTLanding wktLanding;
    private WKTState currentState;


    public WhiteKnightTwo(){
        takeOff=new TakeOff(this);
        release=new Release(this);
        wktLanding=new WKTLanding(this);
    }

    public SpaceShipTwo getSpaceShipTwo() {
        return spaceShipTwo;
    }

    public void setCurrentState(WKTState wktState){
        this.currentState=wktState;
    }

    public void setSpaceShipTwo(SpaceShipTwo spaceShipTwo) {
        this.spaceShipTwo = spaceShipTwo;
    }

    public TakeOff getTakeOff() {
        return takeOff;
    }

    public Release getRelease() {
        return release;
    }

    public WKTLanding getWktLanding() {
        return wktLanding;
    }
}
