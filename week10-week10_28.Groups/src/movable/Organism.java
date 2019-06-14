/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package movable;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Organism implements Movable {
    private int x, y;
    
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }
}
