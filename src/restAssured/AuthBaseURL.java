package restAssured;



import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthBaseURL {

	public static void validateWithCredential(String username, String password, int expectedstatuscode) {
		
		RestAssured.baseURI="https://postman-echo.com/";
		Response res=RestAssured.given().auth().preemptive().basic(username, password).get("basic-auth").then().extract().response();
		assertEquals(expectedstatuscode,res.getStatusCode());
	}

}
