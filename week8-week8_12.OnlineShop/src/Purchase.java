/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Purchase {
    private String product;
    private int amount, unitPrice;
    
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return amount * unitPrice;
    }
    
    public void increaseAmount() {
        amount++;
    }
    
    public String toString() {
        return product + ": " + amount;
    }
    
    public String getProduct() {
        return product;
    }
}
