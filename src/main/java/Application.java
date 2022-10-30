import spaceShips.SpaceShipTwo;
import spaceShips.WhiteKnightTwo;

public class Application {
    public static void main(String[] args) {


        // Message from S06
        // this application does not contain implementation of SpacePort / tank vehicle / Tower assigned to S05
        // Reason: S05 has been ex-matriculated
        // -------------------------------------------------------------------------------------------------------
        // this application therefore only contains implementation of tasks assigned to S06
        // following have been implemented:
        // --> modelling of VSS and Mother ship  (all that is relevant for spaceship and mother ship
        // --> abstraction related to journey of the VSS and Mother ship  (all abstractions related to journey to the space)
        // --> wishing you a good journey to space :)


        SpaceShipTwo spaceShipTwo=new SpaceShipTwo();
        spaceShipTwo.getFlightPod().getHybridRocketSystem().getOxidizerTank().setFuelAmount(1000);
        WhiteKnightTwo whiteKnightTwo=new WhiteKnightTwo();

        whiteKnightTwo.setSpaceShipTwo(spaceShipTwo);
        spaceShipTwo.setWhiteKnightTwo(whiteKnightTwo);

        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();

        spaceShipTwo.boost();
        spaceShipTwo.apogee();
        whiteKnightTwo.landWKT();
        spaceShipTwo.reEnter();
        spaceShipTwo.glide();
        spaceShipTwo.landSST();

    }
}
