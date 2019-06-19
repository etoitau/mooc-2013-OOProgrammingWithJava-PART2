/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class RatingRegister {
    private Map<Film, List<Rating>> ratings;
    private Map<Person, Map<Film, Rating>> personRatings;
    
    public RatingRegister() {
        ratings = new HashMap<Film, List<Rating>>();
        personRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if (!ratings.containsKey(film)) {
            ratings.put(film, new ArrayList<Rating>());
        } 
        ratings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        this.addPerson(person);
        if (!personRatings.get(person).containsKey(film)) {
            personRatings.get(person).put(film, rating);
            this.addRating(film, rating);
        }
    }
    
    public List<Rating> getRatings(Film film) {
        return ratings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return ratings;
    }
    
    private void addPerson(Person person) {
        if (!personRatings.containsKey(person)) {
            personRatings.put(person, new HashMap<Film, Rating>());
        }
    }
    
    public Rating getRating(Person person, Film film) {
        if (!personRatings.containsKey(person))
            return Rating.NOT_WATCHED;
        if (!personRatings.get(person).containsKey(film))
            return Rating.NOT_WATCHED;
        return personRatings.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personRatings.containsKey(person))
            return personRatings.get(person);
        return new HashMap<Film, Rating>();
    }
    
    public List<Person> reviewers() {
        return new ArrayList(personRatings.keySet());
    }
    
    public List<Film> films() {
        return new ArrayList(ratings.keySet());
    }
}
