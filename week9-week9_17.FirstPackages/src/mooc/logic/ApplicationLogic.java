/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package mooc.logic;

import mooc.ui.UserInterface;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class ApplicationLogic {
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }
}
