
import java.util.ArrayList;
import java.util.List;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Jumper implements Comparable<Jumper> {
    private int totalPoints = 0;
    private List<Jump> jumps;
    private String name;
    
    public Jumper(String name) {
        this.name = name;
        this.jumps = new ArrayList<Jump>();
    }
    
    public void jump() {
        Jump jump = new Jump();
        jumps.add(jump);
        totalPoints += jump.getScore();
    }
    
    public String getName() {
        return name;
    }
    
    public Jump getJump(int index) {
        return jumps.get(index);
    }
    
    public int getScore() {
        return totalPoints;
    }
    
    @Override
    public String toString() {
        return name + " (" + totalPoints + " points)";
    }
    
    @Override
    public int compareTo(Jumper otherJumper) {
        return this.totalPoints - otherJumper.getScore();
    }
}
