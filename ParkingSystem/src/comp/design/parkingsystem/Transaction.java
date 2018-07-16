package comp.design.parkingsystem;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

public class Transaction {

	BigInteger id;
	public Date time;
	public Money amount;
	public double tax;
	public BigInteger
		accountNumber,
		routingNumber;

	public Money total () { return new Money(); }
	
	private static final float RATE = 4; //Dollars per hour
	private static final float MAX_DAY = 30;
	
	//	Purpose:	Takes two calendar objects and returns the difference in time

	public static float getTimeDifference(Calendar calFirst, Calendar calSecond){
		if(calFirst.after(calSecond)){
			return 0;
		}
		float time_in_milli = calFirst.getTimeInMillis();
		float time_out_milli = calSecond.getTimeInMillis();
		float time_total_milli = time_out_milli - time_in_milli;
		float time_total_hour = time_total_milli/1000/60/60; //convert milliseconds to hour
		return time_total_hour;
	}

	public static float getPrice(Reservation r){
		Calendar reservedTimeIn 	=	r.reservationInformation().get(0);
		Calendar reservedTimeOut	=	r.reservationInformation().get(1);
		Calendar actualTimeIn 		= 	r.reservationInformation().get(2);
		Calendar actualTimeOut		= 	r.reservationInformation().get(3);
		
		float earlyTime = getTimeDifference(actualTimeIn,reservedTimeIn);
		float reservedTime = getTimeDifference(reservedTimeIn,reservedTimeOut);
		float extraTime	=	getTimeDifference(reservedTimeOut,actualTimeOut);
		
		float totalCost = (RATE * earlyTime) + (RATE * reservedTime);
		
		if (totalCost > MAX_DAY){
			totalCost = MAX_DAY;
		}
		
		return totalCost;
	}
	
	public static float chargeCustomer(Reservation r) throws ClassNotFoundException, SQLException{
		// Calculate price
		double price = Transaction.getPrice(r);
		
		// update Customer Database
		
		/*	update Reservation Object
			update Reservation Database
		 */
		return (float) price;
	}
	
}
