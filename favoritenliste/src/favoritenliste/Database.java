package favoritenliste;

import java.sql.*;

public class Database {
	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/amnetprimemovies";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static short getDataSetSize(String query) {
    	String countQuery = "SELECT COUNT(*) AS row_count FROM (" + query + ") AS dynamic_query";
        short rows = -1;
        
        try (Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(countQuery);
            
            if (rs.next()) {
                rows = rs.getShort("row_count");
            } else {
                System.err.println("No rows returned from the count query.");
            }
            
			rs.close();
			stmt.close();
			conn.close();
        } catch (SQLException ex) {
            System.err.println("Error Code " + ex.getErrorCode() + " | " + ex.getMessage());
        }
        
        return rows;
    }
	
	public static LoginData[] getLoginData(String query) {
		short rows = getDataSetSize(query);
		
		LoginData[] loginData = new LoginData[rows];
		
		try (Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			int idx = 0;
			while (rs.next()) {
				String username = rs.getString("USER_ID");
				String password = rs.getString("PASSWORD");
				
				loginData[idx] = new LoginData(username, password);
				
				idx += 1;
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.println("Error: " + ex.getMessage());
		}
		
		return loginData;
	}
	
	public static void printUserData() {
		try (Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD)) {
			System.out.println("Erfolgreich mit Datenbank verbunden");
			
			String query = "SELECT * FROM benutzer ORDER BY benutzer.USER_ID;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			int columns = rs.getMetaData().getColumnCount();
			for (int i = 1; i <= columns; i += 1) {
				System.out.println(String.format("%-15s", rs.getMetaData().getColumnLabel(i)));
			}
			
			System.out.print("\n");
			System.out.println("------------------------------");
			
			while (rs.next()) {
				for (int i = 1; i <= columns; i++) {
					System.out.println(String.format("%-15s", rs.getString(i)));
					System.out.println();
				}
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.println(ex.getErrorCode() + ex.getMessage());
		}
	}
}
