package entity.element.mobile;

import entity.element.Permeability;
import entity.element.Sprite;

/**
 * The Butterfly class represents a butterfly as a type of mobile element.
 * It is characterized by its sprite and permeability.
 *
 * @see Mobile
 * @author GROUPE 5
 */
public class Butterfly extends Mobile {

    /** The sprite for the butterfly. */
    private static final Sprite SPRITE = new Sprite('B', "Butterfly.png");

    /**
     * Instantiates a new butterfly.
     */
    public Butterfly() {
        super(SPRITE, Permeability.KILLABLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void win() {
        // TODO Auto-generated method stub
        return;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDiamonds() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     * Gets the diamonds.
     */
    @Override
    public void grabDiamond() {
        return;
    }
}
