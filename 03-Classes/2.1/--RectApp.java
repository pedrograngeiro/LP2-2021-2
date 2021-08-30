import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectApp {
    public static void main (String[] args) {
        Rect frame = new Rect();
    }
}
class Rect extends JFrame {
    public Rect () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Desenhe o retangulo");
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        //primeiro retangulo
        g2d.setPaint (new Color(0,255,0)); 
        g2d.fillRect(30, 50, 100, 100);

        //segundo retangulo
        g2d.setColor(Color.pink);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(150, 150, 200, 100);

        //terceiro retangulo
        g2d.setPaint (new Color(102, 85, 196)); 
        g2d.fillRect(10, 300, 250, 100);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(10));
        g2d.drawRect(10, 300, 250, 100);

    }
}