
import java.util.ArrayList;
import java.util.Collections;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for(Card card: cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public int sumValue() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand otherHand) {
        return Integer.compare(this.sumValue(), otherHand.sumValue());
    }
    
    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
