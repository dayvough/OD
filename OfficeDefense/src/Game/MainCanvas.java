 package Game;

import javax.microedition.lcdui.*;

public class MainCanvas extends Canvas implements CommandListener {

    private Midlet m;
    private boolean exitCommand;
    private static int RESOLUTION;
    private int selectedButton;
    private Button browseGameButton;
    private Button randomGameButton;
    private Button aboutButton;
    private Button exitButton;

    public MainCanvas(Midlet _m) {
        super.setFullScreenMode(true);

        m = _m;
        
        if (this.getWidth() == 240) {
            RESOLUTION = 240;
        }
        if (this.getWidth() == 320) {
            RESOLUTION = 320;
        }

        init();
    }

    private void init() {
        exitCommand = false;
        
        int res_position = 0;

        if (RESOLUTION == 240) {
            res_position = 180;
        }
        if (RESOLUTION == 320) {
            res_position = 110;
        }

        selectedButton = 1;
        browseGameButton = new Button("Browse Games", 10, res_position);
        randomGameButton = new Button("Random Game", 10, res_position + 25);
        aboutButton = new Button("About", 10, res_position + 50);
        exitButton = new Button("Exit", 10, res_position + 75);
    }

    protected void paint(Graphics g) {
        paintButtons(g);
    }

    protected void keyPressed(int keycode) {
        int gameAction = this.getGameAction(keycode);

        if (gameAction == FIRE || gameAction == KEY_NUM5) {
            if(selectedButton == 1) ;
            if(selectedButton == 2) ;
            if(selectedButton == 4) m.exitMidlet();
        }

        if (gameAction == UP || gameAction == KEY_NUM2) {
            if(selectedButton == 1) selectedButton = 4;
            else if (selectedButton != 1) {
                selectedButton--;
            }
        }

        if(gameAction == LEFT) {
            //m.goToGamesDisplay(false);
        }
        
        if (gameAction == DOWN || gameAction == KEY_NUM8) {
            if(selectedButton == 4) selectedButton = 1;
            else if (selectedButton != 4) {
                selectedButton++;
            }
        }

        repaint();
    }

    protected void pointerPressed(int _x, int _y) {
    }

    public void paintButtons(Graphics g) {
        switch (selectedButton) {
            case 1:
                browseGameButton.drawButton(g, 135, true);
                randomGameButton.drawButton(g, 133, false);
                aboutButton.drawButton(g, 60, false);
                exitButton.drawButton(g, 40, false);
                break;
            case 2:
                browseGameButton.drawButton(g, 135, false);
                randomGameButton.drawButton(g, 133, true);
                aboutButton.drawButton(g, 60, false);
                exitButton.drawButton(g, 40, false);
                break;
            case 3:
                browseGameButton.drawButton(g, 135, false);
                randomGameButton.drawButton(g, 133, false);
                aboutButton.drawButton(g, 60, true);
                exitButton.drawButton(g, 40, false);
                break;
            case 4:
                browseGameButton.drawButton(g, 135, false);
                randomGameButton.drawButton(g, 133, false);
                aboutButton.drawButton(g, 60, false);
                exitButton.drawButton(g, 40, true);
                break;
        }
    }

    public void commandAction(Command c, Displayable d) {
    }

    public boolean isExitCommand() {
        return exitCommand;
    }

    public void setExitCommand(boolean exitCommand) {
        this.exitCommand = exitCommand;
    }
}