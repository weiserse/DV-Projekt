import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

/**
 * Klasse zum zeichnen des Muehle-Spielbretts
 * @author Glunz, Zimmermann
 *
 */
public class JPaintSpielbrett extends JComponent{

	private List<PaintableObject> paints = new ArrayList<PaintableObject>();
	

	public void paintObj(final PaintableObject po) {
        paints.add(po);
    }

    public List<PaintableObject> getObjects() {
        return paints;
    }

    public void removeObj(final PaintableObject po) {
        paints.remove(po);
    }

    public void clear() {
        paints.clear();
    }

    @Override
    protected void paintComponent(final Graphics g) {
        for (PaintableObject po : paints) {
            po.update(g);
        }
    }
    
    public void setBackground(Graphics g, Color c)
    {
    	g.setColor(c);	
    }
}

