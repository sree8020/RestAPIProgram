####This My First RestAPI Program############

package com.qa.rest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_Get_Req {
  @Test
  public void getweatherDetails() {
	  

		RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
		
		// Request object 
		RequestSpecification httprequest = RestAssured.given();
		
		// Response Object
		
		Response res = httprequest.request(Method.GET,"/findByStatus?status=sold");
		
		//print response in console window
		
		String responseBody = res.getBody().asString();
		
		System.out.println("response body is:" +responseBody);
		
		//status code validation
		
		int statusCode = res.getStatusCode();
		
		System.out.println("status code is :: "+ statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		// statis ;ome verification
		
		String statusLine = res.getStatusLine();
		
		String statusMsg = res.getSessionId();
		
		System.out.println("statusLine :: " + statusLine);
	
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
  }
}
