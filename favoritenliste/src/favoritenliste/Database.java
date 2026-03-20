package favoritenliste;

import java.sql.*;

public class Database {
	private static final String SQLITE_URL = "jdbc:sqlite:E:\\HeidiSQL_11.1_64_Portable\\amnetprimemovies.db";
	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/amnetprimemovies";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	/*public static short getDataSetSize(String query) {
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
    }*/
	
	public static boolean userExists(String username, String password, Boolean useSQLite) {
		String url;
		
		if (useSQLite) url = SQLITE_URL;
		else url = MYSQL_URL;
			
		try (Connection conn = DriverManager.getConnection(url, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT USER_ID, PASSWORD FROM benutzer WHERE USER_ID =\"" + username + "\" && PASSWORD = \"" + password + "\";")) {

			if (rs.next()) return true;
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.println("Error: " + ex.getMessage());
		}
		
		return false;
	}
	
	/*public static void printUserData() {
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
	}*/
}
