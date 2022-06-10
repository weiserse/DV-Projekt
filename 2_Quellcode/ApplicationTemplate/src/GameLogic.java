import javax.swing.JLabel;


/** class GameLogic contains all logic related components of the game.
 * 		1. the integer array "positions" with 24 entries which represents all 
 * 			possible positions where you can place a gaming piece.
 * 
 * 		2. the boolean variable "spieler1zug" which states whether it is player one's turn or not.
 * 			This is in order to determine whether an entry in positions will turn to a 1(player 1) or a 2(player 2).
 *
 */
public class GameLogic {

	private int [] positions;
	private boolean spieler1zug;
	private int anzahlsteinegesetzt = 0;
	private boolean MuehleJaNein;
	private int i;
	private boolean meinStein; 
	private boolean SchiebenErlaubt;
	private boolean alleSteineGesetzt; 
	private boolean springenErlaubt;
	private int anzahlSteineSpieler1 = 0;
	private int anzahlSteineSpieler2 = 0;
	private boolean Gewonnen = false;


	
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
		 }
		 else if (spieler1zug == false) {
			 spieler1zug = true;
		 	 anzahlsteinegesetzt = anzahlsteinegesetzt+1;
		 }
	 }
	 
	 
	 /**
	  * method to identify which player's turn it is with output on the info panel
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
	  * get method for the number of stones a player has placed
	  * @return number of stones
	  */
	 public int getAnzahl() {
		 return anzahlsteinegesetzt;
	 }
	 
	 
	 /**
	  * Method to check if all 9 stones are set
	  * @return boolean true, if all stones are set
	  */
	 public boolean alleSteineGesetzt() {
		 if (anzahlsteinegesetzt >8) {
		 return alleSteineGesetzt = true;
		 }
		 else {
			 return alleSteineGesetzt = false;
		 }
	 }
	 
	 
	 /**
	  * method to check if the stone the player has clicked on is one of his own
	  * @return boolean true, if it's the players stone
	  * @param x place in positions[] the player clicked on
	  */
	 public boolean meinStein(int x) {
		 if ((spieler1zug==true && x==1) || (spieler1zug==false && x==2)) {
			 meinStein=true;
		 }
			 else {
				 meinStein = false;
			 }
			 return meinStein;
		 }

	 
	 /**
	  * method for checking a mill
	  * @return boolean true, if the player has set a mill
	  * @param x place in positions[] the player clicked on
	  */
	 public boolean pruefeMuehle (int x) {

		 if (spieler1zug==true) {
			 i=1;
		 }
			 else if(spieler1zug ==false) {
				 i=2;
		 }
		 
		 if ((x==0 || x==1 || x==2) && positions[0]==i && positions[1]==i && positions[2]==i) {
				 MuehleJaNein = true;
			 }
				
		 else if ((x==2 || x==3 || x==4) &&positions[2]==i && positions[3]==i && positions[4]==i ) {	
				 MuehleJaNein = true;
		 
		 }
		 else if ((x==4 || x==5 || x==6) && positions[4]==i && positions[5]==i && positions[6]==i ) {	
				 MuehleJaNein = true;
		 }
		 else  if ((x==6 || x==7 || x==0) && positions[6]==i && positions[7]==i && positions[0]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x==8 || x==9 || x==10) && positions[8]==i && positions[9]==i && positions[10]==i ){
				 MuehleJaNein = true;
		 }
		 else  if ((x==10 || x==11 || x==12) &&positions[10]==i && positions[11]==i && positions[12]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==12 || x==13 || x==14) &&positions[12]==i && positions[13]==i && positions[14]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==14 || x==15 || x==8) &&positions[14]==i && positions[15]==i && positions[8]==i ){
				 MuehleJaNein = true;
		 }
		 else if ((x==16 || x==17 || x==18) &&positions[16]==i && positions[17]==i && positions[18]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x==18 || x==19 || x==20) &&positions[18]==i && positions[19]==i && positions[20]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==20 || x==21 || x==22) && positions[20]==i && positions[21]==i && positions[22]==i){
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
	  * method to check if the stone a player wants to take is in an existing mill
	  *  @return boolean true, if the stone is in a mill
	  *  @param x place in positions[] the player clicked on
	  */
	 public boolean pruefeMuehlevorhanden (int x) {
		 if (spieler1zug==true) {
			 i=2;
		 }
			 else if(spieler1zug==false){
				 i=1;
		 }
		 
		 if ((x==0 || x==1 || x==2) && positions[0]==i && positions[1]==i && positions[2]==i) {
				 MuehleJaNein = true;
			 }
				
		 else if ((x==2 || x==3 || x==4) && positions[2]==i && positions[3]==i && positions[4]==i ) {	
				 MuehleJaNein = true;
		 
		 }
		 else if ((x==4 || x==5 || x==6) && positions[4]==i && positions[5]==i && positions[6]==i ) {	
				 MuehleJaNein = true;
		 }
		 else  if ((x==6 || x==7 || x==0) && positions[6]==i && positions[7]==i && positions[0]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x==8 || x==9 || x==10) && positions[8]==i && positions[9]==i && positions[10]==i ){
				 MuehleJaNein = true;
		 }
		 else  if ((x==10 | x==11 || x==12) &&positions[10]==i && positions[11]==i && positions[12]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==12 || x==13 || x==14) &&positions[12]==i && positions[13]==i && positions[14]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==14 || x==15 || x==8) &&positions[14]==i && positions[15]==i && positions[8]==i ){
				 MuehleJaNein = true;
		 }
		 else if ((x==16 || x==17 || x==18) &&positions[16]==i && positions[17]==i && positions[18]==i ) {
				 MuehleJaNein = true;
		 }
		 else if ((x==18 || x==19 || x==20) &&positions[18]==i && positions[19]==i && positions[20]==i) {
				 MuehleJaNein = true;
		 }
		 else if ((x==20 || x==21 || x==22) && positions[20]==i && positions[21]==i && positions[22]==i){
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
	  * method to take a stone from the other player
	  * @param x place in positions[] the player clicked on
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
	 
	 
	 /**
	  * method of taking ones's own stone
	  * @param x place in positions[] the player clicked on
	  */
	 public void eigenenSteinNehmen(int x) {
		
		 if (spieler1zug) {
			 i=1;
		 }
			 else {
				 i=2;
		 }
 
		 if (spieler1zug==true && positions[x] ==1)
		 	{
			 positions[x] = 0;
		 	}
		 else if(spieler1zug==false && positions[x] ==2)
		 {
			 positions[x] = 0;
		 	}
		 else {
			 GameScreen.info.setText("Wähle deinen eigenen Stein!");
		 }
		 
	 }
	 
	 
	 
	 /**
	  * method that specifies on which fields a stone can be moved
	  * @param x place in positions[] the player clicked on 
	  * @return boolean true, if the player is allowed to move to the clicked field
	  */
	 public boolean pruefeSchieben(int x) {
		 
		 if(x==0 && ((GameScreen.FeldZumSchieben ==1)|| (GameScreen.FeldZumSchieben ==7))) {
			 SchiebenErlaubt=true;
		 }
			 else if (x==1 && ((GameScreen.FeldZumSchieben ==0)|| (GameScreen.FeldZumSchieben ==9) || (GameScreen.FeldZumSchieben ==2))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==2 && ((GameScreen.FeldZumSchieben ==1)|| (GameScreen.FeldZumSchieben ==3))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==3 && ((GameScreen.FeldZumSchieben ==2)|| (GameScreen.FeldZumSchieben ==11) || (GameScreen.FeldZumSchieben ==4))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==4 && ((GameScreen.FeldZumSchieben ==3)|| (GameScreen.FeldZumSchieben ==5))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==5 && ((GameScreen.FeldZumSchieben ==4)|| (GameScreen.FeldZumSchieben ==6) || (GameScreen.FeldZumSchieben ==13))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==6 && ((GameScreen.FeldZumSchieben ==5)|| (GameScreen.FeldZumSchieben ==7))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==7 && ((GameScreen.FeldZumSchieben ==0)|| (GameScreen.FeldZumSchieben ==15) || (GameScreen.FeldZumSchieben ==6))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==8 && ((GameScreen.FeldZumSchieben ==9)|| (GameScreen.FeldZumSchieben ==15))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==9 && ((GameScreen.FeldZumSchieben ==1)|| (GameScreen.FeldZumSchieben ==8) || (GameScreen.FeldZumSchieben ==10) || (GameScreen.FeldZumSchieben ==17))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==10 && ((GameScreen.FeldZumSchieben ==9)|| (GameScreen.FeldZumSchieben ==11))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==11 && ((GameScreen.FeldZumSchieben ==3)|| (GameScreen.FeldZumSchieben ==10) || (GameScreen.FeldZumSchieben ==12) || (GameScreen.FeldZumSchieben ==19))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==12 && ((GameScreen.FeldZumSchieben ==11)|| (GameScreen.FeldZumSchieben ==13))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==13 && ((GameScreen.FeldZumSchieben ==5)|| (GameScreen.FeldZumSchieben ==12) || (GameScreen.FeldZumSchieben ==14) || (GameScreen.FeldZumSchieben ==21))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==14 && (GameScreen.FeldZumSchieben ==13)|| (GameScreen.FeldZumSchieben ==15)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==15 && ((GameScreen.FeldZumSchieben ==7)|| (GameScreen.FeldZumSchieben ==8) || (GameScreen.FeldZumSchieben ==14) || (GameScreen.FeldZumSchieben ==23))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==16 && ((GameScreen.FeldZumSchieben ==17)|| (GameScreen.FeldZumSchieben ==23))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==17 && ((GameScreen.FeldZumSchieben ==9)|| (GameScreen.FeldZumSchieben ==16) || (GameScreen.FeldZumSchieben ==18))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==18 && ((GameScreen.FeldZumSchieben ==17)|| (GameScreen.FeldZumSchieben ==19))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==19 && ((GameScreen.FeldZumSchieben ==18)|| (GameScreen.FeldZumSchieben ==20) || (GameScreen.FeldZumSchieben ==11))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==20 && ((GameScreen.FeldZumSchieben ==19)|| (GameScreen.FeldZumSchieben ==21))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==21 && ((GameScreen.FeldZumSchieben ==13)|| (GameScreen.FeldZumSchieben ==20) || (GameScreen.FeldZumSchieben ==22))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==22 && ((GameScreen.FeldZumSchieben ==21)|| (GameScreen.FeldZumSchieben ==23))) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==23 && ((GameScreen.FeldZumSchieben ==15)|| (GameScreen.FeldZumSchieben ==16) || (GameScreen.FeldZumSchieben ==22))) {
				 SchiebenErlaubt=true;
			 }
			 else {
				 SchiebenErlaubt=false;
			 }
		 
		 return SchiebenErlaubt;
			 
		 }
	 
	 /**
	  * method to increase the number of a player's stones by one
	  */
	 public void AnzahlSteineerhoehen() {
		 if (spieler1zug) {
			 anzahlSteineSpieler1 = anzahlSteineSpieler1 + 1;
		 }
		 else if(spieler1zug==false) {
			 anzahlSteineSpieler2 = anzahlSteineSpieler2 + 1;
		 }
	 }
	 
	 
	 /**
	  * method to decrease the number of a player's stones by one
	  */
	 public void AnzahlSteineerniedrigen() {
		 if (spieler1zug) {
			 anzahlSteineSpieler2 = anzahlSteineSpieler2 -1;
		 }
		 else if(spieler1zug==false){
			 anzahlSteineSpieler1 = anzahlSteineSpieler1 -1;
		 }
	 }
	 
	 
	 /**
	  * get method for the number of stones of a player
	  * @return the number of stones of the player
	  */
	 public int AnzahlSteineausgeben() {
		 if (spieler1zug) {
		 return anzahlSteineSpieler1;
		 }
		 else {
			 return anzahlSteineSpieler2;
		 }
	 }
	 
	 
	 /**
	  * method to check if a player is allowed to jump
	  * @return boolean true, if the player is allowed to jump
	  */
	 public boolean pruefeSpringen() {
		 if (spieler1zug==true) {
			 if (anzahlSteineSpieler1 <4) {
				 springenErlaubt = true;
		 }
			 else {
				 springenErlaubt = false;
			 }
		 }
		 else {
			 if (anzahlSteineSpieler2 <4) {
				 springenErlaubt = true;
		 }
			 else {
				 springenErlaubt = false;
			 }
	 }
		 return springenErlaubt;
	 }
	 
	 /**
	  * method to check, if a player has won
	  * @return boolean true, if the player has won
	  */
	 public boolean pruefeGewinnen() {

		 if (spieler1zug==true) {
			 if (anzahlSteineSpieler2 <3) {
				 Gewonnen = true;
		 }
			 else {
				 Gewonnen = false;
			 }
		 }
		 else {
			 if (anzahlSteineSpieler1 <3) {
				 Gewonnen = true;
		 }
			 else {
				 Gewonnen = false;
			 }
	 }
		 return Gewonnen;
	 }
	 
}
