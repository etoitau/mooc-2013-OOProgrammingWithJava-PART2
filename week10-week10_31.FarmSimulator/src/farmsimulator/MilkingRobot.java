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

public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot() {
        // default
    }
    
    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) throws IllegalStateException {
        if (tank == null)
            throw new IllegalStateException();
        tank.addToTank(milkable.milk());
    }
}
