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
	public static int numParkingSpots = numFloors * spotsPerFloor;
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
	 * Make a reservation Output: Reservation Object if successful no parking spots:
	 * -1 for reservationID too many reservation: -2 for reservationID else make
	 * reservation
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 * @param parkingSpotId
	 * @param resID
	 * @param start
	 * @param finish
	 */
	public static void reserveParking(int parkingSpotId, int resID, Calendar start, Calendar finish)
			throws ClassNotFoundException, SQLException {

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
