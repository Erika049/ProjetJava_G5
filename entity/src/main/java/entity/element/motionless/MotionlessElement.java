package entity.element.motionless;

import entity.element.Element;
import entity.element.Permeability;
import entity.element.Sprite;

/**
 * The MotionlessElement class represents a generic motionless element in the game.
 * It is a subclass of the Element class and is used as a base class for specific motionless elements.
 * Motionless elements have a sprite representation and a permeability.
 *
 * @see entity.element.Element
 * @see entity.element.Permeability
 * @see entity.element.Sprite
 *
 * @author GROUPE 5
 * @version 1.0
 */
public class MotionlessElement extends Element {

    /**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
