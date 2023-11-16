package entity.element;

/**
 * Enum representing different types of permeability for game elements.
 * Describes how entities interact with each other in the game.
 * Each enum value represents a specific permeability type.
 *
 * The possible permeability types are:
 * - BLOCKING: Indicates a blocking element.
 * - PENETRABLE: Indicates a penetrable element.
 * - KILLABLE: Indicates a killable element.
 * - DIAMOND: Indicates a diamond element.
 * - DIGGABLE: Indicates a diggable element.
 * - MOVABLE: Indicates a movable element.
 * - GAMEOVER: Indicates an end element, representing the end of the game.
 *
 * @author GROUPE 5
 */
public enum Permeability {
    /**
     * The blocking permeability type.
     */
    BLOCKING,

    /**
     * The penetrable permeability type.
     */
    PENETRABLE,

    /**
     * The killable permeability type.
     */
    KILLABLE,

    /**
     * The diamond permeability type.
     */
    DIAMOND,

    /**
     * The diggable permeability type.
     */
    DIGGABLE,

    /**
     * The movable permeability type.
     */
    MOVABLE,

    /**
     * The game over permeability type.
     */
    GAMEOVER
}
