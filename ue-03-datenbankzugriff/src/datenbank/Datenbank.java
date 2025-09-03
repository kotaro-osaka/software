package datenbank;

import java.sql.*;
import java.time.LocalDate;

public class Datenbank {
	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/kunden";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static void printKundenstamm() {
    	try(Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD)) {
    		System.out.println("Erfolgreich mit Datenbank verbunden");
    		
    		String query = "SELECT * FROM kunde ORDER BY kunde.Kundennummer";
    		Statement stmt = conn.createStatement();
    		ResultSet rs = stmt.executeQuery(query);
    		
    		int columns = rs.getMetaData().getColumnCount();
    		for (int i = 1; i <= columns; i+=1) {
    			System.out.println(String.format("%-15s", rs.getMetaData().getColumnLabel(i)));
    		}
    		
    		System.out.print("\n");
    		System.out.println("------------------------------");
    		
    		while(rs.next()) {
    			for (int i = 1; i <= columns; i++) {
    				System.out.println(String.format("%-15s", rs.getString(i)));
    				System.out.println();
    			}
    		}
    		stmt.close();
    	} catch(SQLException ex) {
    		System.err.println(ex.getErrorCode() + ex.getMessage());
    	}
    }
    
    public static void insertKunde(int kundennummer, String vorname, String nachname, LocalDate gebDatum, String strasse, LocalDate kundeSeit, int plzId, int geschId, int famStaId, int aboId) {
    	try(Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD)) {
    		String query = "INSERT INTO kunde (Kundennummer, Vorname, Nachname, GebDatum, Straße, KundeSeit, PlzID, GeschID, FamStaID, AboID) VALUES ('" + kundennummer + "', '" + vorname + "', '" + nachname + "', '" + gebDatum + "', '" + strasse + "', '" + kundeSeit + "', '" + plzId + "', '" + geschId + "', '" + famStaId + "', '" + aboId + "');";
    		Statement stmt = conn.createStatement();
    		stmt.execute(query);
    		stmt.close();
    	} catch (SQLException ex) {
    		System.err.println(ex.getErrorCode() + ex.getMessage());
    	}
    }
}
