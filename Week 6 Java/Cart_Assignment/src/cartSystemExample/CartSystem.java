package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class CartSystem extends TheSystem{
    public CartSystem() throws FileNotFoundException {
    }
    public void display() {
    	HashMap<String, Item> hm = this.getItemCollection();
    	
    	if (hm.isEmpty()) {
    		System.out.format("Sub Total: 0.0\r\n");
    		System.out.format("Tax: 0.0\r\n");
    		System.out.format("Total: 0.0\r\n");
    	}
    	for (Item item: hm.values()) {
    		
    		double subtotal = item.getItemPrice() * item.getQuatity();
    		double tax = subtotal * 0.05;
    		double total = subtotal + tax;
    		System.out.println(item.getItemName() + ": " + item.getQuatity());
    		System.out.format("Sub Total: %s\r\n", subtotal);
    		System.out.format("Tax: %.2f\r\n", tax);
    		System.out.format("Total: %.2f\r\n", total);
    		System.out.println();
    	}
    }
}
