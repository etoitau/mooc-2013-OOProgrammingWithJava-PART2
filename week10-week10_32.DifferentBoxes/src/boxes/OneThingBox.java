/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package boxes;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class OneThingBox extends Box {
    private Thing item;
    
    @Override
    public void add(Thing thing) {
        if (item == null)
            item = thing;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (item == null)
            return false;
        return item.equals(thing);
    }

}
