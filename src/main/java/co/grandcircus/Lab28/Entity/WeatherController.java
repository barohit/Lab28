package co.grandcircus.Lab28.Entity;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	RestTemplate rt = new RestTemplate(); 
	
	
	@RequestMapping("weather")
	public ModelAndView weatherCalc(@RequestParam("lat") String lat, @RequestParam("lon") String lon) {
		Weather weather = rt.getForObject("https://forecast.weather.gov/MapClick.php?lat=" + lat + "&long=" + lon + "&FcstType=json", Weather.class);	 
		System.out.println(weather);
		return new ModelAndView("forecast", "forecast", weather);
	}
	

}
