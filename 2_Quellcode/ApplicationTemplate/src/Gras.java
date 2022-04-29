import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 * "Gras" shows the background image on the "WelcomeScreen". 
 * An object of the class ImageLoader is created to define the size of the image.
 * 
 * @author Peukert
 */


public class Gras extends JLabel{
	
	ImageLoader ilgras = new ImageLoader();
	
	protected void paintComponent (Graphics g) {
		super.paintComponent (g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(ilgras.imagegras, 0,0, 1024, 680, null);
		
		repaint();
	
}
	
	
}
