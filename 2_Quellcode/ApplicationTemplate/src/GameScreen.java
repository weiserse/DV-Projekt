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
private JLabel Pl1;
private JLabel Pl2;
static JButton newGame;
private JFrame frame;
private JButton shortcut;
private JPaintComponent millBoard;
private boolean spielphasenwechsel;
private boolean MuehleJaNein;
static Spieler spieler1test;
static Spieler spieler2test;

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
		frame.setTitle("Mühle");
		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (feldclicked(e.getX(),e.getY())<0) {
					info.setText("Klicke auf ein gültiges Feld.");
				}
				else if (logic.getPositions(feldclicked(e.getX(),e.getY()))==0)
				{
						boolean spielphasenwechsel= logic.alleSteineGesetzt();
						
						if(spielphasenwechsel ==false) {
						logic.setPosition(feldclicked(e.getX(),e.getY()));
						logic.anDerReihe();
						
						int [] paktuell = logic.getPositions();
						for (int i=0; i<24; i++)
						{
							System.out.print(paktuell[i]+ " ");
						}
						System.out.println("");{
						}
						
						MuehleJaNein = logic.pruefeMuehle();
						
						if (MuehleJaNein == true) {
					   // logic.steinNehmen()
						}
						
						logic.changeZug();
						}
				}
				else
					info.setText("Ungültiger Spielzug!");
			
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