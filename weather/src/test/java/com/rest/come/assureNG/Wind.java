package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class Wind {

private Float speed;
private Float deg;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Wind() {
}

/**
* 
* @param speed
* @param deg
*/
public Wind(Float speed, Float deg) {
super();
this.speed = speed;
this.deg = deg;
}

public Float getSpeed() {
return speed;
}

public void setSpeed(Float speed) {
this.speed = speed;
}

public Float getDeg() {
return deg;
}

public void setDeg(Float deg) {
this.deg = deg;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}