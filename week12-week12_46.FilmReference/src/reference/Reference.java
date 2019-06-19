/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.comparator.PersonalFilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Reference {
    private RatingRegister register;
    
    public Reference(RatingRegister register) {
        this.register = register;
    }
    
    public Film recommendFilm(Person person) {
        // if no review info on person, just give average best
        if (!register.reviewers().contains(person))
            return getDefaultTop();
        // get info about how similar everyone is to this person
        Map<Person, Integer> similarity = similarPeople(person);
        // sort people by similarity
        List<Person> people = new ArrayList<Person>(similarity.keySet());
        Collections.sort(people, new PersonComparator(similarity));
        // identify most similar person (besides self)
        Person match;
        if (people.get(0).equals(person)) {
            match = people.get(1);
        } else {
            match = people.get(0);
        }
        // go through films match has seen in decending order of preference
        for (Film film : personTopFilms(match)) {
            // skip films person has seen
            if (register.getPersonalRatings(person).containsKey(film))
                continue;
            // check it's reviewed positively
            if (register.getPersonalRatings(match).get(film).getValue() > 0) {
                return film;
            } else {
                return null;
            }
        }   
        return null;        
    }
    
    private Film getDefaultTop() {
        List<Film> films = register.films();
        Collections.sort(films, new FilmComparator(register.filmRatings()));
        return films.get(0);
    }
    
    private Map<Person, Integer> similarPeople(Person subject) {
        List<Person> people = register.reviewers();
        // if no other reviewers
        if (people.size() == 1)
            return null;
        Map<Person, Integer> similarity = new HashMap<Person, Integer>();
        // get this person's reviews
        Map<Film, Rating> subjectRatings = register.getPersonalRatings(subject);
        // for each film this person has reviewed
        for (Map.Entry<Film, Rating> pair : subjectRatings.entrySet()) {
            // go through all people looking for films in common and adding to 
            //   similarity map
            for (Person person : people) {
                if (register.getPersonalRatings(person).containsKey(pair.getKey())) {
                    int thisSim = register.getPersonalRatings(person).get(pair.getKey()).getValue() * subjectRatings.get(pair.getKey()).getValue();
                    if (!similarity.containsKey(person)) {
                        similarity.put(person, thisSim);
                    } else {
                        similarity.put(person, similarity.get(person) + thisSim);
                    }
                }
            }
        }
        return similarity;
    }
    
    private List<Film> personTopFilms(Person person) {
        List<Film> films = new ArrayList<Film>(register.getPersonalRatings(person).keySet());
        Collections.sort(films, new PersonalFilmComparator(register.getPersonalRatings(person)));
        return films;
    }
}
