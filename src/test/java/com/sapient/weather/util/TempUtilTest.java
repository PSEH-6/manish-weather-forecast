package com.sapient.weather.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TempUtilTest {
	
	@Test
	public void testConvertToCelsius() {
		assertEquals(1838.16, TempUtil.convertToCelsius(3344), 0.0);
	}

}
