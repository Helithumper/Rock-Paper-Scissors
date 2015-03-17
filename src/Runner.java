import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Runner {

	public static void main(String[] args) {
		//Instance Fields
		RPSGame game1 = new RPSGame();
		
		
		//Step 5: Graphics
		JFrame frame = new JFrame("Rock Paper Scissors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.WHITE);
		
		RPSGamePanel gamePanel = new RPSGamePanel();
		//gamePanel.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		
		//panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(gamePanel);
               
		
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
