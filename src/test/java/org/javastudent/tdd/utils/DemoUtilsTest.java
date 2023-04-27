package org.javastudent.tdd.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DemoUtilsTest {

	
	@Test
	public void testEqualsAndNotEquals() {
		//Setup
		DemoUtils demoUtils = new DemoUtils();

		//Execute and Assert
		Assertions.assertEquals(8, demoUtils.add(2,6));
		Assertions.assertNotEquals(8, demoUtils.add(4, -4));
		
	}
	
	@Test
	public void testNullAndNotNull() {
		//Setup
		DemoUtils demoUtils = new DemoUtils();
		
		//Execute And Assert
		Assertions.assertNull(
				demoUtils.getBalance("wrongPassword"),
				"Cannot get balance with wrong password"
				);
		
		Assertions.assertNotNull(
				demoUtils.getBalance("correctPassword"),
				"Unable to get balance with correct password"
		);
	}
}
