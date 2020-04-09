package getRequest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSenderOptions;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tseting 
{

	

	@Test
	final void testcreateUser() throws FileNotFoundException
	{
		RestAssured.baseURI="https://api.hiverhq.com";
		FileInputStream fileInputStream = new FileInputStream(new File("JsonFileInput\\jsonrequest1.json"));
		Response response = given().
		contentType("Application/json").
		accept("application/json").
		header("Authorization", "Bearer "+ "eyJpdiI6IlFLSkw0WWNDbTB3ek51Zk0yXC81a1ZRPT0iLCJ2YWx1ZSI6Ilk2ZVZ1WjMxUFBqU3luYUdjNGNLNFZCb1hVdVRcLzN4SnhYMU1ZYXcwVVR3PSIsIm1hYyI6ImQxMjQ4MDQzNDYwOTJkYzNiMmU4NTFmYTM0YTFjZWUyNDEzNjI1OWQ0ZDZhZmU3YzQzN2FmMTFjZmM1ZDZiM2QifQ==").
	    body(fileInputStream).
		when().
		post("/api/136003/conversations/active").//payload.json()
		then().
		statusCode(200).
		extract().
		response();
		int code =response.getStatusCode();
		Assert.assertEquals(code, 200);
		System.out.println(code);
		
	}
}
