package utils;

public class OracleQueries {
	public final static String GETITEMSINSTOCK = "SELECT * FROM Item "
			+ "WHERE quantity_in_stock > 0";
	
	public final static String UPDATEITEMQUANTITY = "UPDATE Item SET "
			+ "quantity_in_stock = quantity_in_stock - ? "
			+ "WHERE id = ?";
	
	public final static String CHECKQUANTITY = 
			"SELECT quantity_in_stock FROM Item "
			+ "WHERE name = ?";
	
	public final static String CREATEORDER = 
			"INSERT INTO ORDER_TABLE (item_id, quantity) "
			+ "VALUES (?, ?)";
}
