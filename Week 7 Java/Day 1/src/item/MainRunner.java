package item;

import java.sql.SQLException;
import java.util.List;

public class MainRunner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ItemDAO dao = new ItemDAO();
		Item item = dao.getItemById(2);
		System.out.println(item);
		
		System.out.println();
		
		List<Item> items = dao.getItemsCostingGreaterThan(5.33);
		System.out.println(items);
		
		System.out.println();
		
		List<Item> inStockItems = dao.getItemsInStock();
		System.out.println(inStockItems);
	}

}
