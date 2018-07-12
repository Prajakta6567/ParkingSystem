package comp.design.parkingsystem;

import java.util.Calendar;

public class ParkingSystem {
	protected Calendar reservationTimeIn;
	protected Calendar reservationTimeOut;
	protected int pSpot;
	private String destinationAddress;
	private Calendar reservationDate;
	private Money price;
	private double distance;
	private ParkingLotDatabase parkingSpot;
	public Driver location;
	
}
