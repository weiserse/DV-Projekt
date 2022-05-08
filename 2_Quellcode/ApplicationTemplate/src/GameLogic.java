import javax.swing.JLabel;

/** class GameLogic contains all logic related components of the game.
 * 		1. the integer array "positions" with 24 entries which represents all 
 * 			possible positions where you can place a gaming piece.
 * 
 * 		2. the boolean variable "spieler1zug" which states whether it is player one's turn or not.
 * 			This is in order to determine whether an entry in positions will turn to a 1(player 1) or a 2(player 2).
 * 
 * @author Weiser
 *
 */
public class GameLogic {

	private int [] positions;
	private boolean spieler1zug;
	private int anzahlsteinegesetzt = 0;
	/**
	 * Constructs and initializes a game logic object with parameters positions[] and spieler1zug.
	 * positions is initialized with 24 entries all being equals 0.
	 * spieler1zug is by default initialized with true.
	 */
	public GameLogic() {
		spieler1zug = true;
		positions = new int[24];
		for (int i=0; i<24;i++) {
			positions[i]=0;
		}
	}
	
	/** set method for the positions[] array.
	 * depending on the player who is to make the next move passed entry will be changed.
	 * 
	 * @param x place in positions[] that is being replaced.
	 */
	 public void setPosition(int x) {
		 if (spieler1zug)
		 	{
			 positions[x] = 1;
		 	}
		 else
			 positions[x]=2;
	 }
	
	 /** get method for the positions[] array.
	  * 
	  * @return array positions[] representing all fields.
	  */
	 public int[] getPositions() {
		 return positions;
	 }
	 
	 /**get method returning a specific entry in positions.
	  * 
	  * @param x entry position that is to be returned
	  * @return entry in position[x], being either 0, 1 or 2
	  */
	 public int getPositions(int x) {
		 return positions[x];
	 }
	 
	 /**
	  * method to change which players' turn it is.
	  */
	 public void changeZug() {
		 if (spieler1zug)
		 {
			 spieler1zug = false;
			 anzahlsteinegesetzt = anzahlsteinegesetzt+1;
		 }
		 else if (spieler1zug == false)
			 spieler1zug = true;
	 }
	 
	 /**
	  * get method for the spieler1zug variable
	  * 
	  * @return boolean true if player 1 turn, false if player 2 turn.
	  */
	 public boolean getZug() {
		 return spieler1zug;
	 }
	 
	 public int getAnzahl() {
		 return anzahlsteinegesetzt;
	 }
	 
}
