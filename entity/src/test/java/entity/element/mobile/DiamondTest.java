package entity.element.mobile;

import static org.junit.jupiter.api.Assertions.*;

import entity.element.Permeability;
import entity.element.mobile.Diamond;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiamondTest {

    @Test
    public void diamondInitializationTest() {
        Diamond diamond = new Diamond();

        assertNotNull(diamond);
        assertEquals('D', diamond.getSprite().getConsoleImage());
        assertEquals(Permeability.DIAMOND, diamond.getPermeability());
    }

    @Test
    public void winMethodTest() {
        Diamond diamond = new Diamond();

        diamond.win();

    }

    @Test
    public void getDiamondsMethodTest() {
        Diamond diamond = new Diamond();

        int diamonds = diamond.getDiamonds();

        assertEquals(0, diamonds);
    }

    @Test
    public void grabDiamondMethodTest() {
        Diamond diamond = new Diamond();

        diamond.grabDiamond();

    }
}
