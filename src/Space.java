import java.awt.CardLayout;

import javax.swing.JPanel;
/*Board is represented as the following
 * 0|1|2
 * -----
 * 3|4|5
 * -----
 * 6|7|8 
 */
public class Space extends JPanel{
	int position;
	int row;
	int column;
	public Space(int position, int row, int column){
		this.position = position;
		this.row = row;
		this.column = column;
		this.setLayout(new CardLayout());
	}
}
