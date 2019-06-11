/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class MilitaryService implements NationalService {
    private int daysLeft;
    
    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }
    
    public int getDaysLeft() {
        return daysLeft;
    }
    
    public void work() {
        daysLeft--;
        if (daysLeft < 0)
            daysLeft = 0;
    }
}
