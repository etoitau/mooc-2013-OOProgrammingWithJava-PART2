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

public class Hero extends Player {
    
    public Hero(Dungeon dungeon) {
        super(dungeon);
        coord = new Coordinate(0, 0);
    }
    
    @Override
    public void move(char dir) {
        Coordinate trial = coord.copy();
        trial.slide(dir);
        if (dungeon.inBounds(trial)) {
            coord.slide(dir);
        }
        for (Vampire vamp : dungeon.getVampires()) {
            if (this.collide(vamp))
                vamp.kill();
        }
    }
    
    @Override
    public String toString() {
        return "@ " + coord.getX() + " " + coord.getY();
    }

}
