package comp.design.parkingsystem;

import java.util.Vector;
import java.sql.*;

import comp.design.parkingsystem.ParkingSystem.GeoLocation;


public class ParkingLotDatabase {

	protected static Connection con = null;
	protected static Statement stmt = null;
	protected static ResultSet rs = null;
	protected static int spotsPerFloor = 20;
	protected static int numFloors = 3;
	protected static int numParkingSpots = numFloors * spotsPerFloor;
	private String garageAddresses;
	private int phoneNumber;
	private Calendar hours;
	private boolean vacancy;
	private ParkingSpot parkingSpot;
	
	/*
	 * default constructor
	 */
	public ParkingLotDatabase() {	
	}

	/*
	 * Open connection to database
	 */
	public static boolean connectToDatabase() throws ClassNotFoundException, SQLException {
		String username = "";
		String password = "";
		String url = "";
		Class.forName("");
		con = DriverManager.getConnection(url+"", username, password);
		stmt = con.createStatement();
		return true; //assume it works
	}
	
	public class ParkingLot extends Vector<ParkingSpot> {
		private static final long serialVersionUID = 1L;
	}

	public ParkingLot findLot(String query) { return new ParkingLot(); }
	public Vector<ParkingLot> getParkingLotsNear(GeoLocation coords, double radius) {return new Vector<ParkingLot>(); }
	
	/*
	 * Purpose: Close connection to database
	 */
	public static boolean closeDatabase() throws ClassNotFoundException, SQLException{
		rs.close();
		stmt.close();
		con.close();
		return true;//assuming that it works
	}
	
	
	

	
}
