package DynamicAssertion;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ChnUpdateIncident extends BaseClass {
	
	@Test(dependsOnMethods = "DynamicAssertion.ChnCreateIncident.create")
	public void update() {		
		RequestSpecification inputRequest = RestAssured
				 .given()
				 .contentType("application/json")
				 .when()
				 .body("{\r\n"
				+ "    \"short_description\": \"desktop mistake updated\",\r\n"
				+ "    \"description\": \"desktop plugpoint issue updated\"\r\n"
				+ "}");
		
	 		
		Response response = inputRequest.put("incident/"+str_SysID);
		response.prettyPrint();
	}
	
	

}
