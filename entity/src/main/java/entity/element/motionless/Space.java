package entity.element.motionless;

import entity.element.Permeability;
import entity.element.Sprite;

/**
 * The Space class represents a space as a type of motionless element.
 * It is characterized by its sprite and permeability.
 *
 * @see MotionlessElement
 * @author GROUPE 5
 */
public class Space extends MotionlessElement {

    /** The sprite for the space. */
    private static final Sprite SPRITE = new Sprite('V', "Space.png");

    /**
     * Instantiates a new space.
     */
    public Space() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
