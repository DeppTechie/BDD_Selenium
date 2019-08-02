package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class WholeResponse {

private String cod;
private Float message;
private Long cnt;
private java.util.List<com.rest.come.assureNG.List> list = null;
private City city;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public WholeResponse() {
}

/**
* 
* @param message
* @param cnt
* @param cod
* @param list
* @param city
*/
public WholeResponse(String cod, Float message, Long cnt, java.util.List<com.rest.come.assureNG.List> list, City city) {
super();
this.cod = cod;
this.message = message;
this.cnt = cnt;
this.list = list;
this.city = city;
}

public String getCod() {
return cod;
}

public void setCod(String cod) {
this.cod = cod;
}

public Float getMessage() {
return message;
}

public void setMessage(Float message) {
this.message = message;
}

public Long getCnt() {
return cnt;
}

public void setCnt(Long cnt) {
this.cnt = cnt;
}

public java.util.List<com.rest.come.assureNG.List> getList() {
return list;
}

public void setList(java.util.List<com.rest.come.assureNG.List> list) {
this.list = list;
}

public City getCity() {
return city;
}

public void setCity(City city) {
this.city = city;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


