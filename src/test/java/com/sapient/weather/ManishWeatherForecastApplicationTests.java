package com.sapient.weather;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ManishWeatherForecastApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void contextLoads() throws JSONException {
		String actual = restTemplate.getForObject("http://localhost:"+port+"/api/v1/forecast/Kanpur", String.class);
		JSONAssert.assertEquals("{\"message\":\"Use sunscreen lotion\"}", actual, false);
	}

}
