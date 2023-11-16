package entity.element;

import entity.element.mobile.IMobile;
import fr.exia.showboard.ISquare;

import java.util.List;
import java.util.Observable;

/**
 * The interface for the game map.
 * Represents common functionality for game maps, including dimensions, elements retrieval, modification,
 * mobile elements' status, observability, correctness, and tracking changes.
 * Implement this interface in classes representing specific game maps.
 *
 * @author GROUPE 5
 */
public interface IMap {

    /**
     * Gets the width of the map.
     *
     * @return the width of the map.
     */
    int getWidth();

    /**
     * Gets the height of the map.
     *
     * @return the height of the map.
     */
    int getHeight();

    /**
     * Gets the element on the map at the specified coordinates.
     *
     * @param x the x-coordinate.
     * @param y the y-coordinate.
     * @return the element on the map at the specified coordinates.
     */
    IElement getOnTheMapXY(int x, int y);

    /**
     * Sets the element on the map at the specified coordinates.
     *
     * @param element the element to set.
     * @param x       the x-coordinate.
     * @param y       the y-coordinate.
     */
    void setOnTheMapXY(IElement element, final int x, final int y);

    /**
     * Sets the status of mobile elements as changed.
     */
    void setMobileHasChanged();

    /**
     * Gets the observable object associated with the map.
     *
     * @return the observable object associated with the map.
     */
    Observable getObservable();

    /**
     * Checks if the map is correct.
     *
     * @return true if the map is correct, false otherwise.
     */
    boolean isCorrect();

    /**
     * Gets the list of coordinates where changes have occurred.
     *
     * @return the list of coordinates where changes have occurred.
     */
    List<Integer> getHasChanged();
}
