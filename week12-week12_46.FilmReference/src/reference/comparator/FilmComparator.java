/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package reference.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    
    @Override
    public int compare(Film o1, Film o2) {
        if (Math.abs(filmAverage(o1) - filmAverage(o2)) < 0.01)
            return 0;
        if (filmAverage(o1) < filmAverage(o2))
            return 1;
        return -1;
    }
    
    public double filmAverage(Film film) {
        int sum = 0;
        for (Rating rating : ratings.get(film))
            sum += rating.getValue();
        return (double) sum / ratings.get(film).size();
    }

}
