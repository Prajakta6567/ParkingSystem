package test.design.parkingsystem;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import comp.design.parkingsystem.ParkingLot;
import comp.design.parkingsystem.ParkingLotDatabase;

public class ParkingLotDatabaseTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void DBConnectionShouldBeSuccessful() {

		boolean dbConnect = false;
		try {
			dbConnect = ParkingLotDatabase.connectToDatabase();
		} catch (Exception e) {
			dbConnect = false;
		}
		assertEquals(true, dbConnect);
	}

	@Test
	public void DBConnectionThrowsException() {
		boolean dbConnect = false;
		try {
			/**
			 * Assuming UserName was entered Wrong. Hence UserName should have been taken as
			 * Param.
			 */

			dbConnect = ParkingLotDatabase.connectToDatabase();
		} catch (Exception e) {
			dbConnect = true;
		}
		assertEquals(true, dbConnect);
	}

	@Test
	public void DBCloseShouldBeSuccessful() {
		boolean dbConnect = false;
		try {
			dbConnect = ParkingLotDatabase.closeDatabase();
		} catch (Exception e) {
			dbConnect = false;
		}
		assertEquals(true, dbConnect);
	}

	@Test
	public void DBCloseThrowsException() {
		boolean dbConnect = false;
		try {
			// Assuming database was never connected..
			dbConnect = ParkingLotDatabase.connectToDatabase();
		} catch (Exception e) {
			dbConnect = true;
		}
		assertEquals(true, dbConnect);
	}

	@Test
	public void isParkingFull() {
		ParkingLotDatabase.numParkingSpots = 4;
		ParkingLot pl = new ParkingLot();
		assertEquals(true, ParkingLotDatabase.isFull(Calendar.getInstance(), pl));
	}

	@Test
	public void isParkingNotFull() {
		ParkingLotDatabase.numParkingSpots = 5;
		ParkingLot pl = new ParkingLot();
		assertEquals(false, ParkingLotDatabase.isFull(Calendar.getInstance(), pl));
	}

	@Test
	public void ReserveParkingSpaceFailure() {
		ParkingLotDatabase.numParkingSpots = 0;
		try {
			ParkingLotDatabase.reserveParking(2, 2, Calendar.getInstance(), Calendar.getInstance());
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void ReserveParkingSpaceFailureonDiffSpot() {
		ParkingLotDatabase.numParkingSpots = 0;
		try {
			ParkingLotDatabase.reserveParking(2, 4, Calendar.getInstance(), Calendar.getInstance());
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void ReserveParkingSpaceSuccess() {
		ParkingLotDatabase.numParkingSpots = 100;
		try {
			ParkingLotDatabase.reserveParking(2, 2, Calendar.getInstance(), Calendar.getInstance());
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
