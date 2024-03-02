package DynamicAssertion;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllIncidents  extends BaseClass {	
	@Test(dependsOnMethods = "DynamicAssertion.ChnCreateIncident.create")
	public void getIncidents() {	 	
		Response response = RestAssured.get("incident");		
				 
		response.prettyPrint();
		response.then().assertThat().body("result.number", Matchers.hasItem(str_Num));
		
	}

}
