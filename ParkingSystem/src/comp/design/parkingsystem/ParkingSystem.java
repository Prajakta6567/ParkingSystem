package comp.design.parkingsystem;

import java.util.Calendar;
import java.util.Vector;


public class ParkingSystem {

	protected Calendar reservationTimeIn;
	protected Calendar reservationTimeOut;
	protected int pSpot;
	private String destinationAddress;
	private Calendar reservationDate;
	private Money price;
	private double distance;
	private ParkingLotDatabase parkingSpot;
	public Vector<Session> sessions;
	
	public class GeoLocation {}
	public class Credentials {}
	public class Session {}

	public Session authenticate(Credentials credentials) { 
		return new Session();
	}
	public void unauthenticate(Session s) {}
	
	public Vector<ParkingSpot> getParkingSpotsNear(GeoLocation coords, double radius){
		return new Vector<ParkingSpot>(); 
	}
	
	public void selectParking(int spotId) {
		// select the parking from all the available spots
	}
}
