public class RectAppTeste {
    public static void main (String[] Strings) {
        RectTeste r1 = new RectTeste(1,1, 10,10);
        r1.print();
        RectTeste r2 = new RectTeste(2,2, 20,20);
        r2.print();
        RectTeste r3 = new RectTeste(3,3, 15,15);
        r3.print();
    }
}
class RectTeste {
    int x, y;
    int w, h;
    RectTeste (int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }
}