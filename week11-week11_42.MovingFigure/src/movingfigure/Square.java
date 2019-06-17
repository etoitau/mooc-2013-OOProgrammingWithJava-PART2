/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package movingfigure;

import java.awt.Graphics;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Square extends Figure {
    private int dim;
    
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.dim = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), dim, dim);
    }

}
