/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package personnel;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Person {
    private String name;
    private Education edu;
    
    public Person(String name, Education edu) {
        this.name = name;
        this.edu = edu;
    }
    
    public Education getEducation() {
        return edu;
    }
    
    public String toString() {
        return name + ", " + edu;
    }
}
