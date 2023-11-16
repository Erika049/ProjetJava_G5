package entity.element.mobile;

import entity.element.Permeability;
import entity.element.Sprite;

/**
 * The Diamond class represents a diamond as a type of mobile element.
 * It is characterized by its sprite and permeability.
 *
 * @see Mobile
 * @author GROUPE 5
 */
public class Diamond extends Mobile {

    /** The sprite for the diamond. */
    private static final Sprite SPRITE = new Sprite('D', "Diamond.png");

    /**
     * Instantiates a new diamond.
     */
    Diamond() {
        super(SPRITE, Permeability.DIAMOND);
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
