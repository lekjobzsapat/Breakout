package essentials;

import javax.swing.JFrame;


import java.util.ArrayList;



public class Breakout extends JFrame {

    public Breakout(String level_name,ArrayList<String> lines) {
    	add(new Board(level_name,lines));
        setTitle("Breakout");

        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

}