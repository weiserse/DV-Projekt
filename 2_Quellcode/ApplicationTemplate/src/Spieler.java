import java.io.*;

public class Spieler {

	String spielerName;
	int numSteine;
	boolean darfSpringen;
	
	
	public Spieler(String name) 
	{
		spielerName= name;
		numSteine=9;	
		darfSpringen = false;
	}
	public String getSpielerName()
	{
		return spielerName;
	}

	public int getNumSteine()
	{
		return numSteine;
	}
	public void decNumSteine()
	{
		numSteine --;
	}
	public void setSpringen()
	{
		darfSpringen = true;
	}
	
}
