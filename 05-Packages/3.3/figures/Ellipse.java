package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse {
    private int x, y;
    private int w, h;

    public Ellipse (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    private void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint paint = new GradientPaint(0, 0, Color.red, 420, 0, Color.blue);
        g2d.setPaint(paint);
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}
