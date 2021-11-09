package essentials;


import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;
    private String brick_path;

    public Brick(int x, int y,String brick_path) {
    	this.brick_path=brick_path;
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

        
        var ii= new ImageIcon("src/"+brick_path+".png");
        image = ii.getImage();
        System.out.println("src/"+brick_path+".png");
    }

    boolean isDestroyed() {

        return destroyed;
    }

    void setDestroyed(boolean val) {

        destroyed = val;
    }
}