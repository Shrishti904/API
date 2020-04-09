package getRequest;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getData 
{
    @Test
	public void testResponsecode()
	{
		Response resp = RestAssured.get("https://api.hiverhq.com/api/136003/conversations/active");
        int code=resp.getStatusCode();	
        System.out.println("Status code is "+ code);
        Assert.assertEquals(code,200);
	}
}
