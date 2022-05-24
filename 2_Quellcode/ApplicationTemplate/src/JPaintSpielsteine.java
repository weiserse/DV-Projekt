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
