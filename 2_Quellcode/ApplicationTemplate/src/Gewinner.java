import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Gewinner is the screen being displayed after the game has been finished and a winner has been established.
 * A picture of a firework is shown saying "Du hast gewonnen!".
 * A button is leading to the winning statistics screen.
 * @author Peukert
 *
 */
public class Gewinner{
	
	/**
	 * Constructs and initializes GewinnerScreen with set attributes and passed names
	 * @param spieler1 spieler object for displayed name
	 * @param spieler2 spieler object for displayed name
	 */
	public Gewinner(Spieler spieler1, Spieler spieler2) {

		JPanel panel = new JPanel(); //neuen Bereich erstellen
		JFrame frame = new JFrame(); // neues Fenster erstellen
		frame.setSize(600, 400); // Groesse des Fensters festlegen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // damit das Fenster geschlossen werden kann, wenn man auf das rote x klickt
		frame.setLocationRelativeTo(null); //Fenster zentrieren
		frame.setResizable(false); //damit man es nicht groesser oder kleiner machen kann
		frame.setTitle("Gewinner"); //Fenster einen Titel geben
		frame.add(panel); //Bereich dem Fenster hinzufuegen
		
		panel.setLayout(null);
		
		JLabel lbgewonnen = new JLabel("Du hast gewonnen!"); //neues Label erstellen
		lbgewonnen.setBounds(300,80, 280, 45); // Groesse festlegen
		lbgewonnen.setFont(lbgewonnen.getFont().deriveFont(28f)); //Schriftgroesse festlegen
		lbgewonnen.setForeground(Color.WHITE);
		lbgewonnen.setVisible(true);
		frame.add(lbgewonnen); //Label dem Fenster hinzufuegen 
		
		JLabel lbspielernamen = new JLabel(spieler1.getSpielerName() + "  vs  " + spieler2.getSpielerName(), SwingConstants.CENTER); //neues Label erstellen
		lbspielernamen.setBounds(00, 30, 600, 45); // Groesse festlegen
		lbspielernamen.setFont(lbspielernamen.getFont().deriveFont(25f)); //Schriftgroesse festlegen
		lbspielernamen.setForeground(Color.WHITE);
		lbspielernamen.setHorizontalAlignment(SwingConstants.CENTER);
		lbspielernamen.setVisible(true);
		frame.add(lbspielernamen); //Label dem Fenster hinzufuegen 
				
		JLabel lbgewinnername = new JLabel("Spieler"); //neues Label erstellen
		lbgewinnername.setBounds(100,80, 150, 45); // Groesse festlegen
		lbgewinnername.setFont(lbgewinnername.getFont().deriveFont(25f)); //Schriftgroesse festlegen
		lbgewinnername.setForeground(Color.WHITE);
		lbgewinnername.setVisible(true);
		frame.add(lbgewinnername); //Label dem Fenster hinzufuegen 
		
		JButton btnstatistik = new JButton ("Gewinnstatistik"); //neuen Button fuer die Gewinnstatistik erstellen
		btnstatistik.setBounds(225, 300, 150, 45); // Groesse festlegen
		btnstatistik.setVisible(true);
		frame.add(btnstatistik); //Button dem Panel hinzufuegen
	
		Draw draw = new Draw(); //Hintergrundbild Gras und Feuerwerk hinzufuegen
		draw.setVisible(true); //Hintergrundbild anzeigen
		frame.add(draw); //auf frame hinzufuegen
		
		panel = new JPanel();
		
		frame.setVisible(true); //erst am Ende sichtbar machen
	
	}
}
	

	
