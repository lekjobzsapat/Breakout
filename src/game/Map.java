package game;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.*;

public class Map {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Map() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map window = new Map();
					window.frame.setVisible(true);
					Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
			        int iCoordX = (objDimension.width - window.frame.getWidth()) / 2;
			        int iCoordY = (objDimension.height - window.frame.getHeight()) / 2;
			        window.frame.setLocation(iCoordX, iCoordY); 
			        window.frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Map() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		String datafolder = System.getProperty("user.dir")+"/data";
	      File file_datapath = new File(datafolder);
	      String datapath=file_datapath.getPath()+"/map/";
		frame = new JFrame();
		frame.setBounds(100, 100, 869, 715);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb_level1 = new JLabel("");
		lb_level1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loader.Load("level1");
			}
		});
		lb_level1.setIcon(new ImageIcon(datapath+"level.png"));
		lb_level1.setBounds(198, 605, 42, 42);
		frame.getContentPane().add(lb_level1);
		
		
		
		
		JLabel lb_level2 = new JLabel("");
		lb_level2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loader.Load("level2");
			}
		});
		lb_level2.setBounds(315, 386, 42, 42);
		lb_level2.setIcon(new ImageIcon(datapath+"level.png"));
		frame.getContentPane().add(lb_level2);
		
		JLabel lb_level3 = new JLabel("");
		lb_level3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loader.Load("level3");
			}
		});
		lb_level3.setBounds(160, 191, 42, 42);
		lb_level3.setIcon(new ImageIcon(datapath+"level.png"));
		frame.getContentPane().add(lb_level3);
		
		
		JLabel lb_level4 = new JLabel("");
		lb_level4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loader.Load("level4");
			}
		});
		lb_level4.setBounds(373, 83, 42, 42);
		lb_level4.setIcon(new ImageIcon(datapath+"level.png"));
		frame.getContentPane().add(lb_level4);
		
		JLabel lb_level5 = new JLabel("");
		lb_level5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loader.Load("level5");
			}
		});
		lb_level5.setBounds(689, 128, 42, 42);
		lb_level5.setIcon(new ImageIcon(datapath+"level.png"));
		frame.getContentPane().add(lb_level5);
		
		JLabel lb_background = new JLabel("");
		lb_background.setIcon(new ImageIcon(datapath+"map.jpg"));
		lb_background.setBounds(-12, -32, 913, 723);
		frame.getContentPane().add(lb_background);
		
	}

}
