/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Box implements Thing {
    private int maxCapacity;
    private List<Thing> contents;
    
    public Box(int maximumCapacity) {
        this.maxCapacity = maximumCapacity;
        this.contents = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if (thing.getVolume() > maxCapacity - this.getVolume()) {
            return false;
        } 
        contents.add(thing);
        return true;
    }
    
    @Override
    public int getVolume() {
        int spaceUsed = 0;
        for (Thing thing : contents) {
            spaceUsed += thing.getVolume();
        }
        return spaceUsed;
    }
}
