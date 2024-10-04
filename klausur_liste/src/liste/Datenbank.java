// Kotaro Osaka

package liste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datenbank {
	private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/liste";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Ort[] orte = new Ort[getDataSetSize("SELECT * FROM orte")];
    private static boolean orteIsFilled = false;
	
    // Data Set Groesse ermitteln
    private static short getDataSetSize(String query) {
    	String countQuery = "SELECT COUNT(*) AS row_count FROM (" + query + ") AS dynamic_query;";
    	short rows = -1;
    	
        try (Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(countQuery)) {
        	
            if (rs.next()) {
                rows = rs.getShort("row_count");
            } else {
                System.err.println("No rows returned from count query");
            }
        } catch (SQLException ex) {
            System.err.println("Error Code " + ex.getErrorCode() + " | " + ex.getMessage());
        }

        return rows;
    }

    // Aufgabe 2
    public static Ort[] liesOrte() {
    	String query = "SELECT * FROM orte";
        short rows = getDataSetSize(query);

        Ort[] orte = new Ort[rows];

        try (Connection conn = DriverManager.getConnection(MYSQL_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            int kundenlisteIdx = 0;
            while (rs.next()) {
            	String plz = rs.getString("PLZ");
            	String ort = rs.getString("ORT");

                orte[kundenlisteIdx] = new Ort(plz, ort);

                kundenlisteIdx++;
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        
        return orte;
    }
    
    // Aufgabe 4
    public static void liesOrteEinmalig() {
    	if (orteIsFilled == false) {
    		orte = liesOrte();
    		orteIsFilled = true;
    	} else {
    		System.out.println("Liste wurde bereits ausgelesen");
    	}
    }
    
    // Zugriff auf Liste, die durch \"liesOrteEinmalig()\" gefuellt wird
    public static Ort[] getOrte() {
    	if (orteIsFilled = true) {
    	} else {
    		System.out.println("Liste muss zuerst mit \"liesOrteEinmalig()\" ausgelesen werden");
    	}
    	
    	return orte;
    }
}