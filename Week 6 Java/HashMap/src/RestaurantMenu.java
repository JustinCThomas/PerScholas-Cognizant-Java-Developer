import java.util.HashMap;
import java.util.Scanner;

public class RestaurantMenu {
	public static void viewOrder(HashMap<String, Integer> map) {
		System.out.println("The restaurant has this many units of each food/beverage item.");
		map.forEach((keys, values) ->{
			System.out.println(keys + ": " + values);
		});
	}
	
	public static boolean addToCart(HashMap<String, Integer> map, Scanner sc) {
		System.out.println("What would to like to order?");
		System.out.println("1: Fries\r\n2: Hot Dogs\r\n"
				+ "3: Hamburger\r\n4: Sandwiches\r\n"
				+ "5: Soda");
		int orderNum = sc.nextInt();
		
		String foodItem = "";
		
		switch(orderNum) {
		case 1:
			foodItem += "Fries";
			break;
		case 2:
			foodItem += "Hot Dogs";
			break;
		case 3:
			foodItem += "Hamburgers";
			break;
		case 4:
			foodItem += "Sandwiches";
			break;
		case 5:
			foodItem += "Soda";
			break;
		default:
			System.out.println("Sorry, we only have 5 things on the menu today.");
			return false;
		}
		
		System.out.println("You've chosen " + foodItem + "."
		+ " How many more units of that item do you want to order?");
		int units = sc.nextInt();
		map.put(foodItem, map.get(foodItem) + units);
		viewOrder(map);
		
		System.out.println();
		System.out.println("Do you want to continue ordering?\r\n"
		+ "1: yes\r\nAny other key: no");
		String choice = sc.next();
		
		switch(choice) {
		case "1": 
			return true;
		default:
			return false;
		}
	}
}
