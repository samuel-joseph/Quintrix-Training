package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static  org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;


public class Homework_6_DESERIALIZE {
	
	@Test
	
	public void deserialized() {
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		
		PojoObject pojo = RestAssured.given().when().get().as(PojoObject.class);
		
		System.out.println(pojo);
//		
		
		
	}
}
