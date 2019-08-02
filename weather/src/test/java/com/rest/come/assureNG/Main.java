package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class Main {

private Float temp;
private Float temp_min;
private Float temp_max;
private Float pressure;
private Float sea_level;
private Float grnd_level;
private Long humidity;
private Long temp_kf;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Main() {
}

/**
* 
* @param seaLevel
* @param humidity
* @param pressure
* @param grndLevel
* @param tempMax
* @param temp
* @param tempKf
* @param tempMin
*/
public Main(Float temp, Float tempMin, Float tempMax, Float pressure, Float seaLevel, Float grndLevel, Long humidity, Long tempKf) {
super();
this.temp = temp;
this.temp_min = tempMin;
this.temp_max = tempMax;
this.pressure = pressure;
this.sea_level = seaLevel;
this.grnd_level = grndLevel;
this.humidity = humidity;
this.temp_kf = tempKf;
}

public Float getTemp() {
return temp;
}

public void setTemp(Float temp) {
this.temp = temp;
}

public Float getTemp_min() {
return temp_min;
}

public void setTemp_min(Float tempMin) {
this.temp_min = tempMin;
}

public Float getTemp_max() {
return temp_max;
}

public void setTemp_max(Float tempMax) {
this.temp_max = tempMax;
}

public Float getPressure() {
return pressure;
}

public void setPressure(Float pressure) {
this.pressure = pressure;
}

public Float getSea_level() {
return sea_level;
}

public void setSea_level(Float seaLevel) {
this.sea_level = seaLevel;
}

public Float getGrnd_level() {
return grnd_level;
}

public void setGrnd_level(Float grndLevel) {
this.grnd_level = grndLevel;
}

public Long getHumidity() {
return humidity;
}

public void setHumidity(Long humidity) {
this.humidity = humidity;
}

public Long getTemp_kf() {
return temp_kf;
}

public void setTemp_kf(Long tempKf) {
this.temp_kf = tempKf;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


