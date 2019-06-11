
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */
public class Reader {
    private BufferedReader reader;
    
    public Reader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public String readString() {
        while (true) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                System.out.println("Error, try again");
            }
        }
    }
    
    public int readInteger() {
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Error, try again.");
            } catch (NumberFormatException e) {
                System.out.println("Not an integer, try again");
            }
        }
    }
}
