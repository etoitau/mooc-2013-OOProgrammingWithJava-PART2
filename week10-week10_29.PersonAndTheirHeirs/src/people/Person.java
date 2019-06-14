/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package people;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Person {
    private String name, address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name + "\n  " + address;
    }
}
