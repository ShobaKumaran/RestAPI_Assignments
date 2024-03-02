package DynamicAssertion;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ChnCreateIncident extends BaseClass {
	@Test
	public void create() {
		File file = new File("./src/test/resources/createincident.json");
		
		RequestSpecification inputRequest = RestAssured.given()
		.contentType("application/json")
		.when().body(file);
		
		Response response = inputRequest.post("incident");
		str_SysID = response.jsonPath().getString("result.sys_id");
		str_Num = response.jsonPath().getString("result.number");
		
		
		System.out.println("Sys id:"+str_SysID);
	}
}
