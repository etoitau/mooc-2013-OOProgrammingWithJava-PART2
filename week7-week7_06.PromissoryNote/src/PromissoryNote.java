
import java.util.HashMap;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class PromissoryNote {
    private HashMap<String, Double> loans;
    
    public PromissoryNote() {
        loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        loans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        return (loans.containsKey(whose)) ? loans.get(whose) : 0;
    }
}
