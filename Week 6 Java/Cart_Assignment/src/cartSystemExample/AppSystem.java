package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class AppSystem extends TheSystem {
    public AppSystem() throws FileNotFoundException {
    }
    public void display() {
      HashMap<String, Item> current = this.getItemCollection();
      int counter = 1;
      
	  System.out.println("Item Name "
	  		+ "	        Item Description Item Price Available Quantity");
      for (Item val: current.values()) {
    	  String name = val.getItemName();
    	  String desc = val.getItemDesc();
    	  Double price = val.getItemPrice();
    	  Integer availQuantity = val.getAvailableQuatity();
    	  System.out.format("%s %-19s  	   %-8s      %-5s "
    	  		+ "         %-20s\r\n", 
    	  		counter, name, desc, price, availQuantity);
    	  counter++;
      }
    }
    
    public Boolean add(Item item) {
      if (this.getItemCollection().containsValue(item)) {
    	  System.out.format("Item %s is already in the system."
    	  , item.getItemName());
    	  return false;
      } 
      HashMap<String, Item> hm = this.getItemCollection();
      hm.put(item.getItemName(), item);
      this.setItemCollection(hm);
      return true;
    }
}
