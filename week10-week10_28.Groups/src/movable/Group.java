/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package movable;

import java.util.ArrayList;
import java.util.List;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Group implements Movable {
    private List<Movable> movables;
    
    public Group() {
        movables = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String out = "";
        for (Movable movable : movables)
            out += movable + "\n";
        return out;
    }
    
}
