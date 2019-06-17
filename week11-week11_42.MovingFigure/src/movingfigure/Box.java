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

public class Box extends Figure {
    private int width, height;
    
    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(this.getX(), this.getY(), width, height);
    }

}
