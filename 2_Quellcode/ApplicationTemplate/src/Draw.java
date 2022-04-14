import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel{
	
	ImageLoader il = new ImageLoader();
	ImageLoader il2 = new ImageLoader();
	
	protected void paintComponent (Graphics g) {
		super.paintComponent (g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(il.image, 112,150, 350, 200, null);
		//g.drawImage(il2.image, 0, 0, 600, 600, null);
		
		repaint();
	
}
	
	
}
