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

public class Student extends Person {
    private int credits = 0;
    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study() {
        credits++;
    }
    
    public int credits() {
        return credits;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  credits " + credits;
    }
}
