import org.junit.jupiter.api.*;
import spaceShips.SpaceShipTwo;
import spaceShips.WhiteKnightTwo;

import static org.junit.jupiter.api.Assertions.*;

public class TestApplication {

    SpaceShipTwo spaceShipTwo=new SpaceShipTwo();

    WhiteKnightTwo whiteKnightTwo=new WhiteKnightTwo();

    @BeforeEach
    public void setUp(){

        whiteKnightTwo.setSpaceShipTwo(spaceShipTwo);
        spaceShipTwo.setWhiteKnightTwo(whiteKnightTwo);

    }

    @Test
    @Order(1)
    public void testIfSpaceShipAttached(){
        assertNotNull(whiteKnightTwo.getSpaceShipTwo());
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();

        assertNull(whiteKnightTwo.getSpaceShipTwo());

    }
    @Test
    @Order(2)
    public void checkTakeOff(){
        whiteKnightTwo.takeOff();
        assertTrue(whiteKnightTwo.getCurrentState().takeOff());
    }

    @Test
    @Order(3)
    public void checkRelease(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        assertTrue(whiteKnightTwo.getCurrentState().releaseSpaceShipTwo());
    }

    @Test
    @Order(4)
    public void testBoostOnlyAfterRelease(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        spaceShipTwo.boost();
        assertTrue(spaceShipTwo.getCurrentState().boost());
    }

    @Test
    @Order(5)
    public void testApogeeOnlyAfterBoost(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        spaceShipTwo.boost();
        spaceShipTwo.apogee();
        assertTrue(spaceShipTwo.getCurrentState().apogee());
    }

    @Test
    @Order(6)
    public void testNoReEntryIfNoApogee(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        spaceShipTwo.boost();
        assertFalse(spaceShipTwo.getCurrentState().reEnter());
    }
    @Test
    @Order(7)
    public void testNoGlideIfNoReEntry(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        spaceShipTwo.boost();
        spaceShipTwo.apogee();
        assertFalse(spaceShipTwo.getCurrentState().glide());
    }

    @Test
    @Order(8)
    public void testLandingOfWhiteKnight(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        // white knight can only land after releasing spaceship
        whiteKnightTwo.landWKT();
        assertTrue(whiteKnightTwo.getCurrentState().landWKT());
    }

    @Test
    @Order(9)
    public void testStillReEntering(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        spaceShipTwo.boost();
        spaceShipTwo.apogee();
        spaceShipTwo.reEnter();
                                //<---- skipping gliding
        spaceShipTwo.landSST();  // <-----landing not possible, spaceship should glide first

        assertTrue(spaceShipTwo.getCurrentState().reEnter());
    }

    @Test
    @Order(10)
    public void testLandingOfSpaceShip(){
        whiteKnightTwo.takeOff();
        whiteKnightTwo.releaseSpaceShipTwo();
        spaceShipTwo.boost();
        spaceShipTwo.apogee();
        spaceShipTwo.reEnter();
        spaceShipTwo.glide();
        spaceShipTwo.landSST();

        assertTrue(spaceShipTwo.getCurrentState().landSST());
    }

}
