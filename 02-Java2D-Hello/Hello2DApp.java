import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;


        /* Altere a cor da figura */
        /* (Color.INSIRA AQUI O NOME DA COR) red, yellow, blue, orange, black, etc... */
        /* (new Color(r,g,b)) Para inserir a cor em RGB */
        g2d.setPaint (new Color(69,83,119)); 

        g2d.setStroke(new BasicStroke(5));

        int w = getWidth();
        int h = getHeight();

        g2d.drawLine(0, 0, w, h);
        g2d.drawLine(0, h, w, 0);
    }
}