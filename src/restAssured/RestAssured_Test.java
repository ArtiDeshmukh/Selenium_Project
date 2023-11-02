package restAssured;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssured_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public static void validateGenderAPI(String name, String expectedgender)
	{
		RestAssured.baseURI = "https://api.genderize.io/";
		RequestSpecification req=RestAssured.given();
		
		//Response res=RestAssured.given().queryParam("name", name).get().then().extract().response();
		
		req.queryParam("name",name);
		Response res=req.get();
		
		int statusCode=res.getStatusCode();
		System.out.println("StatusCode is "+statusCode);
		System.out.println("Status Line is "+res.getStatusLine());
		System.out.println("Content Type is "+ res.getHeader("Content Type"));
		
		Headers hedres=res.getHeaders();
		for(Header h : hedres)
		{
			System.out.print("Name "+h.getName());
			System.out.println("Value "+h.getValue());
		}
		
		
		ResponseBody bodres=res.getBody();
		JsonPath jsonobj=bodres.jsonPath();
		System.out.println("Name "+jsonobj.getString("name"));
		System.out.println("Gender "+jsonobj.getString("gender"));
		System.out.println("Probability "+jsonobj.getDouble("probability"));
		System.out.println("Count "+jsonobj.getInt("count"));
		
		assertEquals(name,jsonobj.getString("name"));
		assertEquals(expectedgender,jsonobj.getString("gender"));
		//assertEquals("name",jsonobj.getDouble("probability"));
		//assertEquals("name",jsonobj.getInt("count"));
	}

}
