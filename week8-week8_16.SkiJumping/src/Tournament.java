
import java.util.ArrayList;
import java.util.Collections;
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

public class Tournament {
    private List<Jumper> jumpers;
    private int round = 0;
    
    public Tournament() {
        jumpers = new ArrayList<Jumper>();
    }
    
    public void addJumper(String name) {
        if (round == 0)
            jumpers.add(new Jumper(name));
    }
    
    public void newRound() {
        for (Jumper jumper : jumpers) {
            jumper.jump();
        }
        round++;
    }
    
    public int getRound() {
        return round;
    }
    
    public void printJumpOrder() {
        Collections.sort(jumpers);
        System.out.println("Jumping order:");
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + jumpers.get(i));
        }
    }
    
    public void printRoundResults() {
        System.out.println("Results of round " + (round));
        for (Jumper jumper: jumpers) {
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getJump(round - 1).getLength());
            System.out.println("    judge votes: " + jumper.getJump(round - 1).getJudges());
        }
    }
    
    public void printFinal() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        String spaces = "            ";
        for (int i = 0; i < jumpers.size(); i++) {
            Jumper jumper = jumpers.get(i);
            String line1 = (i + 1) + spaces;
            System.out.println(line1.substring(0, 12) + jumper);
            System.out.print(spaces.substring(0, 12) + "jump lengths: ");
            for (int j = 0; j < round; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }  
                System.out.print(jumper.getJump(j).getLength() + " m");
            }
            System.out.println();
        }
    }
}
