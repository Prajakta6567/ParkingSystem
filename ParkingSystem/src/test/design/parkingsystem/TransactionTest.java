package test.design.parkingsystem;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import comp.design.parkingsystem.Transaction;
import java.util.Calendar;

public class TransactionTest {	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	public void getTimeDifferenceTest() {
	float actualValue=0;
	Calendar oldYear = Calendar.getInstance();
	oldYear.set(Calendar.YEAR, 2017);
	Calendar newYear = Calendar.getInstance();
	newYear.set(Calendar.YEAR, 2018);
	actualValue=Transaction.getTimeDifference(newYear, oldYear);
	        assertEquals(0.0, actualValue, 0.0001);
	}
}
