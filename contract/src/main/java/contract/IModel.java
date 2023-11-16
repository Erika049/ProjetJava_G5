package contract;

import entity.element.IMap;
import entity.element.mobile.IMobile;

/**
 * The Interface IModel.
 * This interface defines the contract for the game model.
 * It includes methods to retrieve the game map and the player entity.
 *
 * @author GROUPE 5
 */
public interface IModel {

	/**
	 * Gets the game map.
	 * Returns the game map interface representing the current state of the game.
	 *
	 * @return the game map.
	 */
	IMap getMap();

	/**
	 * Gets the player entity.
	 * Returns the player entity interface representing the main character in the game.
	 *
	 * @return the player entity.
	 */
	IMobile getMyPlayer();
}
