import java.util.Random;


public class ComputerPlayer {
	//Instance Fields
	
	
	//Constuctors
	public ComputerPlayer() {}
	
	//Methods
	public String getComputerMove(){
		int compMoveInt = 0;
		String compMove = null;
		Random generator = new Random();
		//compMoveInt = (int)(Math.random() *3) + 1;
		compMoveInt = generator.nextInt(5) + 1;
		if(compMoveInt == 1) {compMove = "Rock";}
		else if (compMoveInt == 2) {compMove = "Paper";}
		else if (compMoveInt == 3) {compMove = "Scissors";}
		else if (compMoveInt == 4) {compMove = "Lizard";}
		else if (compMoveInt == 5) {compMove = "Spock";}
		compMove = compMove.toUpperCase();
		return compMove;
	}
	public String toString() {
		return getComputerMove();
	}
}
