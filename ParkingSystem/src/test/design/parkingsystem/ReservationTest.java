package test.design.parkingsystem;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import comp.design.parkingsystem.Reservation;

public class ReservationTest {
	private Calendar reservationTimeIn;
	private Calendar reservationTimeOut;
	private Calendar actualTimeIn;
	private Calendar actualTimeOut;

	Reservation reservation = null;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	public void reservationInformationTest() {

	reservation = new Reservation(0, 0, 0, null, null, null, null);

	assertEquals(Arrays.asList(reservationTimeIn, reservationTimeOut, actualTimeIn, actualTimeOut),
						reservation.reservationInformation());
	}
	

}
