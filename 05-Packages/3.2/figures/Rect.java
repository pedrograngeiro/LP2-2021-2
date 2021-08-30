package figures;

import java.awt.*;

public class Rect {
    private int x, y;
    private int w, h;

    public Rect (int x, int y, int w, int h){
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
        g2d.setColor(Color.pink);
        g2d.setStroke(new BasicStroke(10));
        g2d.drawRect(this.x,this.y, this.w,this.h);
        g2d.setColor(Color.black);
        g2d.fillRect(this.x,this.y, this.w,this.h);
    }

}
