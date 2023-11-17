package model;

import contract.IModel;
import entity.element.IMap;
import entity.element.mobile.IMobile;
import entity.element.mobile.Player;

import java.io.IOException;

/**
 * The Model class represents the game model and contains the game map and player information.
 * It implements the IModel interface.
 * The model is responsible for instantiating the map and player based on the provided map file and player start coordinates.
 * It also provides methods to get the map and player.
 *
 * @author GROUPE 5
 */
public class Model implements IModel {

    /** The game map. */
    private IMap map;

    /** The player character. */
    private IMobile myPlayer;

    /**
     * Instantiates a new Boulder Dash model.
     *
     * @param mapFile         the file containing the game map
     * @param myPlayerStartX  the initial X-coordinate of the player
     * @param myPlayerStartY  the initial Y-coordinate of the player
     */
    public Model(final String mapFile, final int myPlayerStartX, final int myPlayerStartY) {
        try {
            this.setMap(new Map(mapFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.setMyPlayer(new Player(myPlayerStartX, myPlayerStartY, this.getMap()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the game map.
     *
     * @return the game map
     */
    @Override
    public final IMap getMap() {
        return this.map;
    }

    /**
     * Sets the game map.
     *
     * @param map the game map to set
     */
    private void setMap(final IMap map) {
        this.map = map;
    }

    /**
     * Gets the player character.
     *
     * @return the player character
     */
    @Override
    public final IMobile getMyPlayer() {
        return this.myPlayer;
    }

    /**
     * Sets the player character.
     *
     * @param myPlayer the player character to set
     */
    private void setMyPlayer(final IMobile myPlayer) {
        this.myPlayer = myPlayer;
    }
}
