package org.javastudent.tdd.utils;

import org.junit.Assert;
import org.junit.Test;


public class DemoUtilsTest {
	
	@Test
	public void testEqualsAndNotEquals() {
		
		Assert.assertEquals(8, new DemoUtils().add(2,6));
	}
}
