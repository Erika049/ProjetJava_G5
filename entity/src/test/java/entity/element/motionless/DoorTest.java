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

class DoorTest {

    private static final Sprite SPRITE = new Sprite('E', "Door.png");
    private static final Point INITIAL_POSITION = new Point(5, 5);

    private Door door;



    @Test
    void testGetSprite() {
        Assertions.assertEquals(SPRITE, door.getSprite());
    }

    @Test
    void testGetPermeability() {
        Assertions.assertEquals(Permeability.GAMEOVER, door.getPermeability());
    }

    @Test
    void testGetX() {}

    @Test
    void testGetY() {
    }

    @Test
    void testGetPosition() {
    }

    @Test
    void testSetPosition() {
    }

    @Test
    void testGetBoard() {
    }}