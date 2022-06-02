import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class JPaintSpielsteine extends JComponent{

	private List<PaintableObject> stein = new ArrayList<PaintableObject>();
	

	public void paintObj(final PaintableObject po) {
        stein.add(po);
    }
			
    public List<PaintableObject> getObjects() {
        return stein;
    }

    public void removeObj(final PaintableObject po) {
        stein.remove(po);
    }

    public void clear() {
        stein.clear();
    }

    @Override
    protected void paintComponent(final Graphics g) {
        for (PaintableObject po : stein) {
            po.update(g);
        }
    }	
	
}
