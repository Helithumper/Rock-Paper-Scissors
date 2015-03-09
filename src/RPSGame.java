import java.util.Scanner;

public class RPSGame {
	//Instance Fields
	private Scanner reader;
	private Player player1;
	private ComputerPlayer compplayer1;
	private String playerMove,computerMove;
	private Boolean playerWon;
	private int playerWins,computerWins,ties;
	//Constructor
	public RPSGame(){
		reader = new Scanner(System.in);
		gameIntro();
	}
	//Assessors
	public int getComputerWins() {return computerWins;}
	public int getPlayerWins() {return playerWins;}
	public Boolean getPlayerWon() {return playerWon;}
	public String getComputerMove() {return computerMove;}
	public String getPlayerMove() {return playerMove;}
	public int getTies() {return ties;}
	//Mutators
	//public void setComputerWins(int computerWins) {this.computerWins = computerWins;}
	//public void setPlayerWins(int playerWins) {this.playerWins = playerWins;}
	//public void setPlayerWon(Boolean playerWon) {this.playerWon = playerWon;}
	//public void setComputerMove(String computerMove) {this.computerMove = computerMove;}
	//public void setPlayerMove(String playerMove) {this.playerMove = playerMove;}


	//Methods
	public String gameIntro() {
		return "LETS PLAY ROCK<<<<PAPPPEEERRR<<<<<<SCCCCCCCCIIISSSSUUUHHHRRRSS!!!";
	}
	
	public void playGame() {
		String winner = "";
		player1 = new Player();
		compplayer1 = new ComputerPlayer();
		playerMove = player1.getPlayerMove();
		computerMove = compplayer1.getComputerMove();
		System.out.println("PlayerMove = "+playerMove);
		System.out.println("ComputerMove = " +computerMove);
		System.out.println(determineRoundWinner(playerMove,computerMove));
	}
	public String determineRoundWinner(String playerMove, String computerMove){
		//String result = "";
		if(playerMove.equals(computerMove)){ties++;return "TIE!";}
		else if(computerMove.equals("SCISSORS") && playerMove.equals("PAPER")) {computerWins++ ; return "COMPUTER WINS!";}
		else if(computerMove.equals("ROCK") && playerMove.equals("SCISSORS")) {computerWins++; return "COMPUTER WINS!";}
		else if(computerMove.equals("PAPER") && playerMove.equals("ROCK")) {computerWins++; return "COMPUTER WINS!";}
		else if(playerMove.equals("SCISSORS") && computerMove.equals("PAPER")) {playerWins++; return "PLAYER WINS!";}
		else if(playerMove.equals("ROCK") && computerMove.equals("SCISSORS")) {playerWins++; return "PLAYER WINS!";}
		else if(playerMove.equals("PAPER") && computerMove.equals("ROCK")) {playerWins++; return "PLAYER WINS!";}
		else{return "ERROR: No Results for inputs";}
		//return result;
		//return result;
	}
	/*public void updateScore(){
		if(playerWon){playerWins++;}
		else{computerWins++;}
	}*/
	public String gameEnd(){
		return "Thanks for Playing!";
	}
	//toString()
}
