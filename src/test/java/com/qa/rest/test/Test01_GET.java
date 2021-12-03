package com.qa.rest.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
  @Test
  public void test_01() {
	  
	  Response res = RestAssured.get("http://ergast.com/api/f1/2021/circuits.json");
	  
	  System.out.println(res.asString());
	  System.out.println(res.getBody().asString());
	  int status_code = res.statusCode();
	  System.out.println(status_code);
  }
  
  public static void getResponseBody() {
	 
  }
}
