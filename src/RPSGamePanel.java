import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class RPSGamePanel extends JPanel{
	//Instance Fields
	//private RPSGame game1 = new RPSGame();
	private Player player1;
	private ComputerPlayer player2;
	private int player1RoundsWon,player2RoundsWon;
	private String playerMove,computerMove,winner;
	private JLabel imgLabel,player1Image,player2Image,resultLabel;
	private ImageIcon rockImage,paperImage,scissorsImage,blankImage,lizardImage,spockImage;
	
	//Constructor
	public RPSGamePanel() {
		//Creates Instances of Players
		player1 = new Player();
		player2 = new ComputerPlayer();
		
		//Setting Images
		blankImage = new ImageIcon ("blank.png");
		rockImage = new ImageIcon("rock.png");
		paperImage = new ImageIcon("paper.png");
		scissorsImage = new ImageIcon("scissors.png");
		lizardImage = new ImageIcon("lizard.png");
		spockImage = new ImageIcon("spock.png");
		
		//sets Layout
		setBoxLayout();
		setBackground(Color.WHITE);
	}//End of Constructor
	
	//Methods
	public void setBoxLayout() {
		//Creates Label on Panel
		setLayout(new GridLayout(2,2));
		imgLabel = new JLabel("Rock Paper Scissors Lizard Spock Game",null,SwingConstants.CENTER);
		
		
		//Creates GIANT JPANEL
		//JPanel mainPanel = new JPanel();
		//Positions label
		
		JPanel labelPanel = new JPanel();
		labelPanel.add(imgLabel);
		labelPanel.setBackground(Color.WHITE);
		
		resultLabel = new JLabel("",null,SwingConstants.CENTER);
		//Positions Label
		JPanel resultPanel = new JPanel();
		resultPanel.add(resultLabel);
		resultPanel.setPreferredSize(new Dimension(400,30));
		resultPanel.setBackground(Color.WHITE);
		
		JPanel imagePanel = new JPanel();
		imagePanel.setLayout(new GridLayout(1,2));
		
		//Sets Images for Player and Computer
		player1Image = new JLabel();
		player2Image = new JLabel();
		//player2Image.setBackground(Color.WHITE);
		player1Image.setBackground(Color.WHITE);
		player1Image.setIcon(blankImage);
		player1Image.setMinimumSize(new Dimension(200,200));
		imagePanel.add(player1Image);
		player2Image.setBackground(Color.WHITE);
		player2Image.setIcon(blankImage);
		player2Image.setMinimumSize(new Dimension(200,200));
		imagePanel.add(player2Image);
		player2Image.setLocation(50, 100);
		
		
		resultPanel.add(imagePanel);
		add(resultPanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		
		//buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
		buttonPanel.setLayout(new GridLayout(6,1));
		buttonPanel.add(labelPanel);
		//Buttons
		JButton button;
		button = new JButton("--Rock--");
		//button.setPreferredSize(new Dimension(32,0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMove = "ROCK";
				player1Image.setIcon(rockImage);
				checkComputerMove();
				determineRoundWinner();
			}
		});
		buttonPanel.add(button,BorderLayout.LINE_START);
		
		button = new JButton("--Paper--");
		//button.setPreferredSize(new Dimension(32,0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMove = "PAPER";
				player1Image.setIcon(paperImage);
				checkComputerMove();
				determineRoundWinner();
			}
		});
		buttonPanel.add(button,BorderLayout.LINE_END);
		
		button = new JButton("--Scissors--");
		//button.setPreferredSize(new Dimension(32,0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMove = "SCISSORS";
				player1Image.setIcon(scissorsImage);
				checkComputerMove();
				determineRoundWinner();
			}
		});
		buttonPanel.add(button,BorderLayout.CENTER);
		
		button = new JButton("--Lizard--");
		//button.setPreferredSize(new Dimension(32,0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMove = "LIZARD";
				player1Image.setIcon(lizardImage);
				checkComputerMove();
				determineRoundWinner();
			}
		});
		buttonPanel.add(button,BorderLayout.PAGE_END);
		
		button = new JButton("--Spock--");
		//button.setPreferredSize(new Dimension(32,0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerMove = "SPOCK";
				player1Image.setIcon(spockImage);
				checkComputerMove();
				determineRoundWinner();
			}
		});
		buttonPanel.add(button,BorderLayout.PAGE_START);
		
		add(buttonPanel,BorderLayout.LINE_START);
		
		
	}//End of Method
	
	public void checkComputerMove() {
		computerMove = player2.getComputerMove();
		if (computerMove.equalsIgnoreCase("ROCK") ) { player2Image.setIcon(rockImage); }
		else if (computerMove.equalsIgnoreCase("PAPER")) { player2Image.setIcon(paperImage); }
		else if (computerMove.equalsIgnoreCase("SCISSORS")) { player2Image.setIcon(scissorsImage); }
		else if (computerMove.equalsIgnoreCase("SPOCK")) {player2Image.setIcon(spockImage);}
		else if (computerMove.equalsIgnoreCase("LIZARD")) {player2Image.setIcon(lizardImage);}

	}//end of method
	
	 public void determineRoundWinner(){
		    if (computerMove.equals("ROCK") && playerMove.equals("ROCK")){
		      resultLabel.setText("There was a tie.");
		    }
		    else if (computerMove.equals("PAPER") && playerMove.equals("PAPER")){
		      resultLabel.setText("There was a tie.");
		    }
		    else if (computerMove.equals("SCISSORS") && playerMove.equals("SCISSORS")){
		    	resultLabel.setText("There was a tie.");
		    }
		    else if (computerMove.equals("LIZARD") && playerMove.equals("SPOCK")){
		    	resultLabel.setText("The Computer Wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("LIZARD") && playerMove.equals("PAPER")){
		    	resultLabel.setText("The Computer Wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("SPOCK") && playerMove.equals("SCISSORS")){
		    	resultLabel.setText("The Computer Wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("SPOCK") && playerMove.equals("ROCK")){
		    	resultLabel.setText("The Computer Wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("SCISSORS") && playerMove.equals("PAPER")){
		    	resultLabel.setText("The computer wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("PAPER") && playerMove.equals("SPOCK")){
		    	resultLabel.setText("The computer wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("LIZARD") && playerMove.equals("SPOCK")){
		    	resultLabel.setText("The computer wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("SCISSORS") && playerMove.equals("LIZARD")){
		    	resultLabel.setText("The computer wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("ROCK") && playerMove.equals("LIZARD")){
		    	resultLabel.setText("The computer wins.");
		    	player2RoundsWon++;
		    }
		    else if (computerMove.equals("PAPER") && playerMove.equals("ROCK")){
		    	resultLabel.setText("The computer wins.");
		    	player2RoundsWon++;
		    }
		   else if (computerMove.equals("ROCK") && playerMove.equals("SCISSORS")){
			   resultLabel.setText("The computer wins.");
			   player2RoundsWon++;
		    }
		   else{
			   resultLabel.setText("The human player wins.");
			   player1RoundsWon++;
		   }//end of conditional
		    
		    resultLabel.setText(resultLabel.getText() + " Rounds Won: " + player1RoundsWon + " Rounds Lost: " + player2RoundsWon);
		  }//end of round-winner method
	
	
}
