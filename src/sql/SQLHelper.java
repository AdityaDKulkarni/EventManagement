package sql;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class SQLHelper {

	public static boolean isConnected;
	private static Connection connection;

	public static void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
			System.out.println("Success");
			isConnected = true;
		} catch (Exception e) {
			e.printStackTrace();
			isConnected = false;
		}
	}

	public static void insertEvent(String date, String venue, String scale, int noOfPpl, int eventId,
			String purpose, int ageGorup, String startTime, String endTime, String phone, 	String budget,
			String name, String email) {
		try {
			String eventQuery = "insert into EventDetails values('" + date
					+ "', '" 	+ venue
					+ "', '" 	+ scale
					+ "', " 	+ noOfPpl
					+ "," 		+ eventId
					+ ", '" 	+ purpose
					+ "', " 	+ ageGorup
					+ ", '" 	+ startTime
					+ "', '" 	+ endTime
					+ "', '" 	+ phone
					+ "', '" 	+ budget
					+"')";
			
			System.out.println(eventQuery);
			PreparedStatement statement1 = (PreparedStatement) connection.prepareStatement(eventQuery);
			statement1.executeUpdate();
			
			String query = "insert into Customer values('" + name
					+"', '" + email
					+"', (select eventid from EventDetails where EventDetails.eventid = " + eventId
					+"),"
					+ " (select cust_phone from EventDetails where EventDetails.eventid = " + eventId
					+"));";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
			System.out.println(query);
			statement.executeUpdate();
			System.out.println("Record inserted.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Record insert failed.");
		}
	}
}
