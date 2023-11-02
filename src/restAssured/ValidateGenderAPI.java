package restAssured;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateGenderAPI {

	/*@Test
	void testValidateGenderAPI() {
		RestAssured_Test.validateGenderAPI("Arti","female");
		RestAssured_Test.validateGenderAPI("Amit","male");
	}*/
	//@Test
	//void testUniversityAPI() {
	//	UniversityValidation_Test.testUniversityAPI("india");
	//}
	//@Test
	void findUniversityStateCount() {
		UniversityValidation_Test.findUniversityStateCount("india","Punjab");
		UniversityValidation_Test.checkWetherUniversityExist("india", "Amravati University");
	}
	
	//@Test
	void authBaseURLCheck()
	{
		AuthBaseURL.validateWithCredential("postman", "password", 200);
		AuthBaseURL.validateWithCredential("postman", "password1", 401);
	}
	
	@Test
	void testPostAPI()
	{
		String reqbody="{\"id\": 0,\"petId\": 0,\"quantity\": 0,\"shipDate\": \"2023-10-19T04:21:55.067Z\",\"status\": \"placed\",\"complete\": true}";
		String reqbody1="{\"id\": 0,\"petId\": 0,\"quantity\": 0,\"shipDate\": \"2023-10-19T04:21:55.067Z\",\"status\": \"placed\"}";
		TestPostAPI.testPost1(reqbody, true);
		TestPostAPI.testPost1(reqbody1, false);
	}

}
