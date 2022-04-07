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

public class WelcomeScreen implements ActionListener{
	
	private JFrame frame;
	private JLabel headlabel;
	private JPanel panel;
	private JButton start;
	private JTextField text1;
	private JTextField text2;
	public WelcomeScreen() {
		
	//Initialisierungen
	frame = new JFrame();
	headlabel = new JLabel("Mühle - Der Spieleklassiker");
	JLabel labelP1 = new JLabel("Name Spieler 1:");
	JLabel labelP2 = new JLabel("Name Spieler 2:");
	panel = new JPanel();
	start = new JButton("Start");
	text1 = new JTextField("Player 1");
	text2 = new JTextField("Player 2");
	
	//FrameSettings
	frame.add(panel, BorderLayout.CENTER);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("BMG-Best Mill Game");
	frame.pack();
	frame.setLocation(600,200);
	frame.setSize(500, 300);
	frame.setVisible(true);
	
	//PanelSettings	
	panel.add(headlabel, BorderLayout.NORTH);
	panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
	panel.setLayout(null);
	panel.add(text1);
	panel.add(text2);
	panel.add(start);
	panel.setBackground(Color.CYAN);
	panel.add(labelP1);
	panel.add(labelP2);
	
	//TextfieldSettings
	text1.setBounds(125, 125, 75, 25);
	text1.setVisible(true);
	text2.setBounds(125,175, 75, 25);
	text2.setVisible(true);
	
	//LabelSettings
	headlabel.setBounds(55, 15, 500, 100);
	headlabel.setFont(new Font("Arial",Font.BOLD,30));
	labelP1.setBounds(25, 125, 125, 25);
	labelP2.setBounds(25, 175, 125, 25);
	
	//ButtonSettings
	start.setBounds(300, 200, 80, 25);
	start.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// new Spielfeld()
		
	}
}
