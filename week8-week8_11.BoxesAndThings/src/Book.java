/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Book implements ToBeStored {
    private String writer, name;
    private double weight;
    
    public Book (String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    public String toString() {
        return writer + ": " + name;
    }
    
    public double weight() {
        return weight;
    }
}
