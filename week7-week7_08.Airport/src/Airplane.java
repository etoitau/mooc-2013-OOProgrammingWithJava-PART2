/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Airplane {
    private String id;
    private int capacity;
    
    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String toString() {
        return id + " (" + capacity + " ppl)"; 
    }
    
    public String getId() {
        return id;
    }
}
