package getRequest;
import static org.hamcrest.Matchers.hasItem;
import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.preemptive;
import org.testng.annotations.BeforeTest;

class Hellobearer
{
	@Test
	public void Login() {

	    Response resp = given().header("Authorization", "Bearer "+"eyJpdiI6IlFLSkw0WWNDbTB3ek51Zk0yXC81a1ZRPT0iLCJ2YWx1ZSI6Ilk2ZVZ1WjMxUFBqU3luYUdjNGNLNFZCb1hVdVRcLzN4SnhYMU1ZYXcwVVR3PSIsIm1hYyI6ImQxMjQ4MDQzNDYwOTJkYzNiMmU4NTFmYTM0YTFjZWUyNDEzNjI1OWQ0ZDZhZmU3YzQzN2FmMTFjZmM1ZDZiM2QifQ==").
	            post("https://api.hiverhq.com/api/136003/conversations/active");
	    System.out.println(resp.asString());
	    
	}
	
	

}