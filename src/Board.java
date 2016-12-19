import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Board extends JPanel{
	JPanel boardPanels[][] = new Space[3][3];
	public Board(){
		this.setBackground(new Color(180, 185, 193));
		this.setLayout(new GridLayout(3,3));
		int rowLength = 3;
		for(int row = 0; row < 4; row++){
			for(int column = 0; column < 4; column++){
				boardPanels[row][column] = new Space((row*rowLength)+column, row, column);
				this.add(boardPanels[row][column]);
			}
		}
	}
}
