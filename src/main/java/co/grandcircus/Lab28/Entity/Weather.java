package co.grandcircus.Lab28.Entity;

import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	
	
	private Location location; 
	private Data data; 
	
	
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weather(Location location, Data data) {
		super();
		this.location = location;
		this.data = data;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Weather{" +  
	"Location='" + location  + '\'' + ", Data=" + data + '}';
	}
	
	
}
