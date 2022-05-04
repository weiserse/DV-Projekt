import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas  extends JPanel
{
	private int width = 360;
	private int height = 360;
	
	public 	Canvas()
	{
		this.setBackground(Color.WHITE);
		try 
		{
		    //logo = ImageIO.read(new File("HFU-Logo.png"));
		} 
		catch (Exception e) { e.printStackTrace(); }
	}
	
	@Override
    public Dimension getPreferredSize() {
		return new Dimension(this.width, this.height);
    }
	@Override
	protected void paintComponent(Graphics linien) {
		super.paintComponent(linien);
		int x = 290;
		int y = 170;
		int w = 360;
		int h = 360;

		linien.setColor(Color.BLACK);
		
		//Linien des Spielfeldes 
		//Linien horizintal
					//	x1	y1		x2	y2
		linien.drawLine(290, 170, 640, 170);//aussen oben
		linien.drawLine(350, 230, 590, 230);//mitte oben
		linien.drawLine(410, 290, 530, 290);//innen oben
		linien.drawLine(410, 410, 530, 410);//innen unten
		linien.drawLine(350, 470, 590, 470);//mitte unten
		linien.drawLine(290, 530, 650, 530);//aussen unten
		
		//Halbe Verbindungslinien
		linien.drawLine(290, 350, 410, 350); //links
		linien.drawLine(530, 350, 650, 350); //rechts
		
		//Linien vertikal
		linien.drawLine(290, 170, 290, 530);//aussen links
		linien.drawLine(350, 230, 350, 470);//mitte links
		linien.drawLine(410, 290, 410, 410);//innen links
		linien.drawLine(530, 290, 530, 410);//innen rechts
		linien.drawLine(590, 230, 590, 470);//mitte rechts
		linien.drawLine(650, 170, 650, 530);//aussen rechts
		
		//Halbe Verbindungslinien
		linien.drawLine(470, 170, 470, 290); //oben
		linien.drawLine(470, 410, 470, 530); //unten
		
		
	}
	
}
