package com.sapient.weather.apiclient;

import com.sapient.weather.model.openweather.api.forecast.response.Forecast;

public interface OpenWeatherApiClient {
	Forecast getForecast(String cityName);
}
