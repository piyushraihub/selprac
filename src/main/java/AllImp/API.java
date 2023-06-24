//package AllImp;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
//
//import files.Payload;
//import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

// API class for all rest apis related integration

public class API {
  public static void main(String[] args) {
	
	RestAssured.baseURI = "https://rahulshettyacademy.com";
	String respone = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
			.body(Payload.addPlace())
			.when().post("maps/api/place/add/json")
		.then().log().all().assertThat()
			.statusCode(200).body("scope", equalTo("APP")).and().header("server", equalTo("Apache/2.4.41 (Ubuntu)"))
			.extract().response().asString();
	System.out.println("respone******* : " + respone);
  }
	
}
}
