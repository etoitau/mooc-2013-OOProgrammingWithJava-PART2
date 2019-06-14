/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package farmsimulator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Barn {
    private MilkingRobot robot;
    private BulkTank tank;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot MilkingRobot) {
        robot = MilkingRobot;
        robot.setBulkTank(tank);        
    }
    
    public void takeCareOf(Cow cow) throws IllegalStateException{
        if (robot == null)
            throw new IllegalStateException();
        robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
        for (Cow cow : cows) 
            robot.milk(cow);
    }
    
    @Override
    public String toString() {
        return tank.toString();
    }
}
