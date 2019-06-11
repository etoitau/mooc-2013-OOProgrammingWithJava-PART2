/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class CD implements ToBeStored {
    private String artist, title;
    private int year;
    private final double WEIGHT = 0.1;
    
    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    
    public String toString() {
        return artist + ": " + title + " (" + year + ")";
    }
    
    public double weight() {
        return WEIGHT;
    }
}
