package entity.element.motionless;

import entity.element.Permeability;
import entity.element.Sprite;

/**
 * The Door class represents a motionless element in the game, specifically a door.
 * It extends the MotionlessElement class.
 * The door has a sprite representation and a permeability of "GAMEOVER".
 *
 * @see entity.element.motionless.MotionlessElement
 * @see entity.element.Permeability
 * @see entity.element.Sprite
 *
 * @author GROUPE 5

 */
public class Door extends MotionlessElement {

    /** The Constant SPRITE representing the sprite of the door. */
    private static final Sprite SPRITE = new Sprite('E', "Door.png");

    /**
     * Instantiates a new Door.
     * It sets the sprite and permeability of the door.
     */
    public Door() {
        super(SPRITE, Permeability.GAMEOVER);
    }
}
