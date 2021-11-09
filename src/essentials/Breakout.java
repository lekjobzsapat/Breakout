package essentials;

import javax.swing.JFrame;


import java.util.ArrayList;



public class Breakout extends JFrame {

    public Breakout(String name,String level_name,ArrayList<String> lines,int[]datas) {
    	add(new Board(level_name,lines,datas));
        setTitle(level_name);

        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

}