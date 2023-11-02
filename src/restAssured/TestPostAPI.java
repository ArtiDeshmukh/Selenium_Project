package restAssured;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;

public class TestPostAPI {

	public static void testPost1(String reqBody, Boolean complete) {
		RestAssured.baseURI="https://petstore.swagger.io/";
		
		ResponseOptions res=RestAssured.given().header("Content-type","application/json").body(reqBody).post("v2/store/order").then().extract().response();
		ResponseBody resbody=res.getBody();
		JsonPath jpath=resbody.jsonPath();
		assertEquals(complete,jpath.getBoolean("complete"));
		
	}

}
