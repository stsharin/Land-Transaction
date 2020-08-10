
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class SQLconnection {
    
    static Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbs.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sellinginfo", "root", "");
            
            JOptionPane.showMessageDialog(null, "Successfull");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Failed");
            return null;
        }
    }
}
