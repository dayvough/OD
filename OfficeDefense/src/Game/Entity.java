package Game;

import javax.microedition.lcdui.game.Sprite;

public class Entity {
    protected int width;
    protected int height;
    protected int speed;
    protected int health;
    protected Sprite sprite;
    protected String type;
    protected Vector position;
    
    public Entity(String _type, Vector _pos, Sprite _sprite) {
        this.type = _type;
        this.position = _pos;
        this.sprite = _sprite;
        this.width = sprite.getWidth();
        this.height = sprite.getHeight();
        this.speed = 1;
        this.health = 100;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //</editor-fold>
}