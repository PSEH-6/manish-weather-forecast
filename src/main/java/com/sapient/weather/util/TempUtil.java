package com.sapient.weather.util;

public class TempUtil {
	
	public static double convertToCelsius(double faren) {
		return (faren-32)*(5/9);
	}

}
