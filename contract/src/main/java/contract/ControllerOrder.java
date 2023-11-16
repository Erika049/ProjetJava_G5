package contract;

/**
 * The Enum ControllerOrder.
 * This enumeration represents the possible orders for the controller.
 * It includes directions such as UP, DOWN, LEFT, RIGHT, and a static order NOP (No Operation).
 * The controller uses these orders to determine the movement of the player.
 *
 * @author GROUPE 5
 */
public enum ControllerOrder {

	/**
	 * The UP direction order.
	 */
	UP,

	/**
	 * The DOWN direction order.
	 */
	DOWN,

	/**
	 * The LEFT direction order.
	 */
	LEFT,

	/**
	 * The RIGHT direction order.
	 */
	RIGHT,

	/**
	 * The static order indicating no operation.
	 * This is used when no specific movement order is given.
	 */
	NOP
}
