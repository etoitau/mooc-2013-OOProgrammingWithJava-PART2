/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Thing {
    private String name;
    private int weight;
    
    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
