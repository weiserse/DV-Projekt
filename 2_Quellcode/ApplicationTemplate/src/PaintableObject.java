import java.awt.*;

/**
 * Nur Klassen, die von dieser Klasse abgeleitet wurden, k�nnen gezeichnet werden.
 */
public abstract class PaintableObject {

    private Color actual;

    public PaintableObject(final Color actual) {
        this.actual = actual;
    }

    public void setColor(final Color newColor) {
        actual = newColor;
    }

    void update(final Graphics g) {
        g.setColor(actual);
        paint(g);
    }

    public abstract void paint(final Graphics g);
}