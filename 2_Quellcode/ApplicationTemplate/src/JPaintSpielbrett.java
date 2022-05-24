import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

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
	    

//	    //nur zum Testen:
//	    public static void main(final String[] args) {
//	        Runnable gui = new Runnable() {
	//
//	            public void run() {
//	                JFrame f = new JFrame("JPaintComponent");
//	                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	                f.setSize(220, 250);
//	                f.setLocationRelativeTo(null);
//	                JPaintComponent c = new JPaintComponent();
//	                c.paintObj(new PaintableLine(Color.RED, 10, 10, 200, 200));
//	                c.paintObj(new PaintableLine(Color.BLUE, 10, 200, 200, 10));
//	                f.add(c);
//	                f.setVisible(true);
//	            }
//	        };
//	        EventQueue.invokeLater(gui);
//	    }
	}

