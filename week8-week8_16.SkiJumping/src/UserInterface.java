
import java.util.Scanner;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class UserInterface {
    private Scanner reader;
    private String name;
    Tournament tourny;
    
    public UserInterface(Scanner scanner) {
        reader = scanner;
    }
    
    public void start(String name) {
        tourny = new Tournament();
        System.out.println(name);
        System.out.println();
        getJumpers();
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
        runTournament();
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        printResults();
    }
    
    public void getJumpers() {
        if (tourny.getRound() != 0) {
            System.out.println("Tournament already underway!");
        } else {
            System.out.println("Write the names of the participants one at a "
                    + "time; an empty string brings you to the jumping phase.");
            while (true) {
                System.out.print("  Participant name: ");
                String name = reader.nextLine();
                if (name.equals(""))
                    break;
                tourny.addJumper(name);
            }
        }
    }
    
    public void runTournament() {
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String cmd = reader.nextLine();
            if (!cmd.equals("jump"))
                break;
            System.out.println();
            System.out.println("Round " + (tourny.getRound() + 1));
            System.out.println();
            tourny.printJumpOrder();
            System.out.println();
            tourny.newRound();
            tourny.printRoundResults();
            System.out.println();            
        }
    }
    
    public void printResults() {
        tourny.printFinal();
    }
}
