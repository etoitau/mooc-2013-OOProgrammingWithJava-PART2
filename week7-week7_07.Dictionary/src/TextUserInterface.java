
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

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        System.out.println();
        
        while (true) {
            System.out.print("Statement: ");
            String statement = reader.next();
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                add();
            } else if (statement.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
                System.out.println();
            }
        }
      
    }
    
    private void add() {
        System.out.print("In Finnish: ");
        String finn = reader.next();
        System.out.print("Translation: ");
        String trans = reader.next();
        System.out.println();
        dictionary.add(finn, trans);
    }  
    
    private void translate() {
        System.out.print("Give a word: ");
        String finn = reader.next();
        System.out.println("Translation: " + dictionary.translate(finn));
        System.out.println();
    }  
}
