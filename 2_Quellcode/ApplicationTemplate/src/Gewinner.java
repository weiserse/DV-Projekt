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
	
	public Gewinner(Spieler spieler1, Spieler spieler2) {

		JPanel panel = new JPanel(); //neuen Bereich erstellen
		JFrame frame = new JFrame(); // neues Fenster erstellen
		frame.setSize(600, 400); // Größe des Fensters festlegen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // damit das Fenster geschlossen werden kann, wenn man auf das rote x klickt
		frame.setLocationRelativeTo(null); //Fenster zentrieren
		frame.setResizable(false); //damit man es nicht größer oder kleiner machen kann
		frame.setTitle("Gewinner"); //Fenster einen Titel geben
		frame.add(panel); //Bereich dem Fenster hinzufügen
		
		panel.setLayout(null);
		
		JLabel label = new JLabel("Du hast gewonnen!"); //neues Label erstellen
		label.setBounds(300,80, 280, 45); // Größe festlegen
		label.setFont(label.getFont().deriveFont(28f)); //Schriftgröße festlegen
		label.setForeground(Color.WHITE);
		label.setVisible(true);
		frame.add(label); //Label dem Fenster hinzufügen 
		
		JLabel label2 = new JLabel(spieler1.getSpielerName() + "  vs  " + spieler2.getSpielerName(), SwingConstants.CENTER); //neues Label erstellen
		label2.setBounds(00, 30, 600, 45); // Größe festlegen
		label2.setFont(label2.getFont().deriveFont(25f)); //Schriftgröße festlegen
		label2.setForeground(Color.WHITE);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setVisible(true);
		frame.add(label2); //Label dem Fenster hinzufügen 
				
		JLabel label5 = new JLabel("Spieler"); //neues Label erstellen
		label5.setBounds(100,80, 150, 45); // Größe festlegen
		label5.setFont(label5.getFont().deriveFont(25f)); //Schriftgröße festlegen
		label5.setForeground(Color.WHITE);
		label5.setVisible(true);
		frame.add(label5); //Label dem Fenster hinzufügen 
		
		JButton button = new JButton ("Gewinnstatistik"); //neuen Button erstellen
		button.setBounds(225, 300, 150, 45); // Größe festlegen
		button.setVisible(true);
		frame.add(button); //Button dem Panel hinzufügen
	
		Draw draw = new Draw();
		draw.setVisible(true);
		frame.add(draw);
		
		panel = new JPanel();
		
		frame.setVisible(true);
	
	}
}
	

	
