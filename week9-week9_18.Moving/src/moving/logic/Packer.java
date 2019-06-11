/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(boxesVolume));
//        int currentBox = 0;
        for (int i = 0; i < things.size(); i++) {
            if (!boxes.get(boxes.size() - 1).addThing(things.get(i))) {
                boxes.add(new Box(boxesVolume));
                boxes.get(boxes.size() - 1).addThing(things.get(i));
            }
            
        }
        
        return boxes;
    }
}
