package Game;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.Sprite;

public class Tower {
    
    private Vector position;
    private int width;
    private int height;
    private Sprite sprite;
    private Sprite sprite_current;
    private Sprite sprite_selected;
    private int damage;
    private String type;
    private boolean isSelected;
    private Projectile[] projectiles;
    
    public Tower(String _type, int _x, int _y, Sprite _sprite, Sprite _spriteSelected) {
        this.position = new Vector(_x, _y);
        this.sprite = _sprite;
        this.sprite_current = sprite;
        this.sprite_selected = _spriteSelected;
        this.isSelected = false;
        this.width = sprite.getWidth();
        this.height = sprite.getHeight();
        this.damage = 5;
        this.type = _type;
    }
    
    public void update() {
        for(int i = 0; i < projectiles.length; i++) {
            
        }
    }
    
    public void paint(Graphics g) {
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set"> 
    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        if(isSelected == false) sprite_current = sprite;
        else sprite_current = sprite_selected;
        
        this.isSelected = isSelected;
    }

    public Sprite getSprite_selected() {
        return sprite_selected;
    }

    public void setSprite_selected(Sprite sprite_selected) {
        this.sprite_selected = sprite_selected;
    }
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Vector getPosition() {
        return position;
    }

    public void setPosition(Vector position) {
        this.position = position;
    }

    public Projectile[] getProjectiles() {
        return projectiles;
    }

    public void setProjectiles(Projectile[] projectiles) {
        this.projectiles = projectiles;
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
    //</editor-fold>
}