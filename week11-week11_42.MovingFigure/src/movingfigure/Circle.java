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

public class Circle extends Figure {
    private int diam;
    
    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diam = diameter;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(this.getX(), this.getY(), diam, diam);
    }

}
