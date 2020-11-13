package restassured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Homework_2_POST {

	@Test
	public void test_1_post() {

		Map<String, Object> map = new HashMap<String, Object>();

		String login = "{\"email\": \"eve.holt@reqres.in\", \"password\":\"cityslicka\"}";
		String token = "{\"token\": \"QpwL5tke4Pnpja7X4\"}";

		JSONObject request = new JSONObject();

		given().header("Content-type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(login).when().post("https://reqres.in/api/login").then().statusCode(200).assertThat().log().all();
	}
}
