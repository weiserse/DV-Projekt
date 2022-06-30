import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 * Class to draw the game board and all pieces in play.
 *
 */
public class Spielbrett extends JPanel {
	
	int [] positions;
	private int feldkoordinatenX [];
	private int feldkoordinatenY [];

	/**
	 * Constructs and initializes a Spielbrett object with set parameters.
	 * fix x and y koordinates of every playable point are also initialized in this constructor.
	 * @param logic GameLogic object in order to access positions [] array to paint current state of the game board
	 */
public Spielbrett(GameLogic logic){
	feldkoordinatenX = new int [24];
	feldkoordinatenX[0] = 305;
	feldkoordinatenX[1] = 485;
	feldkoordinatenX[2] = 665;
	feldkoordinatenX[3] = 665;
	feldkoordinatenX[4] = 665;
	feldkoordinatenX[5] = 485;
	feldkoordinatenX[6] = 305;
	feldkoordinatenX[7] = 305;
	feldkoordinatenX[8] = 365;
	feldkoordinatenX[9] = 485;
	feldkoordinatenX[10] = 605;
	feldkoordinatenX[11] = 605;
	feldkoordinatenX[12] = 605;
	feldkoordinatenX[13] = 485;
	feldkoordinatenX[14] = 365;
	feldkoordinatenX[15] = 365;
	feldkoordinatenX[16] = 425;
	feldkoordinatenX[17] = 485;
	feldkoordinatenX[18] = 545;
	feldkoordinatenX[19] = 545;
	feldkoordinatenX[20] = 545;
	feldkoordinatenX[21] = 485;
	feldkoordinatenX[22] = 425;
	feldkoordinatenX[23] = 425;
	
	feldkoordinatenY = new int[24];
	feldkoordinatenY[0] = 185;
	feldkoordinatenY[1] = 185;
	feldkoordinatenY[2] = 185;
	feldkoordinatenY[3] = 365;
	feldkoordinatenY[4] = 545;
	feldkoordinatenY[5] = 545;
	feldkoordinatenY[6] = 545;
	feldkoordinatenY[7] = 365;
	feldkoordinatenY[8] = 245;
	feldkoordinatenY[9] = 245;
	feldkoordinatenY[10] = 245;
	feldkoordinatenY[11] = 365;
	feldkoordinatenY[12] = 485;
	feldkoordinatenY[13] = 485;
	feldkoordinatenY[14] = 485;
	feldkoordinatenY[15] = 365;
	feldkoordinatenY[16] = 305;
	feldkoordinatenY[17] = 305;
	feldkoordinatenY[18] = 305;
	feldkoordinatenY[19] = 365;
	feldkoordinatenY[20] = 425;
	feldkoordinatenY[21] = 425;
	feldkoordinatenY[22] = 425;
	feldkoordinatenY[23] = 365;
	
	this.positions=logic.getPositions();
	}

/**
 * paint method to draw the game board.
 */
	public void paint(Graphics g) {

		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setPaint(new Color(238,232,170));
		g2D.fillRect(290, 170, 390, 390);
		
		g2D.setPaint(Color.BLACK);
		g2D.setStroke(new BasicStroke(2));
		
		//Verbindungslinien horizontal
		g2D.drawLine( 305, 185, 665, 185);
		g2D.drawLine( 365, 245, 605, 245);
		g2D.drawLine( 425, 305, 545, 305);
		g2D.drawLine( 425, 425, 545, 425);	
		g2D.drawLine( 365, 485, 605, 485);
		g2D.drawLine( 305, 545, 665, 545);
		
		//Halbe Verbindungslinien horizontal
		g2D.drawLine( 305, 365, 425, 365);
		g2D.drawLine( 545, 365, 665, 365);
		
		//Linien vertikal
		g2D.drawLine( 305, 185, 305, 545);
		g2D.drawLine( 365, 245, 365, 485);
		g2D.drawLine( 425, 305, 425, 425);
		g2D.drawLine( 545, 305, 545, 425);
		g2D.drawLine( 605, 245, 605, 485);
		g2D.drawLine( 665, 185, 665, 545);
	
		//Halbe Verbindungslinien vertikal
		g2D.drawLine( 485, 185, 485, 305);
		g2D.drawLine( 485, 425, 485, 545);
		
		for (int i=0; i<24; i++) {
			if (positions[i]==1) {
				g2D.setPaint(Color.WHITE);
				g2D.fillOval(feldkoordinatenX[i]-15, feldkoordinatenY[i]-15, 30, 30);
			}
			else if(positions[i]==2) {
				g2D.setPaint(Color.BLACK);
				g2D.fillOval(feldkoordinatenX[i]-15, feldkoordinatenY[i]-15, 30, 30);
			}
		}
	}
}
