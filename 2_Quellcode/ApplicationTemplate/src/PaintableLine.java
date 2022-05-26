import java.awt.*;

/**
 * Beispielimplementation einer Linie.
 */
public class PaintableLine extends PaintableObject {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public PaintableLine(final Color c, final int x1, final int y1, final int x2, final int y2) {
        super(c);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        //System.out.println("PL Constructor");

    }

    public void paint(final Graphics g) {
        g.drawLine(x1, y1, x2, y2);
      //System.out.println("PL Paint");

    }
}