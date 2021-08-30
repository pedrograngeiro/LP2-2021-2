import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class EllipseApp {
    public static void main (String[] args) {
        EllipseFrame frame = new EllipseFrame();
        frame.setVisible(true);
    }
}

class EllipseFrame extends JFrame {
    Ellipse e1;
    Ellipse e2;
    Ellipse e3;
    EllipseFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Ellipse");
        this.setSize(350, 350);
        this.e1 = new Ellipse(50,50, 100,30);
        this.e2 = new Ellipse(50,100, 200,60);
        this.e3 = new Ellipse(100,200, 50,100);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
    }

}

class Ellipse {
    int x, y;
    int w, h;

    Ellipse (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print() {
        System.out.format("Elise de tamanho (%d, %d) na posicao (%d, %d). \n", this.w, this.h, this.x, this.y);
    }

    void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(new Color(0, 255, 0));
        g2d.fillOval(this.x, this.y, this.w, this.h);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Ellipse2D.Double(this.x, this.y, this.w, this.h));
    }
    
}