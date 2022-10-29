import spaceShips.SpaceShipTwo;
import spaceShips.WhiteKnightTwo;

public class Application {
    public static void main(String[] args) {

        SpaceShipTwo spaceShipTwo=new SpaceShipTwo();

        WhiteKnightTwo whiteKnightTwo=new WhiteKnightTwo();
        whiteKnightTwo.setSpaceShipTwo(spaceShipTwo);

        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShip();

        spaceShipTwo.boost();



    }
}
