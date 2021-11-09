package game;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import essentials.Breakout;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		lb_level1.setIcon(new ImageIcon(Map.class.getResource("/images/level.png")));
		lb_level1.setBounds(198, 605, 42, 42);
		frame.getContentPane().add(lb_level1);
		
		
		
		
		JLabel lb_level2 = new JLabel("");
		lb_level2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loader.Load("level2");
			}
		});
		lb_level2.setBounds(252, 473, 42, 42);
		lb_level2.setIcon(new ImageIcon(Map.class.getResource("/images/level.png")));
		frame.getContentPane().add(lb_level2);
		
		JLabel lb_level3 = new JLabel("");
		lb_level3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Loader.Load("level3");
			}
		});
		lb_level3.setBounds(373, 312, 42, 42);
		lb_level3.setIcon(new ImageIcon(Map.class.getResource("/images/level.png")));
		frame.getContentPane().add(lb_level3);
		
		
		JLabel lb_level4 = new JLabel("");
		lb_level4.setBounds(112, 128, 42, 42);
		lb_level4.setIcon(new ImageIcon(Map.class.getResource("/images/level.png")));
		frame.getContentPane().add(lb_level4);
		
		JLabel lb_level5 = new JLabel("");
		lb_level5.setBounds(349, 81, 42, 42);
		lb_level5.setIcon(new ImageIcon(Map.class.getResource("/images/level.png")));
		frame.getContentPane().add(lb_level5);
		
		JLabel lb_level6 = new JLabel("");
		lb_level6.setBounds(654, 128, 42, 42);
		lb_level6.setIcon(new ImageIcon(Map.class.getResource("/images/level.png")));
		frame.getContentPane().add(lb_level6);
		
		
		JLabel lb_level7 = new JLabel("");
		lb_level7.setBounds(774, 229, 42, 42);
		lb_level7.setIcon(new ImageIcon(Map.class.getResource("/images/level.png")));
		frame.getContentPane().add(lb_level7);
		
		JLabel lb_background = new JLabel("");
		lb_background.setIcon(new ImageIcon(Map.class.getResource("/images/map.jpg")));
		lb_background.setBounds(-12, -32, 913, 723);
		frame.getContentPane().add(lb_background);
		
	}

}
