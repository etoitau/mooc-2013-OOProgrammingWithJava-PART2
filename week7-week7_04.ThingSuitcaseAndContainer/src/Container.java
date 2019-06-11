
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
public class Container {
    private ArrayList<Suitcase> suitcases;
    private int weightLimit;
    
    public Container(int weightLimit) {
        this.suitcases = new ArrayList<Suitcase>();
        this.weightLimit = weightLimit;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight() + suitcase.totalWeight() <= weightLimit) {
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
}
