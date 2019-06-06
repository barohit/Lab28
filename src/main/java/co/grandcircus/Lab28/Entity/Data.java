package co.grandcircus.Lab28.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

	private String[] text; 
	
	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	public Data(String[] text) {
		super();
		this.text = text;
	} 
	
	@Override
	public String toString() {
		return null;  
	}
}
