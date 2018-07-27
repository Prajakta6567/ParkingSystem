package comp.design.parkingsystem;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class Reservation implements Comparable<Reservation> {

	public BigInteger id;
	public Date arrival, departure;
	public Driver driver;
	public Transaction transaction;
	private int reservationID;
	private int customerID;
	private int parkingId;
	private Calendar reservationTimeIn;
	private Calendar reservationTimeOut;
	private Calendar actualTimeIn;
	private Calendar actualTimeOut;
	
	/**
	 * 
	 * @param resId
	 * @param custId
	 * @param spotId
	 * @param in
	 * @param out
	 * @param ain
	 * @param aout
	 */
	public Reservation(int resId, int custId, int spotId, Calendar in,
			Calendar out, Calendar ain, Calendar aout) {

	}

	public int compareTo(Reservation reserve) {
		if (reservationTimeIn.before(reserve.reservationTimeIn)){
			return -1;
		}
		else if (reservationTimeIn.after(reserve.reservationTimeIn)){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	/**
	 * Make a reservation
	 * 	Output:	Reservation Object if successful
	 * no parking spots: -1 for reservationID
	 * too many reservation: -2 for reservationID
	 * else make reservation
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void reserveParking(int parkingId, int resID, Calendar start, Calendar finish)
						throws ClassNotFoundException, SQLException {
		
	}
	/*
	 * When a driver has confirmed the reservation, this function is called
	 */
	public void confirmArrival(Calendar in) {}
	/*
	 * Call when car is leaving
	 */
	public void confirmDeparture() {}
	
	/*purpose: returns ArrayList of Calendar objects:
	 * 1	reservationTimeIn;
	 * 2	reservationTimeOut
	 * 3	actualTimeIn
	 * 4	actualTimeOut
	 * 	*/
	public ArrayList<Calendar> reservationInformation(){
		ArrayList<Calendar> output = new ArrayList<Calendar>();
		output.add(reservationTimeIn);
		output.add(reservationTimeOut);
		output.add(actualTimeIn);
		output.add(actualTimeOut);
		return output;
	}
	
	/*
	 * Helper Functions
	 */
	public int getReservationID(){
		return reservationID;
	}
	public int getCustomerID(){
		return customerID;
	}
	public int getParkingId(){
		return parkingId;
	}
	public void setActualTimeIn(Calendar c){
		actualTimeIn = c;
	}
	public void setActualTimeOut(Calendar c){
		actualTimeOut = c;
	}
	

}
