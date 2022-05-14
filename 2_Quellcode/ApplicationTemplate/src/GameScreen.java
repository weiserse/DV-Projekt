import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GameScreen extends JFrame implements ActionListener{
   
private JPanel panel;
private JPanel panel2;
private JLabel info;
private JLabel Pl1;
private JLabel Pl2;
static JButton newGame;
private JFrame frame;
private JButton shortcut;
private JPaintComponent millBoard;
Spieler spieler1test;
Spieler spieler2test;


	public GameScreen(Spieler spieler1, Spieler spieler2) {
		GameLogic logic = new GameLogic();
		spieler1test = spieler1;
		spieler2test = spieler2;
		//board = new Spielbrett();
		frame = new JFrame();
		panel = new JPanel();
		panel2 = new JPanel();
		info = new JLabel();
		Pl1 = new JLabel(spieler1.getSpielerName());
		Pl2 = new JLabel(spieler2.getSpielerName());
		newGame = new JButton("EndScreen");
		shortcut = new JButton();
		millBoard = new JPaintComponent();
		

	
				
		
		//frame.add(board);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setSize(1024, 680);
		frame.setLocationRelativeTo(null);
		frame.setTitle("M�hle");
		

		
		//panel.setBackground(new Color(60, 179, 113));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setOpaque(true);
		panel.add(info);
		panel.add(Pl1);
		panel.add(Pl2);
		panel.add(newGame);
		panel.add(shortcut);
		
		
		panel2.setSize(390, 390);
		panel2.setLocation(290, 170);
		panel2.setBackground(Color.YELLOW);	
		
		millBoard = drawMillBoard();

		panel.add(millBoard);
		//panel2.setVisible(true);
		panel2.setOpaque(true);
		panel.add(panel2);
		frame.add(panel, BorderLayout.CENTER);
		
		
		newGame.setBounds(800, 25, 150, 25);
		newGame.setText("Neues Spiel");
		newGame.setVisible(true);
		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				WelcomeScreen welcome = new WelcomeScreen();
			}
		});
		
		shortcut.setBounds(800,350,120,35);
		shortcut.setText("EndScreen");
		shortcut.addActionListener(this);
		
   
		//Buttons fuer Spielfeld festlegen
		
		//Button 0
		
		JButton feld_0 = new JButton (); 
		feld_0.setBounds(290, 170, 30, 30); 
		feld_0.setVisible(true);
		panel.add(feld_0); 
		feld_0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(0)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(0);
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						if (logic.pruefeMuehle() == true) {
							info.setText("Du hast eine Muehle! Nimm einen Stein vom Gegner.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
						logic.changeZug();
						
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 1
		JButton feld_1 = new JButton (); 
		feld_1.setBounds(470, 170, 30, 30); 
		feld_1.setVisible(true);
		panel.add(feld_1); 
		feld_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(1)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(1);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 2
		JButton feld_2 = new JButton (); 
		feld_2.setBounds(650, 170, 30, 30); 
		feld_2.setVisible(true);
		panel.add(feld_2); 
		feld_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(2)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(2);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 3
		JButton feld_3 = new JButton (); 
		feld_3.setBounds(650, 350, 30, 30); 
		feld_3.setVisible(true);
		panel.add(feld_3); 
		feld_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(3)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(3);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 4
		JButton feld_4 = new JButton (); 
		feld_4.setBounds(650, 530, 30, 30); 
		feld_4.setVisible(true);
		panel.add(feld_4); 
		feld_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(4)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(4);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 5
		JButton feld_5 = new JButton (); 
		feld_5.setBounds(470, 530, 30, 30); 
		feld_5.setVisible(true);
		panel.add(feld_5);
		feld_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(5)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(5);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 6
		JButton feld_6 = new JButton (); 
		feld_6.setBounds(290, 530, 30, 30); 
		feld_6.setVisible(true);
		panel.add(feld_6); 
		feld_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(6)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(6);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 7
		JButton feld_7 = new JButton (); 
		feld_7.setBounds(290, 350, 30, 30); 
		feld_7.setVisible(true);
		panel.add(feld_7); 
		feld_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(7)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(7);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 8
		JButton feld_8 = new JButton (); 
		feld_8.setBounds(350, 230, 30, 30); 
		feld_8.setVisible(true);
		panel.add(feld_8); 
		feld_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(8)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(8);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 9
		JButton feld_9 = new JButton (); 
		feld_9.setBounds(470, 230, 30, 30); 
		feld_9.setVisible(true);
		panel.add(feld_9); 
		feld_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(9)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(9);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 10
		JButton feld_10 = new JButton (); 
		feld_10.setBounds(590, 230, 30, 30); 
		feld_10.setVisible(true);
		panel.add(feld_10); 
		feld_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(10)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(10);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 11
		JButton feld_11 = new JButton (); 
		feld_11.setBounds(590, 350, 30, 30); 
		feld_11.setVisible(true);
		panel.add(feld_11); 
		feld_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(11)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(11);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 12
		JButton feld_12 = new JButton (); 
		feld_12.setBounds(590, 470, 30, 30); 
		feld_12.setVisible(true);
		panel.add(feld_12); 
		feld_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(12)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(12);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 13
		JButton feld_13 = new JButton ();
		feld_13.setBounds(470, 470, 30, 30); 
		feld_13.setVisible(true);
		panel.add(feld_13); 
		feld_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(13)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(13);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 14
		JButton feld_14 = new JButton (); 
		feld_14.setBounds(350, 470, 30, 30); 
		feld_14.setVisible(true);
		panel.add(feld_14); 
		feld_14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(14)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(14);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 15
		JButton feld_15 = new JButton (); 
		feld_15.setBounds(350, 350, 30, 30); 
		feld_15.setVisible(true);
		panel.add(feld_15); 
		feld_15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(15)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(15);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 16
		JButton feld_16 = new JButton (); 
		feld_16.setBounds(410, 290, 30, 30); 
		feld_16.setVisible(true);
		panel.add(feld_16); 
		feld_16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(16)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(16);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 17
		JButton feld_17 = new JButton (); 
		feld_17.setBounds(470, 290, 30, 30); 
		feld_17.setVisible(true);
		panel.add(feld_17); 
		feld_17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(17)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(17);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 18
		JButton feld_18 = new JButton (); 
		feld_18.setBounds(530, 290, 30, 30); 
		feld_18.setVisible(true);
		panel.add(feld_18);
		feld_18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(18)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(18);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 19
		JButton feld_19 = new JButton (); 
		feld_19.setBounds(530, 350, 30, 30); 
		feld_19.setVisible(true);
		panel.add(feld_19); 
		feld_19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(19)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(19);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 20
		JButton feld_20 = new JButton (); 
		feld_20.setBounds(530, 410, 30, 30); 
		feld_20.setVisible(true);
		panel.add(feld_20); 
		feld_20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(20)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(20);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 21
		JButton feld_21 = new JButton (); 
		feld_21.setBounds(470, 410, 30, 30); 
		feld_21.setVisible(true);
		panel.add(feld_21); 
		feld_21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(21)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(21);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 22
		JButton feld_22 = new JButton (); 
		feld_22.setBounds(410, 410, 30, 30); 
		feld_22.setVisible(true);
		panel.add(feld_22); 
		feld_22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(22)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(22);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		});
		
		//Button 23
		JButton feld_23 = new JButton (); 
		feld_23.setBounds(410, 350, 30, 30); 
		feld_23.setVisible(true);
		panel.add(feld_23); 
		feld_23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int anzahlsteinegesetzt;
				anzahlsteinegesetzt = logic.getAnzahl();
	
				if (logic.getPositions(23)==0)
				{
					if (anzahlsteinegesetzt <9) {

						logic.setPosition(23);
						logic.changeZug();
						if (logic.getZug()) 
						{
							info.setText(spieler1.getSpielerName() + " ist am Zug.");
						}
						else
						{
							info.setText(spieler2.getSpielerName() + " ist am Zug.");
						}
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
					}
					else 
						info.setText("Alle Steine gesetzt! Stein zum Schieben w�hlen.");
				}
				else
					info.setText("Ung�ltiger Spielzug!");
			}
		}); 

		
		info.setBounds(200, 85, 600, 25);
		info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		info.setBackground(Color.WHITE);
		info.setText(spieler1.getSpielerName() + " ist am Zug.");
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
	
	public JPaintComponent drawMillBoard()
	{
		JPaintComponent millBoardLines = new JPaintComponent();
		
		millBoardLines.setLocation(15,15);
		millBoardLines.setSize(1024, 680);
		//millBoardLines.JPaintComponent.setBackground(Color.WHITE);	
		millBoardLines.setVisible(true);
		millBoardLines.setOpaque(true);
		
		//Linien des Spielfeldes 
		
		//Linien horizintal
																//x1   y1   x2   y2				
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 290, 170, 650, 170));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 350, 230, 590, 230));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 410, 290, 530, 290));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 410, 410, 530, 410));	
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 350, 470, 590, 470));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 290, 530, 650, 530));
		
		//Halbe Verbindungslinien
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 290, 350, 410, 350));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 530, 350, 650, 350));
		
		//Linien vertikal
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 290, 170, 290, 530));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 350, 230, 350, 470));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 410, 290, 410, 410));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 530, 290, 530, 410));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 590, 230, 590, 470));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 650, 170, 650, 530));
		
		//Halbe Verbindungslinien
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 470, 170, 470, 290));
		millBoardLines.paintObj(new PaintableLine(Color.BLACK, 470, 410, 470, 530));
		
		return millBoardLines;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		
		Gewinner endscreen = new Gewinner(spieler1test, spieler2test);
		
	}
}