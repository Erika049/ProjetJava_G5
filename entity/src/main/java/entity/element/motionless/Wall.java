package entity.element.motionless;

import entity.element.Permeability;
import entity.element.Sprite;

/**
 * The Wall class represents a wall as a type of motionless element.
 * It is characterized by its sprite and permeability.
 *
 * @see MotionlessElement
 * @author [Your Name]
 */
public class Wall extends MotionlessElement {

    /** The sprite for the wall. */
    private static final Sprite SPRITE = new Sprite('W', "Wall.png");

    /**
     * Instantiates a new wall.
     */
    public Wall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
