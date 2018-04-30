package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
	public Item getItemById(int id) throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		String ById = "SELECT * FROM Item "
				+ "WHERE id = ?";
		
		PreparedStatement stmt = conn.prepareStatement(ById);
		stmt.setString(1, Integer.toString(id));
		ResultSet result = stmt.executeQuery();
		
		Item item = null;
		
		if (result != null && result.next()) {
			item = new Item();
			String name = result.getString(2);
			int quantity_in_stock = result.getInt(3);
			double price = result.getDouble(4);
//			Item item = new Item(id, name, quantity_in_stock, price);
			item.setName(name);
			item.setQuantity_in_stock(quantity_in_stock);
			item.setPrice(price);
		}
		
		return item;
	}
	
	public List<Item> getItemsCostingGreaterThan(double price) throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		String UNDERPRICE = "SELECT * FROM Item "
				+ "WHERE price > ?";
		
		PreparedStatement stmt = conn.prepareStatement(UNDERPRICE);
		stmt.setString(1, Double.toString(price));
		ResultSet result = stmt.executeQuery();
		
		List<Item> items = new ArrayList<Item>();
		while(result != null && result.next()) {
			int id = result.getInt(1);
			String name = result.getString(2);
				int quantity_in_stock = result.getInt(3);
			double itemPrice = result.getDouble(4);
			items.add(new Item(id, name, quantity_in_stock, itemPrice));
		}
		
		return items;
	}
	
	public List<Item> getItemsInStock() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		String INSTOCK = "SELECT * FROM Item "
				+ "WHERE quantity_in_stock > 0";
		
		PreparedStatement stmt = conn.prepareStatement(INSTOCK);
		ResultSet result = stmt.executeQuery();	
		
		List<Item> items = new ArrayList<Item>();
		while(result != null && result.next()) {
			int id = result.getInt(1);
			String name = result.getString(2);
				int quantity_in_stock = result.getInt(3);
			double itemPrice = result.getDouble(4);
			items.add(new Item(id, name, quantity_in_stock, itemPrice));
		}
		
		return items;
		
	}
}
