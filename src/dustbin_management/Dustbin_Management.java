/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dustbin_management;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Manish
 */
public class Dustbin_Management {

    /**
     * @param args the command line arguments
     */
    public static List<cleaner> cleanerlist = new ArrayList<cleaner>();
    public static List<Dustbin> dustbinlist = new ArrayList<Dustbin>();
    public static List<Person> authlist = new ArrayList<Person>();
    public static List<String> logreport = new ArrayList<String>();
    
    public static int moisture_sensor=50;
    public static double ultra_sensor=50;
    public static int cleanerDelay=3;
    public static int dustbinDelay=50;
    
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        
        Update();
        
        
        home_page link = new home_page();
        link.setVisible(true);
    }

    public static void Update() {
        // Loading data from database
        cleanerlist = new ArrayList<cleaner>();
        dustbinlist = new ArrayList<Dustbin>();
        authlist = new ArrayList<Person>();

        try {
            String URL = "jdbc:mysql://localhost:3306/smart_dustbin";
            String USER_NAME = "manish";
            String PASS = "manish";
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASS);

            // loading authority data
            String query = "select * from authority order by 'Username' ASC";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query); 

            while (rs.next()) 
            {
                //This retrieves each row of authority table
                Person p = new Person();

                p.setName(rs.getString("Name"));
                p.setUserName(rs.getString("Username"));
                p.setPass(rs.getString("Password"));
                p.setEmail(rs.getString("Email"));
                p.setPhoneNumber(rs.getString("Phone"));     

                authlist.add(p);
            }

            rs.close();
            stmt.close();
            
            // loading authority data
            query = "select * from dustbin order by 'Dustbin_ID' ASC";
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery(query); 

            while (rs.next()) 
            {
                //This retrieves each row of dustbin table
                Dustbin d = new Dustbin();

                d.setId(rs.getInt("Dustbin_ID"));
                d.setLocation(rs.getString("Location"));
                d.setWidth(rs.getFloat("Width"));
                d.setHeight(rs.getFloat("Height"));
                d.setLevel(rs.getInt("Level"));
                d.setLastEmptyDate(rs.getString("Last_Empty_Date"));
                d.setMoisture(rs.getInt("Moisture"));
                
                dustbinlist.add(d);
            }

            rs.close();
            stmt.close();

            // loading cleaner data
            query = "select * from cleaner order by 'cleaner_ID' ASC";
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery(query); 

            while (rs.next()) 
            {
                //This retrieves each row of cleaner table
                cleaner v = new cleaner();

                v.setcleanerNumber(rs.getString("cleaner_ID"));
                v.setPhoneNumber(rs.getString("Phone"));
                v.setEmail(rs.getString("Email"));
                v.setName(rs.getString("Driver_Name"));
                v.setUserName(rs.getString("Username"));
                v.setPass(rs.getString("Password"));

                cleanerlist.add(v);
            }
            
            rs.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
