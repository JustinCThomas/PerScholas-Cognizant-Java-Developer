package cartSystemExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

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
	    	if (checkAvailability(item, item.getQuatity())){
	    		int currentQuantity = item.getQuatity();
	    		itemCollection.get(item.getItemName()).setQuatity(currentQuantity + 1);
	    		System.out.println("Item successfully added.");
	    		return false;
	    	} else {
	    		return true;
	    	}
    	} else {
    		try {
    			itemCollection.put(item.getItemName(), item);
    			System.out.println("Item successfully added.");
    		} catch (NullPointerException e){
    			System.out.println("An item of that name does not currently exist.");
    			System.out.println("Please type the item name exactly as shown.");
    		} 
    		return true;
    	}
    }
    
    public Item remove(String itemName) {
        if (itemCollection.containsKey(itemName)) {
        	Item item = itemCollection.remove(itemName);
        	System.out.println(itemName + " has been successfuly removed.");
        	return item;
        } else {
        	System.out.println(itemName + " was not found.");
        	System.out.println("Nothing has been removed.");
        	return null;
        }
    }
    
    public Boolean checkAvailability(Item item, Integer current) {
    	if (1 + current > item.getAvailableQuatity()) {
    		System.out.println(String.format("System is unable to add"
    				+ " %s %s.\r\n"
    				+ "System can only add %s %s.", 
    				1, item.getItemName(),
    				item.getAvailableQuatity() - item.getQuatity(), 
    				item.getItemName()));
    		return false;
    	} 
    	return true;    	
    }
}
