import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DAppMod02 {
    public static void main (String[] args) {
        Hello2DFrameMod02 frame = new Hello2DFrameMod02();
    }
}

/*Modificações feitas*/
//Fazer um retangulo com fundo e bordas pintadas de cores diferentes


class Hello2DFrameMod02 extends JFrame {
    public Hello2DFrameMod02 () {
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


        // Troquei a cor das linhas e alterei para RGB ficando em um cinza azulado
        g2d.setPaint (new Color(69,83,119)); 
        // Preencho um quadrado
        g2d.fillRect(50, 50, 250, 100);
        
        // Aumentei a largura do traço da linha adicionando um stroke(pincelada)
        g2d.setColor(Color.pink);
        g2d.setStroke(new BasicStroke(10));
        g2d.drawRect(50, 50, 250, 100);

        
        
    }
}