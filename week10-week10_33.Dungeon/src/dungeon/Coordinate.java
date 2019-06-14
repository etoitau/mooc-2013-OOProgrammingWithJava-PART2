/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package dungeon;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Coordinate {
    private int x, y;
    
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Coordinate copy() {
        return new Coordinate(this.x, this.y);
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void slide(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public void slide(char wasd) {
        wasd = Character.toLowerCase(wasd);
        if (wasd == 'w')
            y--;
        if (wasd == 'a')
            x--;
        if (wasd == 's')
            y++;
        if (wasd == 'd')
            x++;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Coordinate other = (Coordinate) obj;
        return (x == other.getX() && y == other.getY());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.x;
        hash = 47 * hash + this.y;
        return hash;
    }
}
