import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DAppMod03 {
    public static void main (String[] args) {
        Hello2DFrameMod03 frame = new Hello2DFrameMod03();
    }
}

/*Modificações feitas*/
//Fazer um arco com cores em gradientes do vermelho ao azul

class Hello2DFrameMod03 extends JFrame {
    public Hello2DFrameMod03 () {
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

        /* Gradiente de cores*/
        GradientPaint paint = new GradientPaint(0, 0, Color.red, 420, 0, Color.blue);

        g2d.setPaint(paint);
        g2d.fillArc(30, 30, 300, 300, 180, 270);
    }
}