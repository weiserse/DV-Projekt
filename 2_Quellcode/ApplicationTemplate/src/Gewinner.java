package pack1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gewinner{
	
	public Gewinner() {
		
		JPanel panel = new JPanel(); //neuen Bereich erstellen
		JFrame frame = new JFrame(); // neues Fenster erstellen
		frame.setSize(600, 600); // Gr��e des Fensters festlegen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // damit das Fenster geschlossen werden kann, wenn man auf das rote x klickt
		frame.setLocationRelativeTo(null); //Fenster zentrieren
		frame.setResizable(false); //damit man es nicht gr��er oder kleiner machen kann
		frame.setTitle("Gewinner"); //Fenster einen Titel geben
		frame.add(panel); //Bereich dem Fenster hinzuf�gen
		
		panel.setLayout(null);
		
		JLabel label = new JLabel("Du hast gewonnen!!"); //neues Label erstellen
		label.setBounds(300,120, 280, 45); // Gr��e festlegen
		label.setFont(label.getFont().deriveFont(25f)); //Schriftgr��e festlegen
		label.setVisible(true);
		frame.add(label); //Label dem Fenster hinzuf�gen 
		
		JLabel label2 = new JLabel("vs"); //neues Label erstellen
		label2.setBounds(250,50, 50, 45); // Gr��e festlegen
		label2.setFont(label2.getFont().deriveFont(20f)); //Schriftgr��e festlegen
		label2.setVisible(true);
		frame.add(label2); //Label dem Fenster hinzuf�gen 
		
		JLabel label3 = new JLabel("Spieler 1"); //neues Label erstellen
		label3.setBounds(100,50, 150, 45); // Gr��e festlegen
		label3.setFont(label3.getFont().deriveFont(20f)); //Schriftgr��e festlegen
		label3.setVisible(true);
		frame.add(label3); //Label dem Fenster hinzuf�gen 
		
		JLabel label4 = new JLabel("Spieler 2"); //neues Label erstellen
		label4.setBounds(350,50, 150, 45); // Gr��e festlegen
		label4.setFont(label4.getFont().deriveFont(20f)); //Schriftgr��e festlegen
		label4.setVisible(true);
		frame.add(label4); //Label dem Fenster hinzuf�gen 
		
		JLabel label5 = new JLabel("Spieler"); //neues Label erstellen
		label5.setBounds(100,120, 150, 45); // Gr��e festlegen
		label5.setFont(label5.getFont().deriveFont(20f)); //Schriftgr��e festlegen
		label5.setVisible(true);
		frame.add(label5); //Label dem Fenster hinzuf�gen 
		
		JButton button = new JButton ("Gewinnstatistik"); //neuen Button erstellen
		button.setBounds(225, 450, 150, 45); // Gr��e festlegen
		button.setVisible(true);
		frame.add(button); //Button dem Panel hinzuf�gen
	
		Draw draw = new Draw();
		draw.setBounds(0, 0, 600, 600);
		draw.setVisible(true);
		frame.add(draw);
		
		panel = new JPanel();
		
		frame.setVisible(true);
	
	}
}
	

	