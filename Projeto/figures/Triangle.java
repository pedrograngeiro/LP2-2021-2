package figures;

import java.awt.*;
import javax.swing.*;


public class Triangle extends Figure {
    
    public Triangle (int x1, int x2, int x3){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public void print() {
        System.out.format("Triangulo de tamanho (%d) na posicao (%d,%d).\n",
            this.x1, this.x2, this.x3);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int[] xPoints = {x1, x2, x3};
        int[] yPoints = {x1+x1, x2, x3};
        g2d.drawPolygon(xPoints, yPoints, 3);
    }
}
