package entity.element.motionless;

import entity.element.Permeability;
import entity.element.Sprite;

/**
 * The Ground class represents a motionless element in the game, specifically the ground.
 * It extends the MotionlessElement class.
 * The ground has a sprite representation and a permeability of "DIGGABLE".
 *
 * @see entity.element.motionless.MotionlessElement
 * @see entity.element.Permeability
 * @see entity.element.Sprite
 *
 * @author GROUPE 5
 * @version 1.0
 */
public class Ground extends MotionlessElement {

    /** The Constant SPRITE representing the sprite of the ground. */
    private static final Sprite SPRITE = new Sprite('G', "Ground.png");

    /**
     * Instantiates a new Ground.
     * It sets the sprite and permeability of the ground.
     */
    Ground() {
        super(SPRITE, Permeability.DIGGABLE);
    }
}
