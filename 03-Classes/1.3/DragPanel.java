public class DragPanel {
    public static void main (String[] args) {
        MyFrame myframe = new MyFrame();
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


    }
}