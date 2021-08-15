import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class testes {
    public static void main (String[] args) {
        teste2DFrame frame = new teste2DFrame();
    }
}

class teste2DFrame extends JFrame {
    public teste2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;


        /* Altere a cor da figura */
        /* (Color.INSIRA AQUI O NOME DA COR) red, yellow, blue, orange, black, etc... */
        /* (new Color(r,g,b)) Para inserir a cor em RGB */
        g2d.setPaint (new Color(69,83,119)); 


        /* Gradiente de cores*/
        GradientPaint paint = new GradientPaint(0, 0, Color.red, 420, 0, Color.blue);
        
        /* Para aumentar a largura da pincelada(STROKE) use o setStroke */
        g2d.setStroke(new BasicStroke(5));

        
        /*Desenho de linha */
        //int w = getWidth();
        //int h = getHeight();


        //g2d.drawLine(0,0, w,h); //linha1
        //g2d.drawLine(0,h, w,0); //linha2
        /*Fim desenho de linha */

        //Cordenadas Grafico
        //int[] xPoints= {50,100,150,200,250,300,350};
        //int[] yPoints= {350,250,275,200,275,150,100};
        //int nPoints = xPoints.length;

        //Cordenadas Triangulo
        //int[] x = {100,200,300};
        //int[] y = {300,127,300};

        /*Desenho seguimento de linha por pontos ( grafico )*/
        //g2d.drawPolyline(xPoints, yPoints, nPoints);

        /*Escrever na tela*/
        //g2d.setFont(new Font("Comic Sans",Font.ITALIC,25));
        //g2d.setColor(Color.green);
        //g2d.drawString("STONKS", 100, 100);

        /*Desenhar triangulo na tela*/
        //g2d.drawPolygon(x,y,3);
        /*Desenhar triangulo pintado na tela*/
        //g2d.fillPolygon(x,y,3);

        /*Desenhar quadrado*/
        //g2d.fillRect(50, 50, 150, 150);

        /*Desenhar retangulo*/
        //g2d.drawOval(50, 50, 150, 150);

        /*Desenhar um arco em graus*/
        //g2d.setPaint(paint);
        g2d.fillArc(50, 50, 300, 300, 180, 270);
    }
}