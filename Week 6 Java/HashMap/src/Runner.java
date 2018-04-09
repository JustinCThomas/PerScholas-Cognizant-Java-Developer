import java.util.HashMap;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
//		Part 1
		HashMap<Integer, String> colors = ColorHM.createMap();
		
		System.out.println(ColorHM.showMapContents(colors)[0]);
		System.out.println(ColorHM.showMapContents(colors)[1]);
		
		colors.put(2, "Purple");
		
		System.out.println(ColorHM.showMapContents(colors)[0]);
		System.out.println(ColorHM.showMapContents(colors)[1]);
		
//		Part 2
		ColorHM.loopOverHashMap(colors);
		
//		Part 3
		
		HashMap<String, Integer> orderingMenu = new HashMap<String, Integer>();
		String[] placeholder = {"Hamburgers", "Hot Dogs", "Sandwiches", "Soda", "Fries"};
		for (String item: placeholder) {
			orderingMenu.put(item, 5);
		}
		
		placeholder = null;
		RestaurantMenu.viewOrder(orderingMenu);
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean keepRunning = true;
		while (keepRunning) {
			keepRunning = RestaurantMenu.addToCart(orderingMenu, sc);
		}
		System.out.println("Done ordering.");
	}
}
