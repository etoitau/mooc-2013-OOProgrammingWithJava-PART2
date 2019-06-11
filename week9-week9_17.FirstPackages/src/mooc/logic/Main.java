/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package mooc.logic;

import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
