package sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLHelper {

	public static boolean isConnected;
	
	public static void connect() {
		try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Constants.URL
                    + "user=" + Constants.USERNAME + "&password=" +  Constants.PASSWORD);
            System.out.println("Success");
            isConnected = true;
        } catch (Exception e) {
            e.printStackTrace();
            isConnected = false;
        }
	}
}
