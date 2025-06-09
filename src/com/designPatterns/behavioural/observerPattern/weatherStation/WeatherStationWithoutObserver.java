package com.designPatterns.behavioural.observerPattern.weatherStation;

class DisplayDevice{
	public void showTemperatur(float Temp) {
		System.out.println("Current temp: "+Temp+" C");
	}
}

class WeatherStation{
	private float temperature;
	
	private DisplayDevice displayDevice;
	
	public WeatherStation(DisplayDevice displayDevice) {
		this.displayDevice=displayDevice;
	}
	
	public void setTemperature(float Temp) {
		this.temperature=Temp;
		notifyDevice();
	}
	
	public void notifyDevice() {
		displayDevice.showTemperatur(temperature);
	}
}

public class WeatherStationWithoutObserver {
	
	public static void main(String args[]) {
		DisplayDevice displayDevice = new DisplayDevice();
		WeatherStation station = new WeatherStation(displayDevice);
		
		station.setTemperature(75);
		station.setTemperature(79);
		
		
		
	}

}
