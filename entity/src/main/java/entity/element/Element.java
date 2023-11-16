package entity.element;

import javax.swing.*;
import java.awt.*;

/**
 * The abstract class representing a game element.
 * This class implements the IElement interface and provides common functionality for game elements.
 *
 * @author GROUPE 5
 */
public abstract class Element implements IElement {

    /**
     * The sprite representing the visual appearance of the element.
     */
    private Sprite sprite;

    /**
     * The permeability of the element.
     */
    private Permeability permeability;

    /**
     * Flag indicating whether the element has changed.
     */
    private Boolean hasChanged = false;

    /**
     * Constructs an element with the specified sprite and permeability.
     *
     * @param sprite       the sprite representing the element.
     * @param permeability the permeability of the element.
     */
    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    /**
     * Gets the sprite of the element.
     *
     * @return the sprite of the element.
     */
    public final Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite of the element.
     *
     * @param sprite the new sprite for the element.
     */
    protected final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    /**
     * Gets the permeability of the element.
     *
     * @return the permeability of the element.
     */
    public final Permeability getPermeability() {
        return this.permeability;
    }

    /**
     * Sets the permeability of the element.
     *
     * @param permeability the new permeability for the element.
     */
    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    /**
     * Gets the image representation of the element.
     *
     * @return the image representation of the element.
     */
    public final Image getImage() {
        return this.getSprite().getImage();
    }

    /**
     * Gets the value of the hasChanged flag.
     *
     * @return true if the element has changed, false otherwise.
     */
    public Boolean getHasChanged() {
        return hasChanged;
    }

    /**
     * Sets the value of the hasChanged flag.
     *
     * @param hasChanged the new value for the hasChanged flag.
     */
    public void setHasChanged(Boolean hasChanged) {
        this.hasChanged = hasChanged;
    }
}
