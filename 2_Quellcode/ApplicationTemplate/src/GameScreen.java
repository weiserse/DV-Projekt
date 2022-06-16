import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * The Game Screen is the Screen the actual game is played on.
 * It contains the game field, as well as an info box giving further explanations to the players.
 * The player names entered in WelcomeScreen are being transfered to and displayed on this screen.
 * Furthermore, there each player side contains a label displaying the number of pieces left to be placed.
 */
public class GameScreen extends JFrame implements ActionListener{
 
//Properties
	private JPanel panel;
	public static JLabel info;
	private JLabel Player1;
	private JLabel Player2;
	private JLabel SteinCount1;
	private JLabel SteinCount2;
	private JLabel InfoSteinCount1;
	private JLabel InfoSteinCount2;
	static JButton newGame;
	private JFrame frame;
	private JButton shortcut;
	public boolean MuehleJaNein;
	static Spieler spieler1test;
	static Spieler spieler2test;
	public int feld;
	public boolean SteinNehmen= false;
	public boolean schieben = false;
	public boolean SteinNehmenFuerSetzen = true;
	public boolean SteinNehmenFuerSpringen = true;
	public static int FeldZumSchieben;
	public static int FeldZumSpringen;
	private Spielbrett spielbrett;


private int[] getCoordinates(int pos) {

	int[] posArr = new int[2];
	//int x, y;
	 switch(pos){
     case 0:
    	 posArr[0] = 290;
    	 posArr[1] = 170;
         break;
     case 1:
    	 posArr[0] = 470;
    	 posArr[1] = 170;
         break;
     case 2:
    	 posArr[0] = 650;
    	 posArr[1] = 170;
         break;
     case 3:
    	 posArr[0] = 650;
    	 posArr[1] = 350;
         break;
     case 4:
    	 posArr[0] = 650;
    	 posArr[1] = 530;
         break;
     case 5:
    	 posArr[0] = 470;
    	 posArr[1] = 530;
         break;

     case 6:
    	 posArr[0] = 290;
    	 posArr[1] = 530;
         break;
     case 7:
    	 posArr[0] = 290;
    	 posArr[1] = 350;
         break;
     case 8:
    	 posArr[0] = 350;
    	 posArr[1] = 230;
         break;
     case 9:
    	 posArr[0] = 470;
    	 posArr[1] = 230;
         break;
     case 10:
    	 posArr[0] = 590;
    	 posArr[1] = 230;
         break;
     case 11:
    	 posArr[0] = 590;
    	 posArr[1] = 350;
         break;
     case 12:
    	 posArr[0] = 590;
    	 posArr[1] = 470;
         break;
     case 13:
    	 posArr[0] = 470;
    	 posArr[1] = 470;
         break;
     case 14:
    	 posArr[0] = 350;
    	 posArr[1] = 470;
         break;
     case 15:
    	 posArr[0] = 350;
    	 posArr[1] = 350;
         break;
     case 16:
    	 posArr[0] = 410;
    	 posArr[1] = 290;
         break;
     case 17:
    	 posArr[0] = 470;
    	 posArr[1] = 290;
         break;
     case 18:
    	 posArr[0] = 530;
    	 posArr[1] = 290;
         break;
     case 19:
    	 posArr[0] = 530;
    	 posArr[1] = 350;
         break;
     case 20:
    	 posArr[0] = 530;
    	 posArr[1] = 410;
         break;
     case 21:
    	 posArr[0] = 470;
    	 posArr[1] = 410;
         break;
     case 22:
    	 posArr[0] = 410;
    	 posArr[1] = 410;
         break;
     case 23:
    	 posArr[0] = 410;
    	 posArr[1] = 350;
         break;

     default:
         System.out.println("i liegt nicht zwischen null und drei");
         break;
     }
	 return posArr;

}

/**
 * method to distinguish which field is being clicked based on a X and Y coordinate.
 * @param X x-coordinate 
 * @param Y y-coordinate
 * @return entry position in array 'positions'
 */
private int feldclicked(int X, int Y)
{
	if (330>X && X>300) {
		if (230>Y && Y>200) {
			return 0;
		}			
		else if (410>Y && Y> 380) {
			return 7;
		}
		else if (590>Y && Y>560) {
			return 6;
		}
	}
	else if(505>X && X>475) {
		if(230>Y && Y>200) {
			return 1;
		}
		else if(290>Y && Y>260) {
			return 9;
		}
		else if(350>Y && Y>320) {
			return 17;
		}
		else if(470>Y && Y>440) {
			return 21;
		}
		else if(530>Y && Y>500) {
			return 13;
		}
		else if(590>Y && Y>560) {
			return 5;
		}
	}
	else if(690>X && X>660) {
		if(230>Y && Y>200) {
			return 2;
		}
		else if(410>Y && Y>380) {
			return 3;
		}
		else if(590>Y && Y>560) {
			return 4;
		}
	}
	else if(390>X && X>360) {
		if(290>Y && Y>260) {
			return 8;
		}
		else if(415>Y && Y>385) {
			return 15;
		}
		else if(530>Y && Y>500) {
			return 14;
		}
	}
	else if(630>X && X> 600) {
		if(290>Y && Y>260) {
			return 10;
		}
		else if(410>Y && Y>380) {
			return 11;
		}
		else if(530>Y && Y> 500) {
			return 12;
		}
	}
	else if(565>X && X>535) {
		if(350>Y && Y>320) {
			return 18;
		}
		else if(410>Y && Y>380) {
			return 19;
		}
		else if(470>Y && Y> 430) {
			return 20;
		}
	}
	else if(445>X && X>415) {
		if(350>Y && Y> 320) {
			return 16;
		}
		else if(470>Y && Y> 430) {
			return 22;
		}
		else if(410>Y && Y> 380) {
			return 23;
		}
	}
	return -1;
};

/**
 * method to update the counter of pieces yet to be placed.
 * Each time a player sets a piece, their respective counter is reduced by 1.
 * @param WerAmZug boolean value depending on whether player one is to play or not.
 */
private void reduceSteinCounter(boolean WerAmZug) {
	if(WerAmZug==true) 
	{
		if (spieler1test.getNumSteine()>0)
		{
			spieler1test.decNumSteine();
			SteinCount1.setText(Integer.toString(spieler1test.getNumSteine()));
		}
//		else if(spieler1test.getNumSteine()==0)
//		{
//			InfoSteinCount1.setText("Verbleibende Spielsteine");
//			for 
//			SteinCount1.setText
//		}
	}
	else if(WerAmZug==false)
	{
		if (spieler2test.getNumSteine()>0)
		{
			spieler2test.decNumSteine();
			SteinCount2.setText(Integer.toString(spieler2test.getNumSteine()));
		}
	}
}

/**
 * Constructs and initializes the Game Screen with set attributes.
 * @param spieler1 Spieler object required for further usage and also the displayed names.
 * @param spieler2 Spieler object required for further usage and also the displayed names.
 */
	public GameScreen(Spieler spieler1, Spieler spieler2) {
		GameLogic logic = new GameLogic();
		spieler1test = spieler1;
		spieler2test = spieler2;
		frame = new JFrame();
		panel = new JPanel();
		info = new JLabel();
		Player1 = new JLabel(spieler1.getSpielerName());
		Player2 = new JLabel(spieler2.getSpielerName());
		SteinCount1 = new JLabel(Integer.toString(spieler1.getNumSteine()),SwingConstants.CENTER);
		SteinCount2 = new JLabel(Integer.toString(spieler2.getNumSteine()),SwingConstants.CENTER);
		InfoSteinCount1 = new JLabel("Zu setzende Steine",SwingConstants.CENTER);
		InfoSteinCount2 = new JLabel("Zu setzende Steine",SwingConstants.CENTER);
		newGame = new JButton("EndScreen");
		shortcut = new JButton();
		spielbrett = new Spielbrett(logic);
	

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 680);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Mühle");
		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

