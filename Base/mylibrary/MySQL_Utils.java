package mylibrary;

import java.sql.*;
import java.util.*;

public abstract class MySQL_Utils extends Utils {
	
	public static boolean execute (String sql) throws SQLException {
		try(PreparedStatement ps = DB_Connection.connection.prepareStatement(sql)){
			ps.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
			return false;
		}
	}	
	public static Map<Integer, Object[]> get_query (String sql) throws SQLException {
		try{
			PreparedStatement ps = DB_Connection.connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int column_count = rsmd.getColumnCount();
			Map<Integer, Object[]> query = new TreeMap<Integer, Object[]>();
			while(rs.next()) {
				Object[] row = new Object[column_count];
				for(int i = 1; i <= column_count; i++) {
					row[i] = rs.getObject(i);
				}
				query.put(rs.getRow(), row);
			}
			return query;
		} catch (SQLException e) {
			System.out.println("ERROR: " + e.getMessage());
			return null;
		}
	}
}
