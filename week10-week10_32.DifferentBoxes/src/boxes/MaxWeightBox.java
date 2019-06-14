/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class MaxWeightBox extends Box {
    private int maxWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
    }
    
    public int getWeight() {
        int sum = 0;
        for (Thing thing : things) {
            sum += thing.getWeight();
        }
        return sum;
    }
    
    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= maxWeight - this.getWeight()) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }

}
