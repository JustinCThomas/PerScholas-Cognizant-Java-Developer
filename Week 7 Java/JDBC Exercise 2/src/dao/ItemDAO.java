package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Item;
import utils.OracleQueries;

public class ItemDAO {
	public List<Item> getItemsInStock() throws SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		List<Item> items = new ArrayList<Item>();
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETITEMSINSTOCK);
			result = stmt.executeQuery();
			while (result.next()) {
				Item item = new Item();
				item.setId(result.getInt(1));
				item.setName(result.getString(2));
				item.setQuantity_in_stock(result.getInt(3));
				item.setPrice(result.getDouble(4));
				items.add(item);
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
		return items;
	}
	
	public boolean updateQuantityInStock(Integer item_id, Integer new_quantity_in_stock) throws SQLException{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		int success = 0;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.UPDATEITEMQUANTITY);
			stmt.setInt(1, new_quantity_in_stock);
			stmt.setInt(2, item_id);
			
			success = stmt.executeUpdate();
			
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

		return success > 0;
	}
}
