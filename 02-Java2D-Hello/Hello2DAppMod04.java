import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DAppMod04 {
    public static void main (String[] args) {
        Hello2DFrameMod04 frame = new Hello2DFrameMod04();
    }
}

/*Modificações feitas*/
//Fazer um grafico com linhas de coordenadas x e y
//Mudar cor de fundo para preto

class Hello2DFrameMod04 extends JFrame {
    public Hello2DFrameMod04 () {
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
        
        int w = getWidth();
        int h = getHeight();

        //Cor do fundo de tela
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, w, h);

        // Cor da linha
        g2d.setPaint (Color.green);

        /* Para aumentar a largura da pincelada(STROKE) use o setStroke */
        g2d.setStroke(new BasicStroke(5));

        //Cordenadas Grafico
        int[] xPoints= {50,100,150,200,250,300,350};
        int[] yPoints= {350,250,275,200,275,150,100};
        int nPoints = xPoints.length;

        /*Desenho seguimento de linha por pontos ( grafico )*/
        g2d.drawPolyline(xPoints, yPoints, nPoints);
    }
}