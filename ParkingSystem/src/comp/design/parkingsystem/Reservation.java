package comp.design.parkingsystem;

import java.math.BigInteger;
import java.sql.Date;

public class Reservation {

	public BigInteger id;
	public Calendar duration;
	public Date arrival, departure;
	public Driver driver;
	public Transaction transaction;


	public void confirmArrival() {}
	public void confirmDeparture() {}

}
