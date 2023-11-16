package entity.element.mobile;

import entity.element.Permeability;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Butterfly.
 *
 * @see Butterfly
 */
public class ButterflyTest {

    @Test
    public void testButterflyInitialization() {
        Butterfly butterfly = new Butterfly();

        // Check if the Butterfly is initialized correctly
        assertNotNull(butterfly);
        assertEquals(Permeability.KILLABLE, butterfly.getPermeability());
        assertEquals('B', butterfly.getSprite().getConsoleImage());
        assertEquals("Butterfly.png", butterfly.getSprite().getImageName());
    }

    @Test
    public void testButterflyWin() {
        Butterfly butterfly = new Butterfly();

        butterfly.win();
    }

    @Test
    public void testButterflyGetDiamonds() {
        Butterfly butterfly = new Butterfly();

        assertEquals(0, butterfly.getDiamonds());
    }

    @Test
    public void testButterflyGrabDiamond() {
        Butterfly butterfly = new Butterfly();

        butterfly.grabDiamond();
    }
}
