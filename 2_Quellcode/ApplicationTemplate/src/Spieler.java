import java.io.*;

/**
 * Class Spieler represents each of the two playing parties 
 * with respective properties like name and remaining pieces.
 *
 */
public class Spieler {

	String spielerName;
	int numSteine;
	boolean darfSpringen;
	
	/**
	 * Constructs and initializes class Spieler with set attributes and passed value "name".
	 * @param name player name to be displayed
	 */	
	public Spieler(String name) 
	{
		spielerName= name;
		numSteine=9;	
		darfSpringen = false;
	}
	
	/**
	 * Get-Method for player name
	 * @return String variable name
	 */
	public String getSpielerName()
	{
		return spielerName;
	}

	/**
	 * Get-Method for number of remaining pieces to be placed
	 * @return int number of pieces to be placed
	 */
	public int getNumSteine()
	{
		return numSteine;
	}
	
	/**
	 * Method for decreasing numSteine by 1
	 */
	public void decNumSteine()
	{
		numSteine --;
	}
	
	/**
	 * Set-Method for bool darfSpringen
	 */
	public void setSpringen()
	{
		darfSpringen = true;
	}
	
}
