package essentials;

import javax.swing.JFrame;

import java.util.ArrayList;
import java.awt.*;



public class Breakout extends JFrame {

    public Breakout(String name,String level_name,ArrayList<String> lines,int[]datas,String datapath) {
    	add(new Board(level_name,lines,datas,datapath));
        setTitle(name);

        
        pack();
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - this.getWidth()) / 2;
        int iCoordY = (objDimension.height - this.getHeight()) / 2;
        setLocation(iCoordX, iCoordY); 
        setResizable(false);
    }

}