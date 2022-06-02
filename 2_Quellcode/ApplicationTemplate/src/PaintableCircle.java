import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.Graphics;
import java.awt.*;

public class PaintableCircle extends PaintableObject{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color c;

	public PaintableCircle(final Color c, final int x1, final int y1, final int x2, final int y2) {
		super(c);
		this.c = c;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		//System.out.println("PaintableCircle Constructor");
		
	}

	public void paint(final Graphics g) {
		
		g.fillArc(x1, y1, 30, 30, 0, 360);
		g.setColor(c);
		System.out.println(g.getColor() + "\n" + x1 + "\t" + y1);
	}

}
