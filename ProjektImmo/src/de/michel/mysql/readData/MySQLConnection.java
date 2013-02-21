package de.michel.mysql.readData;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MySQLConnection {
 
    private static Connection conn = null;
 
    // Hostname
    private static String dbHost = "127.0.0.1";
 
    // Port -- Standard: 3306
    private static String dbPort = "3306";
 
    // Datenbankname
    private static String database = "testdb";
 
    // Datenbankuser
    private static String dbUser = "root";
 
    // Datenbankpasswort
    private static String dbPassword = "pw1";
 
    private MySQLConnection() {
        try {
 
        	
            // Datenbanktreiber für ODBC Schnittstellen 
            Class.forName("com.mysql.jdbc.Driver");
             
            // Verbindung zur ODBC-Datenbank 'testdb' herstellen.

            conn = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":"
                    + dbPort + "/" + database + "?" + "user=" + dbUser + "&"
                    + "password=" + dbPassword);
        } catch (ClassNotFoundException e) {
            System.out.println("Treiber nicht gefunden");
        } catch (SQLException e) {
            System.out.println("Connect nicht moeglich");
        }
    }
     
    public static void insertName(String firstName, String lastName)
    {
        conn = getInstance();
         
        if(conn != null)
        {
            // Anfrage-Statement erzeugen.
            Statement query;
            try {
                query = conn.createStatement();
 
                // Ergebnistabelle erzeugen und abholen.
                String sql = "INSERT INTO actor(first_name, last_name) VALUES('" + firstName + "', '" + lastName +"')";
                query.executeUpdate(sql);
                 
                // Es wird der letzte Datensatz abgefragt
                ResultSet result = query.executeQuery("SELECT actor_id, first_name, last_name FROM actor ORDER BY actor_id desc LIMIT 1");
                 
                // Wenn ein Datensatz gefunden wurde, wird auf diesen Zugegriffen 
                if(result.next())
                {
                    System.out.println("(" + result.getInt(1) + ")" + result.getString(2) + " " + result.getString(3));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    private static Connection getInstance()
    {
        if(conn == null)
            new MySQLConnection();
        return conn;
    }
    
       
    
    /**
     * Schreibt die Namensliste in die Konsole
     */
    public static void printNameList() 
    {
        conn = getInstance();
         
        if(conn != null)
        {
            // Anfrage-Statement erzeugen
            Statement query;
            try {
                query = conn.createStatement();
 
                // Ergebnistabelle erzeugen und abholen.
                String sql = "SELECT Name, Vorname, ID " + "FROM user "
                        + "ORDER BY Name";
                ResultSet result = query.executeQuery(sql);
 
                // Ergebnissätze durchfahren und anzeigen
                while (result.next()) {
                    String Vorname = result.getString("Name"); 
                    String Name = result.getString("Vorname");
                    String ID = result.getString("ID");
                    String name = "Mitarbeiterliste: "+Name+ ", " + Vorname+ ", " +ID;
                    System.out.println(name);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}