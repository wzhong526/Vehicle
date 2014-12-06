package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Vehicle.TestVehicle;
import Vehicle.Vehicle;

public class JUnit extends TestVehicle{
	public void testtransferOwnership(){
		transferOwnership(PersonB);
		assertEquals(PersonB,transferOwnership(PersonB));
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
