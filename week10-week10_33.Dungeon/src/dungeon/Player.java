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

public abstract class Player {
    protected Coordinate coord;
    protected Dungeon dungeon;
    
    public Player(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
    
    public Coordinate getCoordinate() {
        return coord;
    }
    
    public abstract void move(char dir);
    
    public boolean collide(Player player) {
        return this.coord.equals(player.coord);
    }

}
