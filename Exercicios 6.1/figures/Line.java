package figures;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Line extends Figure{

    public Line (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void print () {
        System.out.format("A linha comeca no ponto (x %d, y %d) , termina no ponto (x2 %d, y2 %d) \n",
            this.x, this.y, this.w, this.h);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(this.x,this.y, this.w,this.h);
    }
}
