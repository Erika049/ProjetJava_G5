package entity.element.mobile;

import entity.element.IElement;
import fr.exia.showboard.IPawn;

/**
 * The IMobile interface represents a mobile element in the game.
 * It extends IPawn and IElement interfaces.
 * It defines methods for movement, actions, and status of the mobile element.
 *
 * @see IPawn
 * @see IElement
 * @author GROUP 5
 */
public interface IMobile extends IPawn, IElement {

    /**
     * Move up.
     */
    void moveUp();

    /**
     * Move left.
     */
    void moveLeft();

    /**
     * Move down.
     */
    void moveDown();

    /**
     * Move right.
     */
    void moveRight();

    /**
     * Do nothing.
     */
    void doNothing();

    /**
     * Checks if the mobile element is alive.
     *
     * @return true if the mobile element is alive, otherwise false.
     */
    Boolean isAlive();

    /**
     * Die.
     */
    void die();

    /**
     * Win.
     */
    void win();

    /**
     * Gets the number of diamonds.
     *
     * @return the number of diamonds.
     */
    int getDiamonds();

    /**
     * Grab a diamond.
     */
    void grabDiamond();

    /**
     * Gets the X-coordinate of the mobile element.
     *
     * @return the X-coordinate.
     */
    int getX();

    /**
     * Gets the Y-coordinate of the mobile element.
     *
     * @return the Y-coordinate.
     */
    int getY();
}
