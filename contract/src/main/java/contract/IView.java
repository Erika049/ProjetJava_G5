package contract;

import fr.exia.showboard.BoardFrame;

import javax.swing.*;

/**
 * The Interface IView.
 * This interface defines the contract for the game view.
 * It includes methods to display messages, follow the player, update the view, and get the game board frame.
 *
 * @author GROUPE 5
 */
public interface IView {

	/**
	 * Displays a message in the game view.
	 *
	 * @param message the message to be displayed.
	 */
	void displayMessage(final String message);

	/**
	 * Follows the player in the game view.
	 * Adjusts the view to focus on the player's position.
	 */
	void followMyPlayer();

	/**
	 * Updates the game view.
	 * Refreshes the display to reflect any changes in the game state.
	 */
	void updateView();

	/**
	 * Gets the game board frame.
	 *
	 * @return the game board frame.
	 */
	BoardFrame getBoardFrame();
}
