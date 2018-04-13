package cartSystemExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;
    
    protected TheSystem() throws FileNotFoundException {
        itemCollection = new HashMap<String, Item>();
        if (getClass().getSimpleName().equals("AppSystem")) {
        	FileReader fr = new FileReader("sample.txt");
        	BufferedReader bufferedReader = new BufferedReader(fr);
        	
        	try {
				while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					String[] lines = line.split("\\s "); 
					itemCollection.put(lines[0], 
					new Item(lines[0], lines[1],
					Double.parseDouble(lines[2]), 
					Integer.parseInt(lines[3])));
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
    	HashMap<String, Item> hm = new HashMap<String, Item>();
    	for (String key: itemCollection.keySet()) {
    		hm.put(key, itemCollection.get(key));
    	}
    	return hm;
    }
    
    public void setItemCollection(HashMap<String, Item> copy ){
      itemCollection = copy;
    }
    
    public Boolean add(Item item) {
      if (itemCollection.containsValue(item)) {
    	  if (item.getQuatity() < item.getAvailableQuatity()) {
    		  int currentQuantity = item.getQuatity();
    		  itemCollection.get(item.getItemName()).setQuatity(currentQuantity + 1);
    		  return true;
    	  } else {
    		  return false;
    	  }
      } else {
    	  itemCollection.put(item.getItemName(), item);
    	  return true;
      }
    }
    
    public Item remove(String itemName) {
        Item item = null;
        if (itemCollection.containsKey(itemName)) {
        	item = itemCollection.remove(itemName);
        	return item;
        } else {
        	return null;
        }
    }
    
    public Boolean checkAvailability(Item item, Integer current) {
    	if (item.getQuatity() + current > item.getAvailableQuatity()) {
    		System.out.println(String.format("System is unable to add"
    				+ "%s %s.\r\n"
    				+ "System can only add %s %s.", 
    				item.getQuatity(), item.getItemName(),
    				item.getAvailableQuatity() - item.getQuatity(), 
    				item.getItemName()));
    		return false;
    	} 
    	return true;    	
    }
}
