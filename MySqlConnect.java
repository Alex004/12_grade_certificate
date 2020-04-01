
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class MySqlConnect {
    
     private static  Connection conn=null;
   private static final String driver="com.mysql.cj.jdbc.Driver";
   private static final String user="uraganul007";
   private static final String password="trilulilu007";
   private static final String url="jdbc:mysql://db4free.net:3306/contacte";
   ///pungaale_abonati
    public static Connection connectDB() {
        
    //Statement st = null;
    //ResultSet rs = null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
          //  st = conn.createStatement();
           // rs = st.executeQuery("SELECT * from utilizatori");

     /*   while (rs.next()) {
            String name=rs.getString("User");
            String parola=rs.getString("Password");
            System.out.println(name+" "+parola);
        }
*/
           //JOptionPane.showMessageDialog(null,"Connected to Database");
           return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
       
    }
    
}
