/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package farmsimulator;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class BulkTank {
    private double capacity = 2000, volume = 0;
    
    public BulkTank() {
        // default
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace() {
        return capacity - volume;
    }
    
    public void addToTank(double amount) {
        volume += amount;
        if (volume > capacity)
            volume = capacity;
    }
    
    public double getFromTank(double amount) {
        if (amount > volume) {
            double temp = volume;
            volume = 0;
            return temp;        
        } else {
            volume -= amount;
            return amount;
        }
    }
    
    @Override
    public String toString() {
        // test requiremnt != example output in spec
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
