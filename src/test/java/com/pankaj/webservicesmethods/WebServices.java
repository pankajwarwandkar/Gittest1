package com.pankaj.webservicesmethods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class WebServices {
	
	
	public static Response Post(String uRI, String stringJson)
	{
		RequestSpecification requestSpecification = RestAssured.given().body(stringJson);
		requestSpecification.contentType(ContentType.JSON);
		Response response= requestSpecification.get(uRI);
		return response;		
	}
	
	public static Response Get(String uRI)
	{
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response= requestSpecification.get(uRI);
		return response;		
	}
	
	
	public static Response delete(String uRI, String stringJson)
	{
		RequestSpecification requestSpecification = RestAssured.given().body(stringJson);
		requestSpecification.contentType(ContentType.JSON);
		Response response= requestSpecification.delete(uRI);
		return response;		
	}
	
	
}
