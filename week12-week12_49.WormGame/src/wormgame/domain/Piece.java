/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package wormgame.domain;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Piece {
    private int x, y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public boolean runsInto(Piece piece) {
        return this.x == piece.getX() && this.y == piece.getY();
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
