

package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class City {

private Long id;
private String name;
private Coord coord;
private String country;
private Long timezone;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public City() {
}

/**
* 
* @param coord
* @param id
* @param timezone
* @param name
* @param country
*/
public City(Long id, String name, Coord coord, String country, Long timezone) {
super();
this.id = id;
this.name = name;
this.coord = coord;
this.country = country;
this.timezone = timezone;
}

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Coord getCoord() {
return coord;
}

public void setCoord(Coord coord) {
this.coord = coord;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public Long getTimezone() {
return timezone;
}

public void setTimezone(Long timezone) {
this.timezone = timezone;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


