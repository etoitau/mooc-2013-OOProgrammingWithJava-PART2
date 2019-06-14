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

public class BlackHoleBox extends Box {

    @Override
    public void add(Thing thing) {
        // just let it go, man. It's gone
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

}
