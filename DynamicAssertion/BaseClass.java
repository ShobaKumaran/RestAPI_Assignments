package DynamicAssertion;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {

	public static String str_SysID;
	public static String str_Num;
	@BeforeMethod
	
	public void setUp() {
	//add endpoint and authentication
			
		RestAssured.baseURI = "https://dev229790.service-now.com/api/now/table/";
		//RestAssured.authentication = RestAssured.basic("admin", "rJ!I2bAt5J%x");
		RestAssured.authentication = RestAssured.preemptive().basic("admin", "rJ!I2bAt5J%x");
		 
	}
}