				//Steine zeichnen
				feld=feldclicked(e.getX(),e.getY());
				Color c;
		
				//wenn Feld ungueltig
				if (feld<0) {
					info.setText("Klicke auf ein gültiges Feld.");
				}
				
				//wenn Feld gueltig
				else { 
					int[] coordinates = getCoordinates(feld);
					if(logic.getZug() == true) {
						c = Color.BLACK;	
					}
					else {
						c = Color.WHITE;
					}


					//wenn man berechtigt ist einen Stein zu nehmen
					if (SteinNehmen ==true){
						MuehleJaNein = logic.pruefeMuehlevorhanden(feld); //pruefe, ob das angeklickte Feld in einer bestehenden Muehle vom Gegner ist
						
						//wenn das angeklickte Feld in einer bestehenden Muehle ist
						if (MuehleJaNein == true) {
							info.setText("Dieser Stein darf nicht genommen werden");
							SteinNehmen=true;
						}
						//wenn das angeklickte Feld nicht in einer bestehenden Muehle ist, darf der Stein genommen werden
						else {
						logic.steinNehmen(feld);
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
						SteinNehmen=false; 
						MuehleJaNein=false;
						logic.AnzahlSteineerniedrigen();
						logic.pruefeGewinnen();
							if (logic.pruefeGewinnen()==true && logic.alleSteineGesetzt()==true) 
							{
								if(logic.getZug()==true)
								{
									frame.dispose();
									Gewinner endscreen = new Gewinner(spieler1test, spieler2test, spieler1test.getSpielerName());
								}
								else if(logic.getZug()==false)
								{
									frame.dispose();
									Gewinner endscreen = new Gewinner(spieler1test, spieler2test, spieler2test.getSpielerName());
								}
							}
						logic.changeZug();
						logic.anDerReihe();
						}
					}
				//wenn man nicht berechtigt ist einen Stein zu nehmen
				else {
					boolean spielphasenwechsel= logic.alleSteineGesetzt();
					//wenn man in der Setzphase ist 
					if (spielphasenwechsel ==false) {
						//wenn das geklickte Feld frei ist
						if (logic.getPositions(feld)==0) {
						
						logic.setPosition(feld);
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
							System.out.println("");{
							}
							logic.AnzahlSteineerhoehen();
							MuehleJaNein = logic.pruefeMuehle(feld);
							reduceSteinCounter(logic.getZug());
					
							//wenn man keine Muehle hat
							if (MuehleJaNein ==false) {	
								logic.changeZug();
								logic.anDerReihe();
							}
							
							//wenn man eine Muehle hat
							else{
								info.setText("Du hast eine Mühle! Nimm einen Stein vom Gegner");
								SteinNehmen = true; 
							}	
						}
			// wenn das geklickte Feld besetzt ist
				else {
					info.setText("Klicke auf ein freies Feld.");
					}	
					}
					
			// wenn man nicht mehr in der Setzphase ist, also spielphasenwechsel == true
				else {
					
					//pruefen, ob man springen darf
					if(logic.pruefeSpringen()==true) {
						
					//pruefen, ob man den Stein zum Springen nimmt oder setzt
						if(SteinNehmenFuerSpringen==true) {
							
							boolean eigenerStein = logic.meinStein(logic.getPositions(feld));
							
							//wenn der angeklickte Stein der eigene ist
							if(eigenerStein == true) {
								logic.eigenenSteinNehmen(feld);;
								int[] paktuell = logic.getPositions();
								for (int i=0; i<24; i++)
								{
									System.out.print(paktuell[i]+ " ");
								}
								System.out.println("");
								SteinNehmenFuerSpringen=false;
								FeldZumSpringen = feld;
								info.setText("Setze den Stein auf ein freies Feld");
							}
							
							//wenn der angeklickte Stein nicht der eigene ist
							else {
								info.setText("Klicke einen deiner Steine an, um zu springen.");
							}
						}
					
					//SteinNehmenFuerSpringen==false
					else {
						if(logic.getPositions(feld)==0) {
							logic.setPosition(feld);
							int [] paktuell = logic.getPositions();
							for (int i=0; i<24; i++)
							{
								System.out.print(paktuell[i]+ " ");
							}
								System.out.println("");{
								}
							
							//pruefen, ob man jetzt eine Muehle hat
							MuehleJaNein = logic.pruefeMuehle(feld);
							
							//wenn man keine Muehle hat
							if (MuehleJaNein ==false) {	
								logic.changeZug();
								logic.anDerReihe();
							}
							
							//wenn man eine Muehle hat
							else{
								info.setText("Du hast eine Mühle! Nimm einen Stein vom Gegner");
								SteinNehmen = true; 
							}
							SteinNehmenFuerSpringen=true;

					}
						else {
							info.setText("Klicke auf ein freies Feld");
					}	
					}
					}
						
					// logic.pruefeSpringen==false;
					else {
						
					//wenn man einen Stein nimmt, um ihn auf ein anderes Feld zu schieben
					if(SteinNehmenFuerSetzen==true) {

						boolean eigenerStein = logic.meinStein(logic.getPositions(feld));
						
						//wenn der angeklickte Stein der eigene ist
						if (eigenerStein == true) {
							logic.eigenenSteinNehmen(feld);
							int [] paktuell = logic.getPositions();
							for (int i=0; i<24; i++)
							{
								System.out.print(paktuell[i]+ " ");
							}
							System.out.println("");{
							}
							SteinNehmenFuerSetzen = false;
							FeldZumSchieben = feld;
							info.setText("Setze den Stein auf ein benachbartes Feld");
						}
						
						//wenn der angeklickte Stein nicht der eigene ist
						else {
							info.setText("Klicke einen deiner Steine an.");
						}
						}
					
					//wenn man seinen genommenen Stein auf ein anderes Feld setzt
					else {
						
					//wenn das angeklickte Feld frei und benachbart ist
						boolean SchiebenErlaubt = logic.pruefeSchieben(feld);
						if (SchiebenErlaubt==true && logic.getPositions(feld)==0) {
							
							logic.setPosition(feld);
							int [] paktuell = logic.getPositions();
							for (int i=0; i<24; i++)
							{
								System.out.print(paktuell[i]+ " ");
							}
								System.out.println("");{
								}
								
							//pruefen, ob man jetzt eine Muehle hat
							MuehleJaNein = logic.pruefeMuehle(feld);
							
							//wenn man keine Muehle hat
							if (MuehleJaNein ==false) {	
								logic.changeZug();
								logic.anDerReihe();
							}
							
							//wenn man eine Muehle hat
							else{
								info.setText("Du hast eine Mühle! Nimm einen Stein vom Gegner");
								SteinNehmen = true; 
							}
							SteinNehmenFuerSetzen=true;
					}
						else {
							info.setText("Klicke auf ein freies benachbartes Feld");
						}
				}			
				}}}}}	
				
				
					
			
		

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		
		//panel.setBackground(new Color (60,179,113));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setOpaque(true);
		panel.add(info);
		panel.add(Player1);
		panel.add(Player2);
		panel.add(newGame);
		panel.add(shortcut);
		panel.add(SteinCount1);
		panel.add(SteinCount2);
		panel.add(InfoSteinCount1);
		panel.add(InfoSteinCount2);
		panel.add(spielbrett);
		
		spielbrett.setSize(1024,680);
		spielbrett.setLocation(0, 0);
		spielbrett.setVisible(true);
		spielbrett.setOpaque(true);
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
		
		info.setBounds(200, 85, 600, 25);
		info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		info.setBackground(Color.WHITE);
		info.setText(spieler1.getSpielerName() + " ist am Zug.");
		info.setVisible(true);
		info.setOpaque(true);
		
		SteinCount1.setBounds(240,125,30,30);
		SteinCount1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		SteinCount1.setBackground(Color.WHITE);
		SteinCount1.setVisible(true);
		SteinCount1.setOpaque(true);
		
		InfoSteinCount1.setBounds(110,125,125,30);
		InfoSteinCount1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		InfoSteinCount1.setBackground(Color.WHITE);
		InfoSteinCount1.setVisible(true);
		InfoSteinCount1.setOpaque(true);
		
		SteinCount2.setBounds(240,600,30,30);
		SteinCount2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		SteinCount2.setBackground(Color.WHITE);
		SteinCount2.setVisible(true);
		SteinCount2.setOpaque(true);
		
		InfoSteinCount2.setBounds(110,600,125,30);
		InfoSteinCount2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		InfoSteinCount2.setBackground(Color.WHITE);
		InfoSteinCount2.setVisible(true);
		InfoSteinCount2.setOpaque(true);
		
		Player1.setBounds(275, 125, 450, 30);
		Player1.setBackground(new Color (214,214,214));
		Player1.setVisible(true);
		Player1.setOpaque(true);

		Player2.setBounds(275, 600, 450, 30);
		Player2.setBackground(new Color (214,214,214));
		Player2.setVisible(true);
		Player2.setOpaque(true);
		
//Hintergrund festlegen
		Holz draw = new Holz();
		draw.setBounds(0,0,1024,680);
		draw.setVisible(true);
		panel.add(draw);
		
		frame.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		
		Gewinner endscreen = new Gewinner(spieler1test, spieler2test, "nobody");
		
	}
}