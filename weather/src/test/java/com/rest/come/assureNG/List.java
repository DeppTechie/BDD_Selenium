package com.rest.come.assureNG;

import java.util.HashMap;
import java.util.Map;

public class List {

private Long dt;
private Main main;
private java.util.List<Weather> weather = null;
private Clouds clouds;
private Wind wind;
private Rain rain;
private Sys sys;
private String dt_txt;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
* 
*/
public List() {
}

/**
* 
* @param clouds
* @param dt
* @param wind
* @param sys
* @param dtTxt
* @param weather
* @param rain
* @param main
*/
public List(Long dt, Main main, java.util.List<Weather> weather, Clouds clouds, Wind wind, Rain rain, Sys sys, String dtTxt) {
super();
this.dt = dt;
this.main = main;
this.weather = weather;
this.clouds = clouds;
this.wind = wind;
this.rain = rain;
this.sys = sys;
this.dt_txt = dtTxt;
}

public Long getDt() {
return dt;
}

public void setDt(Long dt) {
this.dt = dt;
}

public Main getMain() {
return main;
}

public void setMain(Main main) {
this.main = main;
}

public java.util.List<Weather> getWeather() {
return weather;
}

public void setWeather(java.util.List<Weather> weather) {
this.weather = weather;
}

public Clouds getClouds() {
return clouds;
}

public void setClouds(Clouds clouds) {
this.clouds = clouds;
}

public Wind getWind() {
return wind;
}

public void setWind(Wind wind) {
this.wind = wind;
}

public Rain getRain() {
return rain;
}

public void setRain(Rain rain) {
this.rain = rain;
}

public Sys getSys() {
return sys;
}

public void setSys(Sys sys) {
this.sys = sys;
}

public String getDt_txt() {
return dt_txt;
}

public void setDt_txt(String dtTxt) {
this.dt_txt = dtTxt;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


