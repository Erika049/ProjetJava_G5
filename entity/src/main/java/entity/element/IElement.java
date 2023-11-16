package entity.element;

import fr.exia.showboard.ISquare;

import javax.swing.*;
import java.awt.*;

/**
 * The interface for game elements.
 * Extends the ISquare interface.
 * Represents common functionality for game elements such as sprites, permeability, and change status.
 * Implement this interface in classes representing specific game elements.
 *
 * @author GROUPE 5
 */
public interface IElement extends ISquare {

    /**
     * Gets the sprite of the element.
     *
     * @return the sprite of the element.
     */
    Sprite getSprite();

    /**
     * Gets the permeability of the element.
     *
     * @return the permeability of the element.
     */
    Permeability getPermeability();

    /**
     * Gets the value of the hasChanged flag.
     *
     * @return true if the element has changed, false otherwise.
     */
    Boolean getHasChanged();

    /**
     * Sets the value of the hasChanged flag.
     *
     * @param hasChanged the new value for the hasChanged flag.
     */
    void setHasChanged(Boolean hasChanged);
}
