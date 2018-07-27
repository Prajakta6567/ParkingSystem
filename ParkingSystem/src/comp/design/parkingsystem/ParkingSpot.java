package comp.design.parkingsystem;

import java.math.BigInteger;
import java.sql.*;
import java.util.Calendar;

public class ParkingSpot extends ParkingLotDatabase {

	private boolean vacant;
	private BigInteger number;
	private int parkingStartNumber; // for even distribution of parking spots
	
	/**
	 * Reserves a parking space in the database
	 * @param pSpot
	 * @param resID
	 * @param start
	 * @param finish
	 * @return
	 */
	public static boolean reserveParkingSpace(int pSpot, int resID, 
					Calendar start, Calendar finish) {
		//For a given parking space and time period, the ParkingSystem's database 
		//is either made unavailable or opened up for other reservations to be made 
		//or not made at this time
		return true;
	}
	
	/*	Opens up a parking space in the database
	 * Frees the space
	 */
	public static boolean unReserveParkingSpace(int pSpot, Calendar start, Calendar finish) {
		return true;
	}
	
	/**
	 * 	Checks a reservation "in" the database into a spot
	 * @param resID
	 * @param spotID
	 */
	public static void reservationCheckIn (int resID, int spotID) {
		
	}
	/**
	 * Checks a reservation out in the database from a spot
	 * @param spotID
	 */
	public static void reservationCheckOut (int spotID) {
		
	}
	
	/*	If the garage is full at a certain time, return true
	 * 	Input:		Time
	 * 	Output:		true if full, false is not full
	 * */
	public static boolean isCurrentlyFull(Calendar time) {
			return true;
	}
	
}
