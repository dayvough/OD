package Game;

import javax.microedition.lcdui.game.Sprite;

public class Entity {
    
    protected Vector position;
    protected int speed;
    protected int health;
    protected Sprite sprite;
    protected String type;
    
    public Entity(String _type, Vector _pos, Sprite _sprite) {
        this.type = _type;
        this.position = _pos;
        this.sprite = _sprite;
        this.speed = 1;
        this.health = 100;
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
    
    
}