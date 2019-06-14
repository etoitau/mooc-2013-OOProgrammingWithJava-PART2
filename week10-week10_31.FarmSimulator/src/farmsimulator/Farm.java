/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> herd;
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.herd = new ArrayList<Cow>();
    }
    
    public void manageCows() {
        if (!herd.isEmpty()) {
            barn.takeCareOf(herd);
        }
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void addCow(Cow cow) {
        herd.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }
    
    @Override
    public void liveHour() {
        if (!herd.isEmpty()) {
            for (Cow cow : herd) {
                cow.liveHour();
            }
        }
    }
    
    @Override
    public String toString() {
        String out = "";
        out += "Farm owner: " + owner + "\nBarn bulk tank: " + 
                barn.getBulkTank().toString();
        if (herd.isEmpty()) {
            out += "\nNo cows.";
        } else {
            out += "\nAnimals:";
            for (Milkable cow : herd)
                out += "\n        " + cow.toString();
        }
        return out;
    }

}
