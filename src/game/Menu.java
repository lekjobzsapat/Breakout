package game;

import java.awt.EventQueue;

import javax.swing.JFrame;

import essentials.Board;
import essentials.Breakout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_Game = new JButton("Játék");
		btn_Game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(() -> {
		            Map.Map();
		           frame.setVisible(false);
		        });
			}
		});
		btn_Game.setBounds(163, 38, 89, 23);
		frame.getContentPane().add(btn_Game);
		
		JButton btn_Exit = new JButton("Kilépés");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  System.exit(0); 
			}
		});
		btn_Exit.setBounds(163, 119, 89, 23);
		frame.getContentPane().add(btn_Exit);
		
		JButton btn_test = new JButton("instant start");
		btn_test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 var game = new Breakout("ASD");
		            game.setVisible(true);
			}
		});
		btn_test.setBounds(163, 185, 89, 23);
		frame.getContentPane().add(btn_test);
	}
}
