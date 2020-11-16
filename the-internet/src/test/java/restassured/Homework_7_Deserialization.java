package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Homework_7_Deserialization {

	@Test
	public void DeserTest() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";

		ListUsersPOJO pojo = RestAssured.given().when().get().as(ListUsersPOJO.class);
		System.out.println(pojo.toString());
	}
}
