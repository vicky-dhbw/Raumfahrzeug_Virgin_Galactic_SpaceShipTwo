import spaceShips.SpaceShipTwo;
import spaceShips.WhiteKnightTwo;

public class Application {
    public static void main(String[] args) {

        SpaceShipTwo spaceShipTwo=new SpaceShipTwo();
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
