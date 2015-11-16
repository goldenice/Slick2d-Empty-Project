package game.logic;

import org.newdawn.slick.GameContainer;

public interface Updatable {

    /**
     * Updates the state of an instance
     * @param gc GameContainer, get environmental input
     * @param ms Milliseconds passed since last update
     */
    void update(GameContainer gc, int ms);

}
