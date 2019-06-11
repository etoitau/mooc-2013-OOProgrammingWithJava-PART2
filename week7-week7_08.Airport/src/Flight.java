/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Flight {
    private Airplane airplane;
    private String departCode, destCode;
    
    public Flight(Airplane airplane, String departCode, String destCode) {
        this.airplane = airplane;
        this.departCode = departCode;
        this.destCode = destCode;
    }
    
    public String toString() {
        return airplane.toString() + " (" + departCode + "-" + destCode + ")";
    }
}
