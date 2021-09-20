package figures;

import java.awt.Graphics;

public abstract class Figure {
    int x, y;
    int w, h;
    public abstract void paint (Graphics g);
}