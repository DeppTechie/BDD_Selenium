package com.rest.come.assureNG;

import java.io.Serializable;


public class Time implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String symbol;
	private String precipitation;
	private String windDirection;
	private String windSpeed;
	private String temperature;
	private String pressure;
	private String humidity;
	private String clouds;
	
	public Time() {
		
	}
	public Time(String symbol, String precipitation, String windDirection, String windSpeed, String temperature,
			String pressure, String humidity, String clouds) {
		super();
		this.symbol = symbol;
		this.precipitation = precipitation;
		this.windDirection = windDirection;
		this.windSpeed = windSpeed;
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		this.clouds = clouds;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getClouds() {
		return clouds;
	}
	public void setClouds(String clouds) {
		this.clouds = clouds;
	}
	@Override
	public String toString() {
		return "WeatherTime [symbol=" + symbol + ", precipitation=" + precipitation + ", windDirection=" + windDirection
				+ ", windSpeed=" + windSpeed + ", temperature=" + temperature + ", pressure=" + pressure + ", humidity="
				+ humidity + "]";
	}
	

}
