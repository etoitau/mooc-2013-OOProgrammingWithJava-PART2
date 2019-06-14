/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Analysis {
    private File file;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() {
        Scanner reader;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return 0;
        }
        int count = 0;
        while (reader.hasNext()) {
            String temp = reader.nextLine();
            count++;
        }
        reader.close();
        return count;
    }
    
    public int characters() {
        Scanner reader;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return 0;
        }
        int count = 0;
        while (reader.hasNext()) {
            String temp = reader.nextLine();
            count += temp.length() + 1;
        }
        reader.close();
        return count;
    }
}
