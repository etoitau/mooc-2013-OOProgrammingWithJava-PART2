/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package moving.domain;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;
    
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }
    
    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int compareTo(Item o) {
        return this.volume - o.getVolume();
    }

}
