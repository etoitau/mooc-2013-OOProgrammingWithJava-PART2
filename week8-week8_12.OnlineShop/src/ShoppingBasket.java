
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

public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket() {
        purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, new Purchase(product, 1, price));
        }
    }
    
    public int price() {
        int price = 0;
        for (Purchase purchase : purchases.values()) {
            price += purchase.price();
        }
        return price;
    }
    
    public void print() {
        for (Purchase purchase : purchases.values()) {
            System.out.println(purchase);
        }
    }
    
    
}
