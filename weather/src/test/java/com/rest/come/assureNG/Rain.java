package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class Rain {

private Float _3h;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Rain() {
}

/**
* 
* @param _3h
*/
public Rain(Float _3h) {
super();
this._3h = _3h;
}

public Float get3h() {
return _3h;
}

public void set3h(Float _3h) {
this._3h = _3h;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


