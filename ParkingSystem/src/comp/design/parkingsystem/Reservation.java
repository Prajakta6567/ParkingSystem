package comp.design.parkingsystem;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class Reservation implements Comparable<Reservation> {

	private int reservationID;
	private int customerID;
	private Calendar reservationTimeIn;
	private Calendar reservationTimeOut;
	private Calendar actualTimeIn;
	private Calendar actualTimeOut;
	public Driver driver;
	public Transaction transaction;
	public BigInteger id;

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
	public void reserveParking(int custId, int resID, Calendar start, Calendar finish)
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
	
	public void setActualTimeIn(Calendar c){
		actualTimeIn = c;
	}
	public void setActualTimeOut(Calendar c){
		actualTimeOut = c;
	}
	

}
