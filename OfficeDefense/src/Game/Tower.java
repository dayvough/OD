package Game;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public class Tower {
    private Vector position;
    private int width;
    private int height;
    private int damage;
    private boolean isSelected;
    private String type;
    private Sprite sprite;
    private Sprite sprite_current;
    private Sprite sprite_selected;
    private Projectile[] projectiles;
    
    public Tower(String _type, int _level, Image _image) {
        this.setXAndY(_level);
        this.setSprites(_image);
        this.isSelected = false;
        this.width = sprite.getWidth();
        this.height = sprite.getHeight();
        this.damage = 5;
        this.type = _type;
    }
    
    private void setXAndY(int _level) {
        switch(_level) {
            case 1: this.position = new Vector(50, 50); break;
            case 2: this.position = new Vector(100, 100); break;
        }
    }
    
    private void setSprites(Image _image) {
        
    }
    
    public void update() {
        for(int i = 0; i < projectiles.length; i++) {
            
        }
    }
    
    public boolean collidesWithObject(Entity entity) {
        if(sprite_current.collidesWith(entity.sprite, true)) {
            return true;
        }
        
        return false;
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