package restassured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Homework_4_PATCH {
	
	@Test
	public void test_1_put() {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("name", "Morpheus2");

		System.out.println(map);

		JSONObject request = new JSONObject(map);

		System.out.println(request.toJSONString());

		given().header("Content-type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log()
				.all();
	}
	
}
