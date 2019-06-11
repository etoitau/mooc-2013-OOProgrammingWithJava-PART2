
import java.io.File;
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

public class Printer {
    private String fileName;
    private File file;
    
    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
        file = new File(fileName);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            if (line.contains(word))
                System.out.println(line);
        }
        reader.close();
    }
}
