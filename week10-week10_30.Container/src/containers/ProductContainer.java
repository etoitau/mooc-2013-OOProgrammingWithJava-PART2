/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package containers;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class ProductContainer extends Container {
    private String name;
    
    public ProductContainer(String name, double capacity) {
        super(capacity);
        this.name = name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name + ": " + super.toString();
    }

}
