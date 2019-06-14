/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class WordInspection {
    private List<String> words;
    
    public WordInspection(File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        words = new ArrayList<String>();
        while (reader.hasNext()) {
            words.add(reader.nextLine());
        }
        reader.close();
    }
    
    public int wordCount() {
        return words.size();
    }
    
    public List<String> wordsContainingZ() {
        List<String> output = new ArrayList<String>();
        for (String word : words) {
            if (word.contains("z"))
                output.add(word);
        }
        return output;
    }
    
    public List<String> wordsEndingInL() {
        List<String> output = new ArrayList<String>();
        for (String word : words) {
            if (word.charAt(word.length() - 1) == 'l')
                output.add(word);
        }
        return output;
    }
    
    public List<String> palindromes() {
        List<String> output = new ArrayList<String>();
        for (String word : words) {
            boolean isPalindrome = true;
            for (int i = 0; i < word.length() / 2; i++) {
                isPalindrome = word.charAt(i) == word.charAt(word.length() - 1 - i);
                if (!isPalindrome)
                    break;
            }
            if (isPalindrome)
                output.add(word);
        }
        return output;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> output = new ArrayList<String>();
        for (String word : words) {
            boolean containsAll = true;
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'ä', 'ö'};
            for (char vowel : vowels) {
                boolean hasVowel = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == vowel) {
                        hasVowel = true;
                        break;
                    }
                }
                if (!hasVowel) {
                    containsAll = false;
                    break;
                }
            }
            if (containsAll) {
                output.add(word);
            }
        }
        return output;
    }
}
