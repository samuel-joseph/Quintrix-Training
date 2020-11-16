package restassured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Homework_5_PUT {
	
	@Test

	public void homework_5() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Morpheus2");
		JSONObject request = new JSONObject(map);
		String oldTimeStamp = RestAssured.get("/api/users/2")
	              .then()
	              .extract()
	              .path("updatedAt");
		
		given().header("ContentType", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
			.body("name")
			.when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
//		System.out.println(map);
//		System.out.println(request);
	}
}
