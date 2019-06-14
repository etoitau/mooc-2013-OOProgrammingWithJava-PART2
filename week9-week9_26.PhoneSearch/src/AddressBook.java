
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class AddressBook {
    private Map<String, Set<String>> phonesByName;
    private Map<String, String> streetByName;
    private Map<String, String> cityByName;
    
    public AddressBook() {
        phonesByName = new HashMap<String, Set<String>>();
        streetByName = new HashMap<String, String>();
        cityByName = new HashMap<String, String>();
    }
    
    public void addPhone(String name, String number) {
        if ( !phonesByName.containsKey(name) )
            phonesByName.put(name, new HashSet<String>());
        phonesByName.get(name).add(number);
    }
    
    public Set<String> getPhones(String name) {
        if (phonesByName.containsKey(name)) 
            return phonesByName.get(name);
        return null;
    }
    
    public Set<String> getNamesByPhone(String number, Boolean exact) {
        // search for everyone who uses a given phone number
        // if exact, only return exact matches on a full number, else find
        // all people with number which contains given number
        HashSet<String> names = new HashSet<String>();
        for (Map.Entry<String, Set<String>> entry : phonesByName.entrySet() ) {
            for (String phone : entry.getValue()) {
                if ( exact ) {
                    if ( phone.equals(number) ) {
                        names.add(entry.getKey());
                        break;
                    }
                } else {
                    if ( phone.contains(number) ) {
                        names.add(entry.getKey());
                        break;
                    }
                }
            }
        }
        return names;
    }
    
    public void addStreet(String name, String street) {
        streetByName.put(name, street);
    }
    
    public void addCity(String name, String city) {
        cityByName.put(name, city);
    }
    
    public Boolean checkPerson(String name) {
        if ( phonesByName.containsKey(name) )
            return true;
        if ( streetByName.containsKey(name) )
            return true;
        if ( cityByName.containsKey(name) )
            return true;
        return false;
    }
    
    public Set<String> searchPeople(String term) {
        Set<String> found = new HashSet<String>();
        for (String name: phonesByName.keySet()) {
            if (name.contains(term))
                found.add(name);
        }
        for (String name: streetByName.keySet()) {
            if (name.contains(term))
                found.add(name);
        }
        for (String name: cityByName.keySet()) {
            if (name.contains(term))
                found.add(name);
        }
        return found;
    }
    
    public void deletePerson(String name) {
        phonesByName.remove(name);
        streetByName.remove(name);
        cityByName.remove(name);
    }
    
    public void printAddress(String name) {
        if ( streetByName.containsKey(name) ) {
            System.out.println("  address: " + streetByName.get(name) + " " + cityByName.get(name));
        } else {
            System.out.println("  address unknown");
        }
    }
    
    public void printPerson(String name) {
        // print all of a person's available information (not name)
        if ( checkPerson(name) ) {
            printAddress(name);
            if ( phonesByName.containsKey(name) ) {
                System.out.println("  phone numbers:");
                for (String phone : phonesByName.get(name)) {
                    System.out.println("   " + phone);
                }
            } else {
                System.out.println("  phone number not found");
            }
        } else {
            System.out.println("  not found");
        }
    }
    
    public Set<String> searchNamesByAddress(String term) {
        Set<String> found = new HashSet<String>();
        for (Map.Entry<String, String> entry: streetByName.entrySet()) {
            if (entry.getValue().contains(term))
                found.add(entry.getKey());
        }
        for (Map.Entry<String, String> entry: cityByName.entrySet()) {
            if (entry.getValue().contains(term))
                found.add(entry.getKey());
        }
        return found;
    }
    
    public Set<String> searchAll(String term) {
        Set<String> foundNames = new HashSet<String>();
        // search in names
        foundNames.addAll(searchPeople(term));
        // search in phone numbers
        foundNames.addAll(getNamesByPhone(term, false));
        // search in addresses
        foundNames.addAll(searchNamesByAddress(term));
        return foundNames;
    }
}
