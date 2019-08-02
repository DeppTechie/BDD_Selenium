package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class Coord {

private Float lat;
private Float lon;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Coord() {
}

/**
* 
* @param lon
* @param lat
*/
public Coord(Float lat, Float lon) {
super();
this.lat = lat;
this.lon = lon;
}

public Float getLat() {
return lat;
}

public void setLat(Float lat) {
this.lat = lat;
}

public Float getLon() {
return lon;
}

public void setLon(Float lon) {
this.lon = lon;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


