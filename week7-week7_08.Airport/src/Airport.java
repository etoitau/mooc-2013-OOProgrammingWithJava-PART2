
import java.util.ArrayList;
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

public class Airport {
    private HashMap<String, Airplane> planes;
    private ArrayList<Flight> flights;
    
    public Airport() {
        planes = new HashMap<String, Airplane>();
        flights = new ArrayList<Flight>();
    }
    
    public void addAirplane(Airplane plane) {
        planes.put(plane.getId(), plane);
    }
    
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    
    public Airplane getAirplane(String id) {
        return planes.get(id);
    }
    
    public HashMap<String, Airplane> getAirplanes() {
        return planes;
    }
    
    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
