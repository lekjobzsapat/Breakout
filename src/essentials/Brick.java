package essentials;


import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;
    private String color;

    public Brick(int x, int y,String color) {
    	this.color=color;
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
        
        switch(color)
        {
        case "b": ii= new ImageIcon("src/images/brick_blue.png");		break;
        case "g": ii= new ImageIcon("src/images/brick_green.png");	break;
        case "l": ii= new ImageIcon("src/images/brick_light_blue.png");	break;
        case "o": ii= new ImageIcon("src/images/brick_orange.png");	break;
        case "p": ii= new ImageIcon("src/images/brick_pink.png");	break;
        case "u": ii= new ImageIcon("src/images/brick_purple.png");	break;
        case "r": ii= new ImageIcon("src/images/brick_red.png");	break;
        case "y": ii= new ImageIcon("src/images/brick_yellow.png");	break;
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