import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class spielfeld extends JLabel{
	
	ImageLoader ilspielfeld = new ImageLoader();
	
	protected void paintComponent (Graphics g) {
		super.paintComponent (g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(ilspielfeld.imagespielfeld, 286,166, 420, 420, null);
		
		repaint();
	
}
	
	
}