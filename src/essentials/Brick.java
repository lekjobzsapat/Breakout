package essentials;


import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;
    private String brick_path;

    public Brick(int x, int y,String brick_path,String tdatapath) {
    	this.brick_path=brick_path;
    	datapath=tdatapath;
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

        
        var ii= new ImageIcon(datapath+brick_path+".png");
        image = ii.getImage();
        System.out.println(datapath+brick_path+".png");
    }

    boolean isDestroyed() {

        return destroyed;
    }

    void setDestroyed(boolean val) {

        destroyed = val;
    }
}