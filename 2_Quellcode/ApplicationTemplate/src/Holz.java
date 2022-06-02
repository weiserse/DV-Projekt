import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

/**
 * "Holz" shows the background image on the "WelcomeScreen". 
 * An object of the class ImageLoader is created to define the size of the image.
 * 
 */
public class Holz extends JLabel{
	
	ImageLoader ilholz = new ImageLoader();
	
	/**
	 * transforms previously loaded images from ImageLoader into paintable grpahics objects
	 */
	protected void paintComponent (Graphics g) {
		super.paintComponent (g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(ilholz.imageholz, 0,0, 1024, 680, null);
		
		repaint();
	
	}
		
}
