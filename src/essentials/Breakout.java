package essentials;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import game.Map;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Breakout extends JFrame {
	ArrayList<String> lines=new ArrayList<String>();
    public Breakout(String map) {
    	read_file(map);
        initUI();
    }
    
    private void read_file(String map)
    {
    	
         Path rootDir = Paths.get(".").normalize().toAbsolutePath();
         File file = new File(rootDir.toString() + "/src/levels/"+map+".txt");
         Reader input = null;
         if (file.exists()) {
             try {
                 input = new FileReader(file);
                 // Checks if reader is ready
                 BufferedReader br = new BufferedReader(input);
                 String line = "";
                 while ((line = br.readLine()) != null) {
                     lines.add(line);
                 }
                 // Closes the reader
                 input.close();
             }  catch (IOException e) {
                 e.printStackTrace();
             }
         }
    }

    private void initUI(){

		add(new Board(lines));
        setTitle("Breakout");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

}