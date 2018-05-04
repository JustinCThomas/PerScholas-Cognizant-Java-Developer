package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import utils.OracleQueries;

public class OrderDAO {
	public boolean createOrder(Map<Integer, Integer> hm){
		Connection conn = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.CREATEORDER);
			
			for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
				stmt.setInt(1, entry.getKey());
				stmt.setInt(2, entry.getValue());
				result = stmt.executeUpdate();
			}
		
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}

		return result > 0;
	}
}
