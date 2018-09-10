package sql;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class SQLHelper {

	public static boolean isConnected;
	private static Connection connection;
	private static boolean resultFlag = false;

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

	public static boolean insertEvent(String date, String venue, String scale, int noOfPpl, int eventId,
			String purpose, int ageGorup, String startTime, String endTime, String phone, 	String budget) {
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
			
			System.out.println("Event Record inserted.");
			resultFlag = true;

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Record insert failed.");
		}
		
		return resultFlag;
	}

	public static void insertCustomer(String name, String email, int eventId, String phone) {
		try {
			String customerQuery = "insert into Customer values('" + name
					+"', '" + email
					+"', (select eventid from EventDetails where EventDetails.eventid = " + eventId
					+"),"
					+ " (select cust_phone from EventDetails where EventDetails.eventid = " + eventId
					+"));";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(customerQuery);
			System.out.println(customerQuery);
			statement.executeUpdate();
			
			System.out.println("Cust Record inserted.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertFood(int eventId, int noOfPpl, String plateBudget, String preference, String menu) {
		try {
			
			String foodQuery = "insert into Food values("
					+ "(select eventid from EventDetails where EventDetails.eventid = " + eventId
					+ "),"
					+ noOfPpl
					+ ","
					+ plateBudget
					+ ","
					+ "'"
					+ preference
					+ "',"
					+ "'"
					+ menu
					+ "');";

			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(foodQuery);
			System.out.println(foodQuery);
			statement.executeUpdate();

			System.out.println("Food Record inserted.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertEntertainment(int eventId, String extras, String celebrity, String arrangements) {
try {
			
			String entWuery = "insert into Entertainment values("
					+ "(select eventId from EventDetails where EventDetails.eventId = " + eventId + "),"
					+ "'"
					+ extras
					+ "',"
					+ "'"
					+ celebrity
					+ "',"
					+ "'"
					+ arrangements
					+ "');";

			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(entWuery);
			System.out.println(entWuery);
			statement.executeUpdate();

			System.out.println("Entertainment Record inserted.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
