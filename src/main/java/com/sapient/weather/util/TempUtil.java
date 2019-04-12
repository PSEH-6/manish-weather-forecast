package com.sapient.weather.util;

public class TempUtil {
	
	public static double convertToCelsius(double faren) {
		double cel = (faren-32)*(0.555d);
		return cel;
	}

}
