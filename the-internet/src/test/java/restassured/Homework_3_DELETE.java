package restassured;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Homework_3_DELETE {
	@Test
	public void test_1_delete() {
		JSONObject request = new JSONObject();
		given().
		body(request.toJSONString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().statusCode(204).						//this verifies response code of 204
		log().all();								//HTTP/1.1 204 No Content
		
	}
}
