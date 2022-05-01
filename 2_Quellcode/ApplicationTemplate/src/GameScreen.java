import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GameScreen extends JFrame implements ActionListener{
   
private JPanel panel;
private JLabel info;
private JLabel Pl1;
private JLabel Pl2;
static JButton newGame;
private JFrame frame;
private JButton shortcut;
Spieler spieler1test;
Spieler spieler2test;
	public GameScreen(Spieler spieler1, Spieler spieler2) {
		spieler1test = spieler1;
		spieler2test = spieler2;
		//board = new Spielbrett();
		frame = new JFrame();
		panel = new JPanel();
		info = new JLabel();
		Pl1 = new JLabel(spieler1.getSpielerName());
		Pl2 = new JLabel(spieler2.getSpielerName());
		newGame = new JButton("EndScreen");
		shortcut = new JButton();
		
		frame.add(panel, BorderLayout.CENTER);
		//frame.add(board);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setSize(1024, 680);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Mühle");
			
		//panel.setBackground(new Color(60, 179, 113));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(null);
		//panel.setVisible(true);
		panel.setOpaque(true);;
		panel.add(info);
		panel.add(Pl1);
		panel.add(Pl2);
		panel.add(newGame);
		panel.add(shortcut);
		
		//board.setBounds(275, 130, 450, 450);
		//board.setVisible(true);
		
		newGame.setBounds(800, 25, 150, 25);
		newGame.setText("Neues Spiel");
		newGame.setVisible(true);

		shortcut.setBounds(800,350,120,35);
		shortcut.setText("EndScreen");
		shortcut.addActionListener(this);
		
	    
		//Buttons fuer Spielfeld festlegen
		
		//Button 0
		JButton feld_0 = new JButton (); 
		feld_0.setBounds(290, 170, 30, 30); 
		feld_0.setVisible(true);
		panel.add(feld_0); 
		
		//Button 1
		JButton feld_1 = new JButton (); 
		feld_1.setBounds(470, 170, 30, 30); 
		feld_1.setVisible(true);
		panel.add(feld_1); 
		
		//Button 2
		JButton feld_2 = new JButton (); 
		feld_2.setBounds(650, 170, 30, 30); 
		feld_2.setVisible(true);
		panel.add(feld_2); 
		
		//Button 3
		JButton feld_3 = new JButton (); 
		feld_3.setBounds(650, 350, 30, 30); 
		feld_3.setVisible(true);
		panel.add(feld_3); 
		
		//Button 4
		JButton feld_4 = new JButton (); 
		feld_4.setBounds(650, 530, 30, 30); 
		feld_4.setVisible(true);
		panel.add(feld_4); 
		
		//Button 5
		JButton feld_5 = new JButton (); 
		feld_5.setBounds(470, 530, 30, 30); 
		feld_5.setVisible(true);
		panel.add(feld_5); 
		
		//Button 6
		JButton feld_6 = new JButton (); 
		feld_6.setBounds(290, 530, 30, 30); 
		feld_6.setVisible(true);
		panel.add(feld_6); 
		
		//Button 7
		JButton feld_7 = new JButton (); 
		feld_7.setBounds(290, 350, 30, 30); 
		feld_7.setVisible(true);
		panel.add(feld_7); 
		
		//Button 8
		JButton feld_8 = new JButton (); 
		feld_8.setBounds(350, 230, 30, 30); 
		feld_8.setVisible(true);
		panel.add(feld_8); 
		
		//Button 9
		JButton feld_9 = new JButton (); 
		feld_9.setBounds(470, 230, 30, 30); 
		feld_9.setVisible(true);
		panel.add(feld_9); 
		
		//Button 10
		JButton feld_10 = new JButton (); 
		feld_10.setBounds(590, 230, 30, 30); 
		feld_10.setVisible(true);
		panel.add(feld_10); 
		
		//Button 11
		JButton feld_11 = new JButton (); 
		feld_11.setBounds(590, 350, 30, 30); 
		feld_11.setVisible(true);
		panel.add(feld_11); 
		
		//Button 12
		JButton feld_12 = new JButton (); 
		feld_12.setBounds(590, 470, 30, 30); 
		feld_12.setVisible(true);
		panel.add(feld_12); 
		
		//Button 13
		JButton feld_13 = new JButton ();
		feld_13.setBounds(470, 470, 30, 30); 
		feld_13.setVisible(true);
		panel.add(feld_13); 
		
		//Button 14
		JButton feld_14 = new JButton (); 
		feld_14.setBounds(350, 470, 30, 30); 
		feld_14.setVisible(true);
		panel.add(feld_14); 
		
		//Button 15
		JButton feld_15 = new JButton (); 
		feld_15.setBounds(350, 350, 30, 30); 
		feld_15.setVisible(true);
		panel.add(feld_15); 
		
		//Button 16
		JButton feld_16 = new JButton (); 
		feld_16.setBounds(410, 290, 30, 30); 
		feld_16.setVisible(true);
		panel.add(feld_16); 
		
		//Button 17
		JButton feld_17 = new JButton (); 
		feld_17.setBounds(470, 290, 30, 30); 
		feld_17.setVisible(true);
		panel.add(feld_17); 
		
		//Button 18
		JButton feld_18 = new JButton (); 
		feld_18.setBounds(530, 290, 30, 30); 
		feld_18.setVisible(true);
		panel.add(feld_18); 
		
		//Button 19
		JButton feld_19 = new JButton (); 
		feld_19.setBounds(530, 350, 30, 30); 
		feld_19.setVisible(true);
		panel.add(feld_19); 
		
		//Button 20
		JButton feld_20 = new JButton (); 
		feld_20.setBounds(530, 410, 30, 30); 
		feld_20.setVisible(true);
		panel.add(feld_20); 
		
		//Button 21
		JButton feld_21 = new JButton (); 
		feld_21.setBounds(470, 410, 30, 30); 
		feld_21.setVisible(true);
		panel.add(feld_21); 
		
		//Button 22
		JButton feld_22 = new JButton (); 
		feld_22.setBounds(410, 410, 30, 30); 
		feld_22.setVisible(true);
		panel.add(feld_22); 
		
		//Button 23
		JButton feld_23 = new JButton (); 
		feld_23.setBounds(410, 350, 30, 30); 
		feld_23.setVisible(true);
		panel.add(feld_23); 
		
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
		/*spielfeld draw2 = new spielfeld();
		draw2.setBounds(0,0,1024,680);
		draw2.setVisible(true);
		panel.add(draw2);*/
		
		//Hintergrund festlegen
		Gras draw = new Gras();
		draw.setBounds(0,0,1024,680);
		draw.setVisible(true);
		panel.add(draw);
				
		frame.setVisible(true);
		//panel.setVisible(true);
		//Gewinner endscreen = new Gewinner(spieler1, spieler2);

		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		
		Gewinner endscreen = new Gewinner(spieler1test, spieler2test);
		
	}
}