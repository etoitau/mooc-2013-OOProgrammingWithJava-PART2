
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Jump {
    private List<Integer> judges;
    private int length;
    private Random rand;
    
    public Jump() {
        this.rand = new Random(); 
        this.length = 60 + rand.nextInt(60);
        this.judges = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++)
            judges.add(rand.nextInt(20));
    }
    
    public int getScore() {
        int score = length;
        for (int judge: judges) 
            score += judge;
        score -= Collections.max(judges) + Collections.min(judges);
        return score;
    }
    
    public int getLength() {
        return length;
    }
    
    public List<Integer> getJudges() {
        return judges;
    }
}
