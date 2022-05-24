import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GameScreen extends JFrame implements ActionListener{
   
private JPanel panel;
private JPanel panel2;
public static JLabel info;
private JLabel SteinSetz1;
private JLabel SteinSetz2;
private JLabel InfoSteinSetz1;
private JLabel InfoSteinSetz2;
private JLabel Pl1;
private JLabel Pl2;
static JButton newGame;
private JFrame frame;
private JButton shortcut;
private JPaintComponent millBoard;
private boolean spielphasenwechsel;
public boolean MuehleJaNein;
static Spieler spieler1test;
static Spieler spieler2test;
public int feld;
public boolean SteinNehmen= false;

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
		else if(410>Y &&Y>380) {
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
		if (Integer.parseInt(SteinSetz1.getText())>0)
		{
			int newText = Integer.parseInt(SteinSetz1.getText())-1;
			SteinSetz1.setText(Integer.toString(newText));
		}
	}
	else if(WerAmZug==false)
	{
		if (Integer.parseInt(SteinSetz2.getText())>0)
		{
			int newText = Integer.parseInt(SteinSetz2.getText())-1;
			SteinSetz2.setText(Integer.toString(newText));
		}
	}
}

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
		SteinSetz1 = new JLabel("9",SwingConstants.CENTER);
		SteinSetz2 = new JLabel("9",SwingConstants.CENTER);
		InfoSteinSetz1 = new JLabel("Zu setzende Steine",SwingConstants.CENTER);
		InfoSteinSetz2 = new JLabel("Zu setzende Steine",SwingConstants.CENTER);
		newGame = new JButton("EndScreen");
		shortcut = new JButton();
		millBoard = new JPaintComponent();
		
	
		//frame.add(board);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setSize(1024, 680);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Mühle");
		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

				feld=feldclicked(e.getX(),e.getY());
				boolean spielphasenwechsel= logic.alleSteineGesetzt();
				
				if (feld<0) {
					info.setText("Klicke auf ein gültiges Feld.");
				}
				
				if (SteinNehmen ==true){
					MuehleJaNein = logic.pruefeMuehlevorhanden(feld);
					if (MuehleJaNein == true) {
						info.setText("Dieser Stein darf nicht genommen werden");
						SteinNehmen=true;
					}
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
					logic.changeZug();
					logic.anDerReihe();
					}
				}
				
				
				else if(spielphasenwechsel ==false && logic.getPositions(feld)==0) {
					
					logic.setPosition(feld);
					MuehleJaNein = logic.pruefeMuehle(feld);
					reduceSteinCounter(logic.getZug());
					if (MuehleJaNein ==false) {	
					int [] paktuell = logic.getPositions();
					for (int i=0; i<24; i++)
					{
						System.out.print(paktuell[i]+ " ");
					}
					System.out.println("");{
					}
					logic.changeZug();
					logic.anDerReihe();
					}

					else if(MuehleJaNein==true){
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
						
					info.setText("Du hast eine Mühle! Nimm einen Stein vom Gegner");
					SteinNehmen = true; 
					}
				}
			
				else {
					info.setText("Ungültiger Spielzug.");
				}	

				}
			
		

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
		panel.add(SteinSetz1);
		panel.add(SteinSetz2);
		panel.add(InfoSteinSetz1);
		panel.add(InfoSteinSetz2);
		
		
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
		
		info.setBounds(200, 85, 600, 25);
		info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		info.setBackground(Color.WHITE);
		info.setText(spieler1.getSpielerName() + " ist am Zug.");
		info.setVisible(true);
		info.setOpaque(true);
		
		SteinSetz1.setBounds(240,125,30,30);
		SteinSetz1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		SteinSetz1.setBackground(Color.WHITE);
		SteinSetz1.setVisible(true);
		SteinSetz1.setOpaque(true);
		
		InfoSteinSetz1.setBounds(110,125,125,30);
		InfoSteinSetz1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		InfoSteinSetz1.setBackground(Color.WHITE);
		InfoSteinSetz1.setVisible(true);
		InfoSteinSetz1.setOpaque(true);
		
		SteinSetz2.setBounds(240,600,30,30);
		SteinSetz2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		SteinSetz2.setBackground(Color.WHITE);
		SteinSetz2.setVisible(true);
		SteinSetz2.setOpaque(true);
		
		InfoSteinSetz2.setBounds(110,600,125,30);
		InfoSteinSetz2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		InfoSteinSetz2.setBackground(Color.WHITE);
		InfoSteinSetz2.setVisible(true);
		InfoSteinSetz2.setOpaque(true);
		
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