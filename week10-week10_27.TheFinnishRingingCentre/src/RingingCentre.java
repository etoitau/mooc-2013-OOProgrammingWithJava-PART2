
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class RingingCentre {
    private Map<Bird, List<String>> observations;
    
    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        if (!observations.containsKey(bird)) {
            observations.put(bird, new ArrayList<String>());
        }
        observations.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
        if (observations.containsKey(bird)) {
            System.out.println(bird + " observations: " + observations.get(bird).size());
            for (String place : observations.get(bird)) {
                System.out.println(place);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
        
    }
}
