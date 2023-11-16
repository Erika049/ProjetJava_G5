package entity.element.mobile;

import static org.junit.jupiter.api.Assertions.*;


import entity.element.IMap;
import entity.element.Permeability;
import entity.element.Sprite;
import fr.exia.showboard.IBoard;
import fr.exia.showboard.ISquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class MobileTest {

    private static final Sprite SPRITE = new Sprite('M', "Mobile.png");
    private static final Point INITIAL_POSITION = new Point(5, 5);

    private Mobile mobile;



    @Test
    void testMoveUp() {
        int initialY = mobile.getY();
        mobile.moveUp();
        Assertions.assertEquals(initialY - 1, mobile.getY());
    }

    @Test
    void testMoveLeft() {
        int initialX = mobile.getX();
        mobile.moveLeft();
        Assertions.assertEquals(initialX - 1, mobile.getX());
    }

    @Test
    void testMoveDown() {
        int initialY = mobile.getY();
        mobile.moveDown();
        Assertions.assertEquals(initialY + 1, mobile.getY());
    }

    @Test
    void testMoveRight() {
        int initialX = mobile.getX();
        mobile.moveRight();
        Assertions.assertEquals(initialX + 1, mobile.getX());
    }

    @Test
    void testDoNothing() {
        int initialX = mobile.getX();
        int initialY = mobile.getY();
        mobile.doNothing();
        Assertions.assertEquals(initialX, mobile.getX());
        Assertions.assertEquals(initialY, mobile.getY());
    }

    @Test
    void testDie() {
        mobile.die();
        Assertions.assertFalse(mobile.isAlive());
    }

    @Test
    void testGetPosition() {
        Assertions.assertEquals(INITIAL_POSITION, mobile.getPosition());
    }

    @Test
    void testSetPosition() {
        Point newPosition = new Point(10, 10);
        mobile.setPosition(newPosition);
        Assertions.assertEquals(newPosition, mobile.getPosition());
    }

    // Ajoutez d'autres tests selon les fonctionnalités que vous souhaitez tester
}
