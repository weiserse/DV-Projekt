import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 * "Draw" shows the background image on the "Gewinner" screen. 
 * An object of the class ImageLoader is created to define the size of the image.
 * 
 */

public class Draw extends JLabel{
	
	ImageLoader ilholz = new ImageLoader();
	ImageLoader ilfeuer = new ImageLoader();
	
	protected void paintComponent (Graphics g) {
		super.paintComponent (g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(ilholz.imageholz, 0,0, 600, 600, null);
		g.drawImage(ilfeuer.imagefeuer, 112, 150, 350, 200, null);
		
		repaint();
	
}
	
	
}
