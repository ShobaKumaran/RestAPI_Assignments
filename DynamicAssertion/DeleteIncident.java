package DynamicAssertion;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass{
	@Test(dependsOnMethods = "DynamicAssertion.ChnUpdateIncident.update")
	public void deleteIncidents() { 
		Response deleteInc = RestAssured.delete("incident/"+str_SysID);
 	
		deleteInc.then().assertThat().statusCode(204);
		
	}
}
