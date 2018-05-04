package mainentry;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dao.ItemDAO;
import dao.OracleConnection;
import dao.OrderDAO;
import model.Item;
import utils.OracleQueries;

public class Runner {
	public static void main(String[] args) throws SQLException {
		ItemDAO iDAO = new ItemDAO();
		boolean isRunning = true;
		HashMap<Integer, Item> hm = new HashMap<Integer, Item>();
		
		HashMap<Integer, Integer> cart = new HashMap<Integer, Integer>(); 
		
		Scanner sc = new Scanner(System.in);
		
		List<Item> itemsInStock = iDAO.getItemsInStock();
		for (Item item: itemsInStock) {
			hm.put(item.getId(), item);
		}
		
		loop:
		while (isRunning) {	
			System.out.println("What would you like to do?");
			System.out.println("1: Add Item to Cart \r\n"
					+ "2: Display Cart \r\n"
					+ "3: Checkout \r\n"
					+ "4: Quit \r\n");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1":
				addItemToCart(sc, itemsInStock, cart);
				itemsInStock = iDAO.getItemsInStock();
				for (Item item: itemsInStock) {
					hm.put(item.getId(), item);
				}
				displayCart(cart, hm);
				break;
			case "2":
				displayCart(cart, hm);
				break;
			case "3":
				checkout(cart);
				break;
			case "4":
				break loop;
			default:
				System.out.println("Invalid input. "
				+ "Select a valid option please.\r\n");
			}
		}
		System.out.println("The program has ended.");
	}
	
	public static void addItemToCart(Scanner sc, List<Item> itemsInStock, HashMap<Integer, Integer> cart) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		System.out.println(itemsInStock);
		System.out.println("These are the items that are currently in stock:");
		
		for (int i = 0; i < itemsInStock.size(); i++) {
			String itemInformation = String.format("Option %s | ID: %s | name: %7s | available_quantity: %s | price: $%.2f",
					i + 1,
					itemsInStock.get(i).getId(), 
					itemsInStock.get(i).getName(), 
					itemsInStock.get(i).getQuantity_in_stock(), 
					itemsInStock.get(i).getPrice());
			System.out.println(itemInformation);
		}
		System.out.println();
		
		System.out.println("Which item on the menu would you like to buy?");
		int choice = sc.nextInt();
		String itemName = "";
		Item chosenItem = null;
		
		for (int i = 1; i <= itemsInStock.size(); i++) {
			if (choice == i) {
				chosenItem = itemsInStock.get(choice - 1);
				itemName = chosenItem.getName();
				break;
			}
		}
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.CHECKQUANTITY);
			stmt.setString(1, itemName);
			result = stmt.executeQuery();
			
			System.out.println("How many of those do you want to buy?");
			int amountToBuy = sc.nextInt();
			sc.nextLine();
			
			if (result.next()) {
				if (amountToBuy <= result.getInt(1)) {
					cart.put(chosenItem.getId(), amountToBuy);
					System.out.println("Item was successfully added to cart.");
				} else {
					System.out.format("Sorry, there are only %s of those.", 
						itemsInStock.get(choice - 1).getQuantity_in_stock());
				}
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {

			e.printStackTrace();
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}	
	}
	
	public static void checkout(HashMap<Integer, Integer> hm) throws SQLException {
		OrderDAO oDAO = new OrderDAO();
		ItemDAO iDAO = new ItemDAO();
		if (oDAO.createOrder(hm)) {
			System.out.println("Order Created.");
		} else {
			System.out.println("Order was not created.");
		}
		
		
		for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			if (iDAO.updateQuantityInStock(entry.getKey(), entry.getValue())) {
				System.out.println("Item updated.");
			} else {
				System.out.println("Item was not updated.");
			}
		}
		
		
	}
	
	public static void displayCart(HashMap<Integer, Integer> cart, HashMap<Integer, Item> hm) {
		if (!cart.isEmpty()) {
			System.out.println("Here's what is inside of your cart: ");			
			for (Map.Entry<Integer, Integer> entry: cart.entrySet()) {
				Item item = hm.get(entry.getKey());
				String itemInformation = String.format("name: %s | amount inside cart: %s | price: $%.2f",
						item.getName(), 
						entry.getValue(),
						item.getPrice());
				System.out.println(itemInformation);
			}
		} else {
			System.out.println("The cart is currently empty.\r\n");
		}
		System.out.println();
	}
}
