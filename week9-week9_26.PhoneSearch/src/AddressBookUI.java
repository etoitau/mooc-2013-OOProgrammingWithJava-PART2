
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
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

public class AddressBookUI {
    private Scanner reader;
    private AddressBook book;
    
    public AddressBookUI(AddressBook book) {
        reader = new Scanner(System.in);
        this.book = book;
    }
    
    public void printIntro() {
        System.out.println("phone search\n" +
            "available operations:\n" +
            " 1 add a number\n" +
            " 2 search for a number\n" +
            " 3 search for a person by phone number\n" +
            " 4 add an address\n" +
            " 5 search for personal information\n" +
            " 6 delete personal information\n" +
            " 7 filtered listing\n" +
            " x quit");
    }
    
    public void start() {
        printIntro();
        while (true) {
            System.out.print("\ncommand: ");
            String cmd = reader.nextLine(); 
            if (cmd.equals("1")) {
                oneAddNumber();
            } else if (cmd.equals("2")) {
                twoNumberByName();
            } else if (cmd.equals("3")) {
                threePersonByNumber();
            } else if (cmd.equals("4")) {
                fourAddAddress();
            } else if (cmd.equals("5")) {
                fiveInfoByPerson();
            } else if (cmd.equals("6")) {
                sixDeletePerson();
            } else if (cmd.equals("7")) {
                sevenSearchAll();
            } else if (cmd.equals("x")) {
                break;
            } else {
                System.out.println("command not recognized");
                printIntro();
            }
        } 
    }
    
    private void oneAddNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        book.addPhone(name, number);
    }
    
    private void twoNumberByName() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        Set<String> phones = book.getPhones(name);
        if (nullOrEmpty(phones)) {
            System.out.println("  not found");
        } else {
            for (String phone : phones) {
                System.out.println(" " + phone);
            }
        }
    }
    
    private void threePersonByNumber() {
        System.out.print("number: ");
        String number = reader.nextLine();
        Set<String> people = book.getNamesByPhone(number, true);
        if (nullOrEmpty(people)) {
            System.out.println(" not found");
        } else {
            for (String person : people) {
                System.out.println(" " + person);
            }
        }
    }
    
    private void fourAddAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        book.addStreet(name, street);
        book.addCity(name, city);
    }
    
    private void fiveInfoByPerson() {
        System.out.print("whose information: ");
        book.printPerson(reader.nextLine());
    }
    
    private void sixDeletePerson() {
        System.out.print("whose information: ");
        book.deletePerson(reader.nextLine());
    }
    
    private void sevenSearchAll() {
        System.out.print("keyword (if empty, all listed): ");
        Set<String> names = book.searchAll(reader.nextLine());
        if (nullOrEmpty(names)) {
            System.out.println(" keyword not found");
        } else {
            // has to be alphabetical, so convert to list and sort
            List<String> nameList = new ArrayList<String>(names);
            Collections.sort(nameList);
            for (String name : nameList) {
                System.out.println("");
                System.out.println(" " + name);
                book.printPerson(name);
            }
        }
    }
    
    private Boolean nullOrEmpty(Collection col) {
        return (col == null || col.isEmpty());
    }
    
}
