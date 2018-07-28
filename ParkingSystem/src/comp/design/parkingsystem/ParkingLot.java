package comp.design.parkingsystem;

import java.math.BigInteger;
import java.util.Vector;

/**
 * This represents an actual parking lot. Parking lots contain parking spaces
 * (ParkingSpot).
 */
public class ParkingLot extends Vector<ParkingSpot> {
	private static final long serialVersionUID = 1L;
	public int parkingStartNumber; // for even distribution of parking spots
	public boolean isFull;
	public GeoLocation location;
	public String name;
	public BigInteger phone;
}