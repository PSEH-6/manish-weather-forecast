package com.sapient.weather.service;

import com.sapient.weather.model.forecast.response.WeatherForecastResponse;

public interface WeatherForecastService {
	WeatherForecastResponse getWeatherForecast(String cityName);
}
