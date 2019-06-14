package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection inspector = new WordInspection(file);
        System.out.println("word count:");
        System.out.println(inspector.wordCount());
        System.out.println("*****");
        System.out.println("words with z:");
        printList(inspector.wordsContainingZ());
        System.out.println("*****");
        System.out.println("words ending in L:");
        printList(inspector.wordsEndingInL());
        System.out.println("*****");
        System.out.println("palindromes:");
        printList(inspector.palindromes());
        System.out.println("*****");
        System.out.println("words with all vowels:");
        printList(inspector.wordsWhichContainAllVowels());
    }
    
    public static void printList(List<String> list) {
        for (String word : list) {
            System.out.println(word);
        }
    }
}
