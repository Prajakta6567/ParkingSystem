package comp.design.parkingsystem;

import java.util.Vector;

import comp.design.parkingsystem.ParkingSystem.GeoLocation;

public class ParkingLotDatabase {

	public class ParkingLot extends Vector<ParkingSpot> {
		private static final long serialVersionUID = 1L;
	}

	public ParkingLot findLot(String query) { return new ParkingLot(); }
	public Vector<ParkingLot> getParkingLotsNear(GeoLocation coords, double radius) {return new Vector<ParkingLot>(); }

}
