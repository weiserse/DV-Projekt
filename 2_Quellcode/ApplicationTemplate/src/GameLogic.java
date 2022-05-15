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
	private boolean MuehleJaNein;
	private int i;
	private int steinNehmen; 
	private boolean alleSteineGesetzt;

	
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
	  * Methode, um zu erkennen, welcher Spieler an der Reihe ist
	  */
	 public void anDerReihe() {
		 if (spieler1zug == true) {
				GameScreen.info.setText(GameScreen.spieler1test.getSpielerName() + " ist am Zug.");
				}
				else
				{
				GameScreen.info.setText(GameScreen.spieler2test.getSpielerName() + " ist am Zug.");
				}
		 }
	 
	 /**
	  * get method for the spieler1zug variable
	  * 
	  * @return boolean true if player 1 turn, false if player 2 turn.
	  */
	 public boolean getZug() {
		 return spieler1zug;
	 }
	 
	 /**
	  * get Methode fuer die Anzahl der Steine, die gesetzt wurden
	  * 
	  * @return Anzahl der gesetzten Steine.
	  */
	 public int getAnzahl() {
		 return anzahlsteinegesetzt;
	 }
	 
	 
	 /**
	  * Methode zur Ueberpruefung, ob alle 9 Steine bereits gesetzt sind
	  * 
	  * @return boolean true, wenn alle Steine gesetzt sind
	  */
	 
	 public boolean alleSteineGesetzt() {
		 if (anzahlsteinegesetzt >9) {
				GameScreen.info.setText("Alle Steine gesetzt! Stein zum Schieben wählen.");
		 return alleSteineGesetzt = true;
		 }
		 else {
			 return alleSteineGesetzt = false;
		 }
	 }
	 
	 /**
	  * Methode zur Ueberpruefung einer Muehle
	  * 
	  * @return boolean true, wenn es eine Muehle gibt, false, wenn es keine Muehle gibt.
	  */
	 
	 public boolean pruefeMuehle (int x) {
		 System.out.println(x);
		 if (spieler1zug==true) {
			 i=1;
		 }
			 else if(spieler1zug ==false) {
				 i=2;
		 }
		 
		 if ((x==0 || x==1 || x==2) && positions[0]==i && positions[1]==i && positions[2]==i) {
				 MuehleJaNein = true;
			 }
				
		 else if ((x<=2 && x<=4) &&positions[2]==i && positions[3]==i && positions[4]==i ) {	
				 MuehleJaNein = true;
		 
		 }
		 else if ((x<=4 && x<=6) && positions[4]==i && positions[5]==i && positions[6]==i ) {	
				 MuehleJaNein = true;
		 }
		 else  if ((x==6 || x==7 || x==0) && positions[6]==i && positions[7]==i && positions[0]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=8 && x<=10) && positions[8]==i && positions[9]==i && positions[10]==i ){
				 MuehleJaNein = true;
		 }
		 else  if ((x<=10 && x<=12) &&positions[10]==i && positions[11]==i && positions[12]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=12 && x<=14) &&positions[12]==i && positions[13]==i && positions[14]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==14 || x==15 || x==8) &&positions[14]==i && positions[15]==i && positions[8]==i ){
				 MuehleJaNein = true;
		 }
		 else if ((x<=16 && x<=18) &&positions[16]==i && positions[17]==i && positions[18]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=18 && x<=20) &&positions[18]==i && positions[19]==i && positions[20]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=20 && x<=22) && positions[20]==i && positions[21]==i && positions[22]==i){
				 MuehleJaNein = true;
		 }
		 else if ((x==22 || x==23 || x==16) && positions[22]==i && positions[23]==i && positions[16]==i) {	
				 MuehleJaNein = true;
		 }
		 else if ((x==1 || x==9 || x==17) &&positions[1]==i && positions[9]==i && positions[17]==i ){
				 MuehleJaNein = true;
		 }
		 else if ((x==3 || x==11 || x==19) &&positions[3]==i && positions[11]==i && positions[19]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==5 || x==13 || x==21) &&positions[5]==i && positions[13]==i && positions[21]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==7 || x==15 || x==23) &&positions[7]==i && positions[15]==i && positions[23]==i) {	
				 MuehleJaNein = true;
		 }
		 else {
			 MuehleJaNein=false;
		 }
		 
		
		 return MuehleJaNein;
	 }
	 
	 
	 
	 public boolean pruefeMuehlevorhanden (int x) {
		 System.out.println(x);
		 if (spieler1zug) {
			 i=2;
		 }
			 else {
				 i=1;
		 }
		 
		 if ((x==0 || x==1 || x==2) && positions[0]==i && positions[1]==i && positions[2]==i) {
				 MuehleJaNein = true;
			 }
				
		 else if ((x<=2 && x<=4) &&positions[2]==i && positions[3]==i && positions[4]==i ) {	
				 MuehleJaNein = true;
		 
		 }
		 else if ((x<=4 && x<=6) && positions[4]==i && positions[5]==i && positions[6]==i ) {	
				 MuehleJaNein = true;
		 }
		 else  if ((x==6 || x==7 || x==0) && positions[6]==i && positions[7]==i && positions[0]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=8 && x<=10) && positions[8]==i && positions[9]==i && positions[10]==i ){
				 MuehleJaNein = true;
		 }
		 else  if ((x<=10 && x<=12) &&positions[10]==i && positions[11]==i && positions[12]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=12 && x<=14) &&positions[12]==i && positions[13]==i && positions[14]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==14 || x==15 || x==8) &&positions[14]==i && positions[15]==i && positions[8]==i ){
				 MuehleJaNein = true;
		 }
		 else if ((x<=16 && x<=18) &&positions[16]==i && positions[17]==i && positions[18]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=18 && x<=20) &&positions[18]==i && positions[19]==i && positions[20]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x<=20 && x<=22) && positions[20]==i && positions[21]==i && positions[22]==i){
				 MuehleJaNein = true;
		 }
		 else if ((x==22 || x==23 || x==16) && positions[22]==i && positions[23]==i && positions[16]==i) {	
				 MuehleJaNein = true;
		 }
		 else if ((x==1 || x==9 || x==17) &&positions[1]==i && positions[9]==i && positions[17]==i ){
				 MuehleJaNein = true;
		 }
		 else if ((x==3 || x==11 || x==19) &&positions[3]==i && positions[11]==i && positions[19]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==5 || x==13 || x==21) &&positions[5]==i && positions[13]==i && positions[21]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==7 || x==15 || x==23) &&positions[7]==i && positions[15]==i && positions[23]==i) {	
				 MuehleJaNein = true;
		 }
		 else {
			 MuehleJaNein=false;
		 }
		 
		
		 return MuehleJaNein;
	 }
	 /**
	  * Methode, um einen Stein zu nehmen
	  */
	 
	 
	 public void steinNehmen(int x) {
		
		 if (spieler1zug) {
			 i=1;
		 }
			 else {
				 i=2;
		 }

		 
		 
		 if (spieler1zug==true && positions[x] ==2)
		 	{
			 positions[x] = 0;
		 	}
		 else if(spieler1zug==false && positions[x] ==1)
		 {
			 positions[x] = 0;
		 	}
		 else {
			 GameScreen.info.setText("Wähle einen Stein vom Gegner!");
		 }
		 
	 }
	 
}
