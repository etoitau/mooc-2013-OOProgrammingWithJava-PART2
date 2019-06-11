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
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; i++) {
            Suitcase suitcase = new Suitcase(1000);
            suitcase.addThing(new Thing("brick", 1 + i));
            container.addSuitcase(suitcase);
        }
    }

}
