package comp.design.parkingsystem;

import java.util.Vector;

/**
 * @singleton This is a central controller of the application. It is responsible
 *            for authenticating users, and handling user requests.
 */
public class ParkingSystem {

	public class Credentials {
	}

	public class Session {
	}

	private ParkingLotDatabase db;
	public Vector<Session> sessions;

	/**
	 * Call the auth service. Add a new session if the credentials are valid.
	 *
	 * @param credentials
	 * @return
	 */
	public Session authenticate(Credentials credentials) {
		return new Session();
	}

	public void unauthenticate(Session s) {
	}

	public Vector<ParkingSpot> getParkingSpotsNear(GeoLocation coords, double radius) {
		return new Vector<ParkingSpot>();
	}

	/**
	 * Select the parking from all the available spots.
	 *
	 * @param spotId
	 */
	public void selectParking(int spotId) {
	}

	public void reserveParking() {
	}

	public void payForParking() {
	}
}
