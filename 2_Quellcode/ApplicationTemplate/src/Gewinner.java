import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	public Gewinner(Spieler spieler1, Spieler spieler2, String gewinnername) {

		JPanel panel = new JPanel(); //neuen Bereich erstellen
		JFrame frame = new JFrame(); // neues Fenster erstellen
		frame.setSize(600, 400); // Groesse des Fensters festlegen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // damit das Fenster geschlossen werden kann, wenn man auf das rote x klickt
		frame.setLocationRelativeTo(null); //Fenster zentrieren
		frame.setResizable(false); //damit man es nicht groesser oder kleiner machen kann
		frame.setTitle("Mühle"); //Fenster einen Titel geben
		frame.add(panel); //Bereich dem Fenster hinzufuegen
		
		panel.setLayout(null);
		
		JLabel lbgewonnen = new JLabel(gewinnername + " du hast gewonnen!",SwingConstants.CENTER);//neues Label erstellen
			if(gewinnername=="") {
				lbgewonnen.setText("Es gibt keinen Sieger!");
			}
		lbgewonnen.setBounds(0,80, 600, 45); // Groesse festlegen
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
						
		JButton newGame = new JButton ("Neues Spiel"); //neuen Button fuer die Gewinnstatistik erstellen
		newGame.setBounds(225, 300, 150, 45); // Groesse festlegen
		newGame.setVisible(true);
		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				@SuppressWarnings("unused")
				WelcomeScreen welcome = new WelcomeScreen();
			}
		});
		
		frame.add(newGame); //Button dem Panel hinzufuegen
	
		Draw draw = new Draw(); //Hintergrundbild Gras und Feuerwerk hinzufuegen
		draw.setVisible(true); //Hintergrundbild anzeigen
		frame.add(draw); //auf frame hinzufuegen
		
		panel = new JPanel();
		
		frame.setVisible(true); //erst am Ende sichtbar machen
	
	}
}
	

	
