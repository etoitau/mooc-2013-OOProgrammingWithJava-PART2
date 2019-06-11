/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(10);
        

        box1.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box1.add( new Book("Robert Martin", "Clean Code", 1) );
        
        box2.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box2.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        
        box1.add(box2);

        System.out.println( box1 );
    }
}
