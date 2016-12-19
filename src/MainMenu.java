import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenu{
	static JMenuBar menuBar;
	static JMenu menu;
	static JMenuItem menuItem;
	static JFrame gameFrame;
	static Board board;
	public static void main(String[] args){
		gameFrame = new JFrame("Tic Tac Toe");
		gameFrame.setSize(700, 700);
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setLocationRelativeTo(null);
		menuBar = new JMenuBar();
		
		//Building first menu
		menu = new JMenu("Menu");
		//key that will execute this button
		menu.setMnemonic(KeyEvent.VK_ENTER);
		
		menu.getAccessibleContext().setAccessibleDescription("Doot Doot");
		menuBar.add(menu);
		
		//Menu items to show the menu items
		menuItem = new JMenuItem("Start New Game", new ImageIcon("assets/game-console.png"));
		menuItem.setMnemonic(KeyEvent.VK_0);
		
		menuItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gameFrame.add(new Board());
				gameFrame.validate();
				gameFrame.repaint();
			}
			
		});
		menu.add(menuItem);
		
		//add a separator. 
		menu.addSeparator();
		
		menuItem = new JMenuItem("Difficulty", new ImageIcon("assets/races.png"));
		menuItem.setMnemonic(KeyEvent.VK_1);
		menu.add(menuItem);
		
		//add a separator. dont know what that means
		menu.addSeparator();
		
		menuItem = new JMenuItem("Exit", new ImageIcon("assets/error.png"));
		menuItem.setMnemonic(KeyEvent.VK_2);
		menu.add(menuItem);
		
		
		
		gameFrame.setJMenuBar(menuBar);
		gameFrame.validate();
		gameFrame.repaint();
	}                       
}
