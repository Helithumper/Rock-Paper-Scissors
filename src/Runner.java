import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Runner {

	public static void main(String[] args) {
		//Instance Fields
		RPSGame game1 = new RPSGame();/*
		System.out.println(game1.gameIntro());
		Scanner reader = new Scanner(System.in);
		int playerWins=0,computerWins =0;*/
			

		
		//Step 1
		//ComputerPlayer compPlayer = new ComputerPlayer();
		//System.out.println("Computer Move: " + compPlayer.getComputerMove());
		
		//Step 2
		//Player player1 = new Player();
		//System.out.println("The Player Chose " + player1.getPlayerMove());
		
		//Step 3 Play 1 Round
		/*String playAgain = "y";
		while(playAgain.equals("yes") || playAgain.equals("y")){
			//RPSGame game1 = new RPSGame();
			//System.out.println(game1.gameIntro());
			//game1.playGame();
			/*game1.updateScore();
			System.out.println("Player Wins = " + game1.getPlayerWins());
			System.out.println("Computer Wins = " + game1.getComputerWins());*/
			//System.out.println("The Current Score:\nPlayerWins = " + game1.getPlayerWins() + "\nComputerWins= " + game1.getComputerWins() + "\nTies = " + game1.getTies());
			//System.out.println("Would You Like to Play Again [Y,Yes,N,No]");
			//playAgain = reader.next();
			
		//}
		//System.out.println(game1.gameEnd());
		//*/
		
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
