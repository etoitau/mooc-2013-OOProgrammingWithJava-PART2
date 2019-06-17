/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class CompoundFigure extends Figure {
    private List<Figure> figures;

    public CompoundFigure() {
        super(0, 0);
        figures = new ArrayList<Figure>();
    }
    
    public void add(Figure fig) {
        figures.add(fig);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Figure fig : figures) {
            fig.move(dx, dy);
        }
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure fig : figures) {
            fig.draw(graphics);
        }
    }

}
