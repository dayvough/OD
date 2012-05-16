package Game;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.Sprite;

public class Button {

    private int x;
    private int y;
    private int width;
    private int height;
    private String title;
    private Sprite sprite;

    public Button(String _title, int _x, int _y, int _width, int _height) {
        this.title = _title;
        this.x = _x;
        this.y = _y;
        this.width = _width;
        this.height = _height;
    }

    public Button(String _title, int _x, int _y) {
        this.title = _title;
        this.x = _x;
        this.y = _y;

        this.width = 12 * title.length();
        this.height = 24;
    }

    public Button(Sprite _sprite, int _x, int _y) {
        this.x = _x;
        this.y = _y;
        this.sprite = _sprite;
        this.width = sprite.getWidth();
        this.width = sprite.getHeight();
    }

    public void drawButton(Graphics g, int _width, boolean _selected) {
        if (sprite == null) {
            if (_selected) {
                g.setColor(77, 188, 233);
                g.fillRoundRect(x, y, _width, height, 1, 1);

                g.setColor(28, 20, 13);
                g.drawString(title, x + 5, y, 0);
            } else {
                g.setColor(203, 232, 107);
                g.fillRoundRect(x, y, _width, height, 1, 1);

                g.setColor(28, 20, 13);
                g.drawString(title, x + 5, y, 0);
            }
        }
        else {
            sprite.paint(g);
        }
    }
    
    public boolean isWithin(int _x, int _y) {
        if(this.x < _x && _x < this.width)
            if(this.y < _y && _y < this.height)
                return true;
        return false;
    }

    //<editor-fold defaultstate="collapsed" desc="Get/Set">
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //</editor-fold>
}