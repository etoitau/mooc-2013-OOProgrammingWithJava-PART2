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

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + salary + " euros/month";
    }
    
}
