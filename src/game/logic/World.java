package game.logic;

import game.Engine;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;
import java.util.List;

public abstract class World implements Updatable, Renderable {

    private Engine engine;
    private int width;
    private int height;
    private List<Entity> entities = new ArrayList<>();

    public World(Engine engine, int width, int height) {
        this.engine = engine;
        this.width = width;
        this.height = height;
    }

    protected void addEntity(Entity entity) {
        entities.add(entity);
    }

    protected List<Entity> getEntities() {
        return entities;
    }

    public void update(GameContainer gc, int ms) {
        entities.forEach(e -> e.update(gc, ms));
    }

    public void render(GameContainer gc, Graphics g) {
        entities.forEach(e -> e.render(gc, g));
    }

}
