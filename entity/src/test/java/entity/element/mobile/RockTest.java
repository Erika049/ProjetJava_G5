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

class RockTest {

    private static final Sprite SPRITE = new Sprite('R', "Rock.png");
    private static final Point INITIAL_POSITION = new Point(5, 5);

    private Rock rock;



    @Test
    void testMoveRight() {
        int initialX = rock.getX();
        rock.moveRight();
        Assertions.assertEquals(initialX + 1, rock.getX());
    }

    @Test
    void testMoveLeft() {
        int initialX = rock.getX();
        rock.moveLeft();
        Assertions.assertEquals(initialX - 1, rock.getX());
    }

    @Test
    void testMoveDown() {
        int initialY = rock.getY();
        rock.moveDown();
        Assertions.assertEquals(initialY + 1, rock.getY());
    }

    @Test
    void testMoveUp() {
        int initialY = rock.getY();
        rock.moveUp();
        Assertions.assertEquals(initialY - 1, rock.getY());
    }

    @Test
    void testWin() {
        // You can add assertions based on the expected behavior when the rock wins
    }

    @Test
    void testGetDiamonds() {
        // You can add assertions based on the expected behavior of getting the number of diamonds
    }

    @Test
    void testGrabDiamond() {
        // You can add assertions based on the expected behavior of grabbing a diamond
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
