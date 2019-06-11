
import java.util.Comparator;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class SortAgainstSuitAndValue implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int out = Integer.compare(card1.getSuit(), card2.getSuit());
        if (out == 0)
            return card1.compareTo(card2);
        return out;
    }
}
