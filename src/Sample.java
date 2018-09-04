import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;
public class Sample {
    public static void main(String args[]) {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/EventManagement?"
                    + "user=debian-sys-maint&password=p7HP21Qf6Vgm9F8M");
            System.out.println("Success");
            
            /*PreparedStatement statement = (PreparedStatement) con.prepareStatement("insert into Entertainer"
            		+ " values(001, \"Sejal\", \"Dancer\", 10000)");*/
            PreparedStatement statement = (PreparedStatement) con.prepareStatement("update Entertainer"
            		+ " set cost=100000 where name=\"Sejal\" ");
            
            statement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}