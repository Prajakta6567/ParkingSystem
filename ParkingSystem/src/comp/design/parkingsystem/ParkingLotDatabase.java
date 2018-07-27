package comp.design.parkingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Vector;
/**
 *
 * The ParkingLotDatabase is a specialized class used to query information about
 * parking lots and control state information changes.
 *
 * There are specialized methods for solving common application tasks. For
 * example, findLot searches for an available parking location within a given
 * radius around a given point.
 *
 */

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
		con = DriverManager.getConnection(url + "", username, password);
		stmt = con.createStatement();
		return true; // assume it works
	}

	public ParkingLot findLot(String query) {
		return new ParkingLot();
	}

	public Vector<ParkingLot> getParkingLotsNear(GeoLocation coords, double radius) {
		return new Vector<ParkingLot>();
	}
	/*
	 * Close connection to database
	 */
	public static boolean closeDatabase() throws ClassNotFoundException, SQLException {
		rs.close();
		stmt.close();
		con.close();
		return true;// assuming that it works
	}

	/*
	 * If the garage is full at a certain time, return true Input: Time, ParkingLot
	 * Output: true if full, false is not full
	 */
	public static boolean isFull(Calendar time, ParkingLot lot) {
		return true;
	}

	/**
	 * Reserves a parking space in the database
	 *
	 * @param pSpot
	 * @param resID
	 * @param start
	 * @param finish
	 * @return
	 */
	public static boolean reserveParkingSpace(int pSpot, int resID, Calendar start, Calendar finish) {
		// For a given parking space and time period, the ParkingSystem's database
		// is either made unavailable or opened up for other reservations to be made
		// or not made at this time
		return true;
	}

	/**
	 * Opens up a parking space in the database Frees the space
	 */
	public static boolean unReserveParkingSpace(int pSpot, Calendar start, Calendar finish) {
		return true;
	}

	/**
	 * Checks a reservation "in" the database into a spot
	 *
	 * @param resID
	 * @param spotID
	 */
	public static void reservationCheckIn(int resID, int spotID) {
	}

	/**
	 * Checks a reservation out in the database from a spot
	 *
	 * @param spotID
	 */
	public static void reservationCheckOut(int spotID) {
	}

}
