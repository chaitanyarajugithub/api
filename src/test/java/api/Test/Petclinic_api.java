package api.Test;


	




import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Petclinic_api {	
@Test	
	public void testResponsecode()
	{
		Response resp = RestAssured.get("http://13.233.190.102:8080/petclinic/vets.json");
		int code = resp.getStatusCode();
		System.out.println("status code is" +code);

		
		Assert.assertEquals(code, 200);
		
	}
@Test	
public void testResponse()
{
	Response resp = RestAssured.get("http://13.233.190.102:8080/petclinic/vets.json");
	String data = resp.asString();
	System.out.println("Data is" +"\n" + data);

	System.out.println("response time is" + resp.getTime());
	
	

}
}

