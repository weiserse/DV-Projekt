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
	private boolean meinStein; 
	private boolean SchiebenErlaubt;

	
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
	  * @return Anzahl der gesetzten Steine.
	  */
	 public int getAnzahl() {
		 return anzahlsteinegesetzt;
	 }
	 
	 
	 /**
	  * Methode zur Ueberpruefung, ob alle 9 Steine bereits gesetzt sind
	  * @return boolean true, wenn alle Steine gesetzt sind
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
	  * Methode, um zu pruefen, ob der angeklickte Stein einem selbst gehoert
	  * @return wenn der angeklikcte Stein einem selbst gehoert, Rueckgabe true, ansonsten Rueckgabe false
	  * @param x Position im Array auf welche man geklickt hat
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
	  * Methode zur Ueberpruefung einer Muehle
	  * @return boolean true, wenn es eine Muehle gibt, false, wenn es keine Muehle gibt.
	  * @param x Position im Array auf welche man geklickt hat
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
	  * Methode, die angibt, ob der Stein in einer bestehenden Muehle liegt
	  *  @return boolean true, wenn er in einer Muehle liegt, false, wenn er nicht in einer Muhele liegt
	  *  @param x Position im Array auf welche man geklickt hat
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
	  * Methode, um einen Stein vom Gegner zu nehmen
	  * @param x Position im Array auf welche man geklickt hat, diese soll auf 0 gesetzt werden
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
	  * Methode, um einen eigenen Stein zu nehmen, um ihn wo anders wieder zu setzen 
	  * @param x Position im Array auf welche man geklickt hat, diese soll auf 0 gesetzt werden
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
	  * Methode, die angibt, zu welchen Feldern man einen Stein verschieben darf
	  * @param x Position im Array auf welche man geklickt hat 
	  * @return true, wenn man auf das Feld schieben darf
	  */
	 public boolean pruefeSchieben(int x) {
		 
		 if(x==0 && (GameScreen.FeldZumSchieben ==1)|| (GameScreen.FeldZumSchieben ==7)) {
			 SchiebenErlaubt=true;
		 }
			 else if (x==1 && (GameScreen.FeldZumSchieben ==0)|| (GameScreen.FeldZumSchieben ==9) || (GameScreen.FeldZumSchieben ==2)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==2 && (GameScreen.FeldZumSchieben ==1)|| (GameScreen.FeldZumSchieben ==3)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==3 && (GameScreen.FeldZumSchieben ==2)|| (GameScreen.FeldZumSchieben ==11) || (GameScreen.FeldZumSchieben ==4)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==4 && (GameScreen.FeldZumSchieben ==3)|| (GameScreen.FeldZumSchieben ==5)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==5 && (GameScreen.FeldZumSchieben ==4)|| (GameScreen.FeldZumSchieben ==6) || (GameScreen.FeldZumSchieben ==13)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==6 && (GameScreen.FeldZumSchieben ==5)|| (GameScreen.FeldZumSchieben ==7)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==7 && (GameScreen.FeldZumSchieben ==0)|| (GameScreen.FeldZumSchieben ==15) || (GameScreen.FeldZumSchieben ==6)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==8 && (GameScreen.FeldZumSchieben ==9)|| (GameScreen.FeldZumSchieben ==15)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==9 && (GameScreen.FeldZumSchieben ==1)|| (GameScreen.FeldZumSchieben ==8) || (GameScreen.FeldZumSchieben ==10) || (GameScreen.FeldZumSchieben ==17)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==10 && (GameScreen.FeldZumSchieben ==9)|| (GameScreen.FeldZumSchieben ==11)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==11 && (GameScreen.FeldZumSchieben ==3)|| (GameScreen.FeldZumSchieben ==10) || (GameScreen.FeldZumSchieben ==12) || (GameScreen.FeldZumSchieben ==19)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==12 && (GameScreen.FeldZumSchieben ==11)|| (GameScreen.FeldZumSchieben ==13)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==13 && (GameScreen.FeldZumSchieben ==5)|| (GameScreen.FeldZumSchieben ==12) || (GameScreen.FeldZumSchieben ==14) || (GameScreen.FeldZumSchieben ==21)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==14 && (GameScreen.FeldZumSchieben ==13)|| (GameScreen.FeldZumSchieben ==15)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==15 && (GameScreen.FeldZumSchieben ==7)|| (GameScreen.FeldZumSchieben ==8) || (GameScreen.FeldZumSchieben ==14) || (GameScreen.FeldZumSchieben ==23)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==16 && (GameScreen.FeldZumSchieben ==17)|| (GameScreen.FeldZumSchieben ==23)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==17 && (GameScreen.FeldZumSchieben ==9)|| (GameScreen.FeldZumSchieben ==16) || (GameScreen.FeldZumSchieben ==18)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==18 && (GameScreen.FeldZumSchieben ==17)|| (GameScreen.FeldZumSchieben ==19)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==19 && (GameScreen.FeldZumSchieben ==18)|| (GameScreen.FeldZumSchieben ==20) || (GameScreen.FeldZumSchieben ==11)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==20 && (GameScreen.FeldZumSchieben ==19)|| (GameScreen.FeldZumSchieben ==21)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==21 && (GameScreen.FeldZumSchieben ==13)|| (GameScreen.FeldZumSchieben ==20) || (GameScreen.FeldZumSchieben ==22)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==22 && (GameScreen.FeldZumSchieben ==21)|| (GameScreen.FeldZumSchieben ==23)) {
				 SchiebenErlaubt=true;
			 }
			 else if (x==23 && (GameScreen.FeldZumSchieben ==15)|| (GameScreen.FeldZumSchieben ==16) || (GameScreen.FeldZumSchieben ==22)) {
				 SchiebenErlaubt=true;
			 }
			 else {
				 SchiebenErlaubt=false;
			 }
		 
		 return SchiebenErlaubt;
			 
		 }
	 
}
