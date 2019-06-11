/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */
public class Calculator {
    private Reader reader;
    private int count = 0;
    
    public Calculator() {
        reader = new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
                count++;
            } else if (command.equals("difference")) {
                difference();
                count++;
            } else if (command.equals("product")) {
                product();
                count++;
            }
        }

        statistics();
    }
    
    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println("sum of the values " + (value1 + value2));
        System.out.println();
    }
    
    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println("difference of the values " + (value1 - value2));
        System.out.println();
    }
    
    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        System.out.println("product of the values " + (value1 * value2));
        System.out.println();
    }
    
    private void statistics() {
        System.out.println("Calculations done " + count);
    }
}
