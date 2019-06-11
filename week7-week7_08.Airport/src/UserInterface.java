
import java.util.Scanner;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class UserInterface {
    private Airport airport;
    private Scanner reader;
    
    public UserInterface(Airport airport, Scanner reader) {
        this.airport = airport;
        this.reader = reader;
    }
    
    public void start() {
        airportPanel();
        flightService();
    }
    
    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String choice = reader.nextLine();
            if (choice.equals("1")) {
                addAirplane();
            } else if (choice.equals("2")) {
                addFlight();
            } else if (choice.equals("x")) {
                System.out.println();
                break;
            } else {
                System.out.println("Invalid input");
            }
        } 
    }
    
    private void flightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String choice = reader.nextLine();
            if (choice.equals("1")) {
                printPlanes();
            } else if (choice.equals("2")) {
                printFlights();
            } else if (choice.equals("3")) {
                printPlaneInfo();
            } else if (choice.equals("x")) {
                System.out.println();
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
    
    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        String cap = reader.nextLine();
        try {
            airport.addAirplane(new Airplane(id, Integer.parseInt(cap)));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String depart = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String dest = reader.nextLine();
        try {
            airport.addFlight(new Flight(airport.getAirplane(id), depart, dest));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void printPlanes() {
        for (Airplane plane : airport.getAirplanes().values()) {
            System.out.println(plane.toString());
        }
    }
    
    private void printFlights() {
        for (Flight flight : airport.getFlights()) {
            System.out.println(flight.toString());
        }
    }
    
    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        try {
            System.out.println(airport.getAirplane(id).toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
