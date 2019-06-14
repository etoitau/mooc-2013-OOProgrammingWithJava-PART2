/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package dungeon;

import java.util.Random;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Vampire extends Player {
    private boolean mobile, alive = true;
    
    public Vampire(Dungeon dungeon) {
        super(dungeon);
        Random rand = new Random();
        mobile = dungeon.getVampsMove();
        while (true) {
            coord = new Coordinate(rand.nextInt(dungeon.getLength()), 
                    rand.nextInt(dungeon.getHeight()));
            if (!dungeon.vampHere(coord)) {
                if (!coord.equals(dungeon.getHero().getCoordinate())) {
                    break;
                }
            }
        }
    }
    
    public void kill() {
        alive = false;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    @Override
    public void move(char dir) {
        if (mobile) {
            Coordinate trial = coord.copy();
            trial.slide(dir);
            if (dungeon.inBounds(trial)) {
                if (!dungeon.vampHere(trial))
                    coord.slide(dir);
            }
            if (this.collide(dungeon.getHero())) {
                alive = false;
            }
        }
    }
    
    @Override
    public String toString() {
        return "v " + coord.getX() + " " + coord.getY();
    }
}
