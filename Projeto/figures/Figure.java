package figures;

import java.awt.Graphics;

public abstract class Figure {
    int x, y;
    int w, h;
    int x1 ,x2, x3;

    public abstract void paint (Graphics g);
}