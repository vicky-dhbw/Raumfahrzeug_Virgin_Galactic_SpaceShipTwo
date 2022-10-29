import org.junit.jupiter.api.*;
import spaceShips.SpaceShipTwo;
import spaceShips.WhiteKnightTwo;

import static org.junit.jupiter.api.Assertions.*;

public class TestApplication {
    @Test
    public void NormalTest(){
        SpaceShipTwo spaceShipTwo=new SpaceShipTwo();

        WhiteKnightTwo whiteKnightTwo=new WhiteKnightTwo();
        whiteKnightTwo.setSpaceShipTwo(spaceShipTwo);

        assertNotNull(whiteKnightTwo.getSpaceShipTwo());

        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShip();

        assertNull(whiteKnightTwo.getSpaceShipTwo());
    }
}
