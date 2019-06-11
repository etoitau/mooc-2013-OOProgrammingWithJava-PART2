/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class CivilService implements NationalService {
    private int daysLeft;
    
    public CivilService() {
        this.daysLeft = 362;
    }
    
    public int getDaysLeft() {
        return daysLeft;
    }
    
    public void work() {
        this.daysLeft--;
        if (daysLeft < 0)
            daysLeft = 0;
    }
}
