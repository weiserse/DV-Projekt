import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The Game Screen is the Screen the actual game is played on. It contains the game field,
 * as well as an info box giving further explanations to the players.
 * The player names entered in WelcomeScreen are being transfered to and displayed on this screen.
 *  
 * @author Weiser
 *
 */
public class GameScreen extends JFrame implements ActionListener{
   
private JPanel panel;
private JLabel info;
private JLabel Pl1;
private JLabel Pl2;
static JButton newGame;
private JFrame frame;
private JButton shortcut;

/**
 * Constructs and initializes the game screen with set parameters.
 */
	public GameScreen () {
		//Initialisierungen
		frame = new JFrame();
		panel = new JPanel();
		info = new JLabel();
		Pl1 = new JLabel();
		Pl2 = new JLabel();
		newGame = new JButton("EndScreen");
		shortcut = new JButton();
		
		//frame settings
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 680);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Mühle");
		
		//Panel settings
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(null);
		panel.setOpaque(true);;
		panel.add(info);
		panel.add(Pl1);
		panel.add(Pl2);
		panel.add(newGame);
		panel.add(shortcut);
		
		//Button settings
		newGame.setBounds(800, 25, 150, 25);
		newGame.setText("Neues Spiel");
		newGame.setVisible(true);

		shortcut.setBounds(800,350,120,35);
		shortcut.setText("EndScreen");
		shortcut.addActionListener(this);
		
		//Label settings
		info.setBounds(200, 85, 600, 25);
		info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		info.setBackground(Color.WHITE);
		info.setText("Hier steht eine Info!");
		info.setVisible(true);
		info.setOpaque(true);
		
		Pl1.setBounds(275, 125, 450, 30);
		Pl1.setBackground(Color.orange);
		Pl1.setVisible(true);
		Pl1.setOpaque(true);

		Pl2.setBounds(275, 600, 450, 30);
		Pl2.setBackground(Color.orange);
		Pl2.setVisible(true);
		Pl2.setOpaque(true);
		
		//Spielfeld anzeigen
		spielfeld draw2 = new spielfeld();
		draw2.setBounds(0,0,1024,680);
		draw2.setVisible(true);
		panel.add(draw2);
		
		//Hintergrund festlegen
		Gras draw = new Gras();
		draw.setBounds(0,0,1024,680);
		draw.setVisible(true);
		panel.add(draw);
				
		frame.setVisible(true);
		//panel.setVisible(true);		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		Gewinner endscreen = new Gewinner();
		
	}
}