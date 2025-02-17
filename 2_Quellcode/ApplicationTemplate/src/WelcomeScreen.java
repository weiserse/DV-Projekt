import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * WelcomeScreen is the first screen the user gets to see when opening the program.
 * It offers options to enter the player names and start the game.
 * 
 * @author Weiser
 *
 */
public class WelcomeScreen implements ActionListener{
	
	Spieler spieler1;
	Spieler spieler2;
	private JFrame frame;
	private JLabel headlabel;
	private JPanel panel;
	private JButton start;
	private JTextField text1;
	private JTextField text2;
	
	/**
	 * Constructs and initializes the Welcome Screen with set attributes.
	 */
	public WelcomeScreen() {
		
	//Initialisierungen
	frame = new JFrame();
	headlabel = new JLabel("M�hle - Der Spieleklassiker");
	JLabel labelP1 = new JLabel("Name Spieler 1:");
	JLabel labelP2 = new JLabel("Name Spieler 2:");
	panel = new JPanel();
	start = new JButton("Start");
	text1 = new JTextField("Player 1");
	text2 = new JTextField("Player 2");
	
	//FrameSettings
	frame.add(panel, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("M�hle");
	frame.setSize(600, 400);
	frame.setLocationRelativeTo(null);
	
	//PanelSettings	
	panel.add(headlabel, BorderLayout.NORTH);
	panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
	panel.setLayout(null);
	panel.add(text1);
	panel.add(text2);
	panel.add(start);
	panel.add(labelP1);
	panel.add(labelP2);
	
	//TextfieldSettings
	text1.setBounds(180, 125, 75, 25);
	text1.setVisible(true);
	text2.setBounds(180,175, 75, 25);
	text2.setVisible(true);
	
	//LabelSettings
	headlabel.setBounds(95, 15, 500, 100);
	headlabel.setFont(new Font("Arial",Font.BOLD,30));
	headlabel.setForeground(Color.WHITE);
	labelP1.setBounds(25, 125, 200, 25);
	labelP1.setForeground(Color.WHITE);
	labelP1.setFont(new Font("Arial",Font.BOLD,20));
	labelP2.setBounds(25, 175, 200, 25);
	labelP2.setForeground(Color.WHITE);
	labelP2.setFont(new Font("Arial",Font.BOLD,20));
	
	//ButtonSettings
	start.setBounds(300, 200, 80, 25);
	start.addActionListener(this);
	
	//Hintergrund festlegen
	Holz draw = new Holz();
	draw.setBounds(0,0,600,400);
	draw.setVisible(true);
	panel.add(draw);
		
	//ans Ende setzen
	frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		spieler1=new Spieler(text1.getText());
		spieler2 = new Spieler(text2.getText());
		frame.dispose();
		GameScreen gamescreen = new GameScreen(spieler1, spieler2);
	}
}
