
import java.util.HashMap;
import java.util.HashSet;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return null;
        }
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        HashSet<String> ownerList = new HashSet<String>();
        for (String owner : owners.values()) {
            ownerList.add(owner);
        }
        for (String owner : ownerList) {
            System.out.println(owner);
        }
    }
}
