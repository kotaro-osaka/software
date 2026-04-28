package favoritenliste;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
	private static final String SQLITE_URL = "jdbc:sqlite:H:\\HeidiSQL_11.1_64_Portable\\amnetprimemovies.db";
	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/amnetprimemovies";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static boolean userExists(String username, String password, Boolean useSQLite) {
		String url;

		if (useSQLite)
			url = SQLITE_URL;
		else
			url = MYSQL_URL;

		System.out.println("Using SQLite DB: " + SQLITE_URL);
		try (Connection conn = useSQLite ? DriverManager.getConnection(SQLITE_URL)
				: DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT USER_ID, PASSWORD FROM benutzer WHERE USER_ID =\"" + username
						+ "\" AND PASSWORD = \"" + password + "\";")) {

			if (rs.next())
				return true;

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.println("Error: " + ex.getMessage());
		}

		return false;
	}

	public static int getNumFilms(Boolean useSQLite) {
		String url;

		if (useSQLite)
			url = SQLITE_URL;
		else
			url = MYSQL_URL;

		try (Connection conn = DriverManager.getConnection(url, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM filme;")) {

			if (rs.next())
				return rs.getInt(1);

			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.print(ex.getMessage());
		}

		return 0;
	}
	
	public static List<Film> getFilms(boolean useSQLite) {
		List<Film> films = new ArrayList<>();
		
		String url;
		
		if (useSQLite)
			url = SQLITE_URL;
		else
			url = MYSQL_URL;
		
		try (Connection conn = DriverManager.getConnection(url, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT TITEL, ERSCHIENEN FROM filme ORDER BY TITEL;")) {
			
			while (rs.next()) {
				String title = rs.getString("TITEL");
				int year = rs.getInt("ERSCHIENEN");
				
				films.add(new Film(title, year));
			}
		} catch (SQLException ex) {
			System.err.print(ex.getMessage());
		}
		
		return films;
	}
}
