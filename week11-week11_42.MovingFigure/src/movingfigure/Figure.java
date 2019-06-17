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

public abstract class Figure {
    private int x, y;
    
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public abstract void draw(Graphics graphics);
    
    
}
