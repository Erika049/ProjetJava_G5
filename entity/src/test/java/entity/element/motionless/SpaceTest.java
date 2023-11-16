package entity.element.motionless;

import static org.junit.jupiter.api.Assertions.*;


import entity.element.Permeability;
import entity.element.Sprite;
import fr.exia.showboard.IBoard;
import fr.exia.showboard.ISquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class SpaceTest {

    private static final Sprite SPRITE = new Sprite('V', "Space.png");
    private static final Point INITIAL_POSITION = new Point(5, 5);

    private Space space;



    @Test
    void testGetSprite() {
        Assertions.assertEquals(SPRITE, space.getSprite());
    }

    @Test
    void testGetPermeability() {
        Assertions.assertEquals(Permeability.PENETRABLE, space.getPermeability());
    }

    @Test
    void testGetX() {
        // You can add assertions based on the expected behavior of getting the X-coordinate
    }

    @Test
    void testGetY() {
        // You can add assertions based on the expected behavior of getting the Y-coordinate
    }

    @Test
    void testGetPosition() {
        // You can add assertions based on the expected behavior of getting the position
    }

    @Test
    void testSetPosition() {
        // You can add assertions based on the expected behavior of setting the position
    }

    @Test
    void testGetBoard() {
        // You can add assertions based on the expected behavior of getting the board
    }

    @Test
    void testSetBoard() {
        // You can add assertions based on the expected behavior of setting the board
    }

    @Test
    void testGetHasChanged() {
        // You can add assertions based on the expected behavior of getting the "has changed" status
    }

    @Test
    void testSetHasChanged() {
        // You can add assertions based on the expected behavior of setting the "has changed" status
    }

    // Ajoutez d'autres tests selon les fonctionnalités que vous souhaitez tester
}
