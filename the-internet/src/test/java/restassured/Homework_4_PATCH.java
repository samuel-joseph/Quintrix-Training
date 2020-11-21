package restassured;

import static io.restassured.RestAssured.given;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

public class Homework_4_PATCH {
	
	@Test
	public void test_1_put() {

//		Map<String, Object> map = new HashMap<String, Object>();
//
//		map.put("name", "Morpheus2");
//
//		System.out.println(map);
//
//		JSONObject request = new JSONObject(map);
//
//		System.out.println(request.toJSONString());
//
//		given().header("Content-type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
//				.body(request.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log()
//				.all();
		
		String url = "https://reqres.in/api/users/2";
		
		JsonObject jsonRequest = new JsonObject();
		jsonRequest.addProperty("name", "Morpheus2");
		
		String expectedTimeStamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(new Date());
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(jsonRequest.toString()).
		when()
			.patch(url).
		then()
			.statusCode(200)
			.log().all(); 
	}
	
}
