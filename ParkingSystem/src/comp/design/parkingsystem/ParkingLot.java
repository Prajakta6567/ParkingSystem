package comp.design.parkingsystem;

import java.util.Vector;

public class ParkingLot extends Vector<ParkingSpot> {
	private static final long serialVersionUID = 1L;
	public int parkingStartNumber; // for even distribution of parking spots
	public boolean isFull;
}