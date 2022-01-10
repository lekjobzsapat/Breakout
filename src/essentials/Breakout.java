package essentials;

import javax.swing.JFrame;

import java.io.File;
import java.util.ArrayList;



public class Breakout extends JFrame {

    public Breakout(String name,String level_name,ArrayList<String> lines,int[]datas,String datapath) {
    	add(new Board(level_name,lines,datas,datapath));
        setTitle(name);

        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

}