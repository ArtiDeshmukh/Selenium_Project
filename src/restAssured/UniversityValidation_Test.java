package restAssured;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class UniversityValidation_Test {

	public static void findUniversityStateCount(String country, String state) {
		
		RestAssured.baseURI="http://universities.hipolabs.com/";
		Response res=RestAssured.given().queryParam("country", country).get("search").then().extract().response();
		System.out.println(res.getStatusCode());
		
		ResponseBody resbody=res.getBody();
		JsonPath jsonobj=resbody.jsonPath();
		List<String> statelist=jsonobj.getList("state-province");
		System.out.println(statelist);
		int count=0;
		for(int i=0;i<statelist.size();i++)
		{
			if(statelist.get(i)!=null)
			{
			if(statelist.get(i).equals(state))
			{
				count++;
			}
			}
		}
		System.out.println(count);
	}
	
public static void checkWetherUniversityExist(String country, String university) {
		
		RestAssured.baseURI="http://universities.hipolabs.com/";
		Response res=RestAssured.given().queryParam("country", country).get("search").then().extract().response();
		System.out.println(res.getStatusCode());
		
		ResponseBody resbody=res.getBody();
		JsonPath jsonobj=resbody.jsonPath();
				
		List<String> universitylist=jsonobj.getList("name");
		System.out.println(universitylist);
		boolean found=false;
		for(int i=0;i<universitylist.size();i++)
		{
			
			if(universitylist.get(i).equals(university))
			{
				found=true;
				break;
			}
			
		}
		if(found) {
		System.out.println("Exist");
		}
		else {
			System.out.println("Not Exist");
		}
	}
	

}
