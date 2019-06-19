/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class PersonalFilmComparator implements Comparator<Film> {
    private Map<Film, Rating> ratings;
    
    public PersonalFilmComparator(Map<Film, Rating> ratings) {
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film o1, Film o2) {
        if (ratings.get(o2).getValue() == ratings.get(o1).getValue())
            return 0;
        if (ratings.get(o2).getValue() > ratings.get(o1).getValue())
            return 1;
        return -1;
    }
}
