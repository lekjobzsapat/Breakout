package essentials;


import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;

    public Brick(int x, int y) {

        initBrick(x, y);
    }

    private void initBrick(int x, int y) {

        this.x = x;
        this.y = y;

        destroyed = false;

        loadImage();
        getImageDimensions();
    }

    private void loadImage() {

        var ii= new ImageIcon("src/images/brick_pink.png");
        int randomNum = (int)(Math.random() * 8);
        switch(randomNum)
        {
        case 0: ii= new ImageIcon("src/images/brick_blue.png");		break;
        case 1: ii= new ImageIcon("src/images/brick_green.png");	break;
        case 2: ii= new ImageIcon("src/images/brick_light_blue.png");	break;
        case 3: ii= new ImageIcon("src/images/brick_orange.png");	break;
        case 4: ii= new ImageIcon("src/images/brick_pink.png");	break;
        case 5: ii= new ImageIcon("src/images/brick_purple.png");	break;
        case 6: ii= new ImageIcon("src/images/brick_red.png");	break;
        case 7: ii= new ImageIcon("src/images/brick_yellow.png");	break;
        }
        image = ii.getImage();
    }

    boolean isDestroyed() {

        return destroyed;
    }

    void setDestroyed(boolean val) {

        destroyed = val;
    }
}