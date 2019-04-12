package com.sapient.weather.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.weather.model.forecast.response.WeatherForecastResponse;
import com.sapient.weather.service.WeatherForecastService;

@RestController
@RequestMapping("/api")
public class WeatherForecastResource {

	@Autowired
	private WeatherForecastService weatherForecastService;
	
	@RequestMapping("/healthcheck")
	public String healthCheck() {
		return "Working!";
	}
	
	@RequestMapping(path="/v1/forecast/{cityName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WeatherForecastResponse getForecast(@PathVariable("cityName") String cityName) {
		return weatherForecastService.getWeatherForecast(cityName);
	}
	
}
