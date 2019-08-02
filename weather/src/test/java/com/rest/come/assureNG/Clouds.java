package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class Clouds {

private Long all;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public Clouds() {
}

/**
* 
* @param all
*/
public Clouds(Long all) {
super();
this.all = all;
}

public Long getAll() {
return all;
}

public void setAll(Long all) {
this.all = all;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


