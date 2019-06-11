
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
public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;
    
    public Suitcase(int weightLimit) {
        this.things = new ArrayList<Thing>();
        this.weightLimit = weightLimit;
    }
    
    public void addThing(Thing thing) {
        if(this.totalWeight() + thing.getWeight() <= weightLimit) {
            this.things.add(thing);
        }
    }
    
    public String toString() {
        String out = "";
        if (things.size() == 0) {
            out += "empty ";
        } else if (things.size() == 1) {
            out += "1 thing ";
        } else {
            out += things.size() + " things ";
        }
        return out += "(" + this.totalWeight() + " kg)";
    }
    
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        Thing heavy;
        if (things.size() == 0) 
            return null;
        heavy = things.get(0);
        for (int i = 0; i < things.size(); i++) {
            heavy = (things.get(i).getWeight() > heavy.getWeight()) ? 
                    things.get(i) : heavy;
        }
        return heavy;          
    }
}
