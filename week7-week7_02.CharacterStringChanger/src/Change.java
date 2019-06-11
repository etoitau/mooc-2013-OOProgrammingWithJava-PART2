/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Change {
        private char from, to;
        
        public Change(char fromCharacter, char toCharacter) {
            this.from = fromCharacter;
            this.to = toCharacter;
        }
        
        public String change(String characterString) {
            return characterString.replace(from, to);
        }
    }
