
import java.util.ArrayList;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */
public class Box implements ToBeStored {
    private final double MAX_WT;
    private ArrayList<ToBeStored> contents;
    
    public Box(double maxWeight) {
        this.MAX_WT = maxWeight;
        contents = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item) {
        if (this.weight() + item.weight() <= MAX_WT) {
            contents.add(item);
        }
    }
    
    public double weight() {
        double weight = 0;
        for (int i = 0; i < contents.size(); i++) {
            weight += contents.get(i).weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + contents.size() + " things, total weight " + 
                this.weight() + " kg";
    }
    
}
