package com.rest.come.assureNG;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hamcrest.Matchers;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.JsonParseException;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.JsonMappingException;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.internal.path.xml.NodeChildrenImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OneTest {
	
/*	
	@Test
	public void Satyadeep() throws ParseException {
		
	ValidatableResponse response  = given().get("http://api.openweathermap.org/data/2.5/forecast?id=2147714&units=metric&mode=xml&APPID=d49b8056ff6fbc8d249eecef9bf02a9c")
		.then().statusCode(200);

	
	SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	
		
		List<Time> timeList  = given().get("http://api.openweathermap.org/data/2.5/forecast?id=2147714&units=metric&mode=xml&APPID=d49b8056ff6fbc8d249eecef9bf02a9c")
				.then().statusCode(200).body("weatherdata.location.name", Matchers.is("Sydney"))
				.extract().xmlPath().getList("weatherdata.forecast.time", Time.class);
		Date date = dateFormat.parse("2019-08-01T12:00:00");
		XmlPath sydneyMatcher =
		given().get("http://api.openweathermap.org/data/2.5/forecast?id=2147714&units=metric&mode=xml&APPID=d49b8056ff6fbc8d249eecef9bf02a9c")
		.then().statusCode(200).body("weatherdata.location.name", Matchers.is("Sydney")).extract().body().xmlPath();
		
		NodeChildrenImpl abc =sydneyMatcher.get("weatherdata.forecast.time");
			
		}
*/	
	
	@Test
	public void Satyadeep123() throws ParseException, JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper m = new ObjectMapper();
		
		
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		WholeResponse response  =   m.readValue(given().get("http://api.openweathermap.org/data/2.5/forecast?id=2147714&units=metric&APPID=d49b8056ff6fbc8d249eecef9bf02a9c")
		.then().statusCode(200).extract().asString(), WholeResponse.class);
			
		System.out.println("City Name = "+response.getCity().getName());
	
		boolean Thur_Day_Present = false;
	
		for(com.rest.come.assureNG.List list : response.getList()) {
		
			Date date = dateFormat.parse(list.getDt_txt());
			
		//	System.out.println( date.getDay());
			if(date.getDay()==5) {
				Thur_Day_Present = true;				
		//System.out.println("Thursday's Date = " +date);
	float temp	= list.getMain().getTemp();

	if (temp>10) {
		
		System.out.println("Comfortable day for visit @ " + date);
	
	}
		
			}
		}
		if (Thur_Day_Present == false) {System.out.println("Thuday Not Foud");}
		
		} 

}
