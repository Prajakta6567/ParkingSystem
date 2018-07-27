package test.design.parkingsystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import comp.design.parkingsystem.Driver;

public class TestDriver {

	@Test
	public void testDriver() {
		Driver d = new Driver("Test", "lplate1", 1, 5378485663L, "Toyota", "Camry", 1999);
		assertEquals(d.getID(), 1, 0);
	}

}
