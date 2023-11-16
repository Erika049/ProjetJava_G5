package contract;

/**
 * The Interface IController.
 * This interface defines the contract for a game controller.
 * It includes methods related to playing the game and handling controller orders.
 *
 * @author GROUPE 5
 */
public interface IController {

	/**
	 * Plays the game.
	 * This method is responsible for the main game loop and interactions.
	 *
	 * @throws InterruptedException if the thread is interrupted during gameplay.
	 */
	void play();

	/**
	 * Order perform.
	 * Handles the execution of a controller order.
	 *
	 * @param controllerOrder the controller order to be performed.
	 */
	void orderPerform(ControllerOrder controllerOrder);

	/**
	 * Gets the order performer.
	 * Returns an instance of the controller for order handling.
	 *
	 * @return the order performer instance.
	 */
	IController getOrderPerformer();
}
