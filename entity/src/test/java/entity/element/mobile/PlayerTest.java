package entity.element.mobile;

import static org.junit.jupiter.api.Assertions.*;


import entity.element.IMap;
import entity.element.Permeability;
import entity.element.Sprite;
import entity.element.motionless.MotionlessElementFactory;
import fr.exia.showboard.IBoard;
import fr.exia.showboard.ISquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class PlayerTest {

    private static final Sprite SPRITE = new Sprite('P', "Stable.png");
    private static final Point INITIAL_POSITION = new Point(5, 5);

    private Player player;



    @Test
    void testMoveUp() {
        int initialY = player.getY();
        player.moveUp();
        Assertions.assertEquals(initialY - 1, player.getY());
    }

    @Test
    void testMoveLeft() {
        int initialX = player.getX();
        player.moveLeft();
        Assertions.assertEquals(initialX - 1, player.getX());
    }

    @Test
    void testMoveDown() {
        int initialY = player.getY();
        player.moveDown();
        Assertions.assertEquals(initialY + 1, player.getY());
    }

    @Test
    void testMoveRight() {
        int initialX = player.getX();
        player.moveRight();
        Assertions.assertEquals(initialX + 1, player.getX());
    }

    @Test
    void testDoNothing() {
        int initialX = player.getX();
        int initialY = player.getY();
        player.doNothing();
        Assertions.assertEquals(initialX, player.getX());
        Assertions.assertEquals(initialY, player.getY());
    }

    @Test
    void testDie() {
        player.die();
        Assertions.assertFalse(player.isAlive());
    }

    @Test
    void testWin() {
        player.win();
        // You can add assertions based on the expected behavior when the player wins
    }

    @Test
    void testDig() {
        // You can add assertions based on the expected behavior of digging
    }

    @Test
    void testGrabDiamond() {
        // You can add assertions based on the expected behavior of grabbing a diamond
    }

    @Test
    void testPushBoulderRight() {
        // You can add assertions based on the expected behavior of pushing a boulder to the right
    }

    @Test
    void testPushBoulderLeft() {
        // You can add assertions based on the expected behavior of pushing a boulder to the left
    }

    @Test
    void testGetDiamonds() {
        // You can add assertions based on the expected behavior of getting the number of diamonds
    }

    // Ajoutez d'autres tests selon les fonctionnalités que vous souhaitez tester
}
