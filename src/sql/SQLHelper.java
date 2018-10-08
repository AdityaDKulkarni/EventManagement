package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class SQLHelper {

	public static boolean isConnected;
	private static Connection connection;
	private static boolean resultFlag = false;
	private static ResultSet set;

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
			String eventQuery = "insert into " + Constants.EVENTDETAILS_TABLE + " values('" + date
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
			String customerQuery = "insert into " 
					+ Constants.CUSTOMER_TABLE
					+ " values('" + name
					+ "', '"
					+ email
					+ "', (select eventid from " + Constants.EVENTDETAILS_TABLE + " where EventDetails.eventid = " + eventId
					+ "),"
					+ " (select cust_phone from " + Constants.EVENTDETAILS_TABLE + " where EventDetails.eventid = " + eventId
					+ "));";
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

			String foodQuery = "insert into " + Constants.FOOD_TABLE + " values("
					+ "(select eventid from " + Constants.EVENTDETAILS_TABLE + " where " + Constants.EVENTDETAILS_TABLE + ".eventid = " + eventId
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

			String entWuery = "insert into " + Constants.ENTERTAINER_TABLE + " values("
					+ "(select eventId from " + Constants.EVENTDETAILS_TABLE + " where " + Constants.EVENTDETAILS_TABLE + ".eventId = " + eventId + "),"
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

	public static ResultSet getCustomerList() {
		try {
			String customerQuery = "select name from " + Constants.CUSTOMER_TABLE + ";";

			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(customerQuery);
			System.out.println(customerQuery);
			set =  statement.executeQuery();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return set;
	}
	
	public static ResultSet getEventDetails(String name) {
		try {
			String eventQuery = "select Customer.name, EventDetails.purpose, EventDetails.venue,"
					+ " EventDetails.dateofevent, EventDetails.starttime, EventDetails.endtime, EventDetails.budget,"
					+ " Food.platebudget, Entertainment.extras, Entertainment.celebrity, Entertainment.arrangements from Customer"
					+ " left join EventDetails on Customer.eventid = EventDetails.eventid"
					+ " left join Food on Customer.eventid = Food.eventid left join Entertainment"
					+ " on Customer.eventid = Entertainment.eventid where Customer.name = \"" + name + "\";";
			System.out.println(eventQuery);
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(eventQuery);
			System.out.println(eventQuery);
			set =  statement.executeQuery();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return set;
	}
}
