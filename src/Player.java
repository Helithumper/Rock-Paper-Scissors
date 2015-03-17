import java.util.Scanner;
public class Player {
	//Instance Fields
	Scanner reader;
	//Constructor
	public Player() {
		reader = new Scanner(System.in);
	}
	
	//Methods
	public String getPlayerMove() {
		String playerMove = "";
		while(!playerMove.equals("ROCK") && !playerMove.equals("PAPER") && !playerMove.equals("SCISSORS")){
			System.out.println("Enter your move [Rock, Paper, or Scissors]: ");
			playerMove = reader.next();
			playerMove = playerMove.toUpperCase();
			if(!playerMove.equals("ROCK") && !playerMove.equals("PAPER") && !playerMove.equals("SCISSORS")){
				System.out.println("!!!ERROR, ERROR, PLEASE ENTER A VALID MOVE!!!");
			}
		}//end of while loop
		return playerMove;
	}//end of method
}//end of class
