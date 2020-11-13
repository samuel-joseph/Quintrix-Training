package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;
public class Homework_1_GET {

//1. (GET single user) Write a test that verifies the email address for employee id 2 is 'janet.weaver@reqres.in'
	@Test
	void test_01() {

		Response response = get("https://reqres.in/api/users/2");


		int statusCode = response.getStatusCode();

		// Assert
		Assert.assertEquals(statusCode, 200);

	}


	@Test
	void test_02() {
		given().
			get("https://reqres.in/api/users?page=2").
		then()
			.statusCode(200)
			.body("data.id[1]", equalTo(8))
			.body("data.first_name", hasItems("Michael", "Lindsay"));
	}
	
}
