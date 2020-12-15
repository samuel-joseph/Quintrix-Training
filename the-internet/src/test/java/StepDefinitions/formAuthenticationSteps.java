package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.formAuthenticationPage;

public class formAuthenticationSteps {
	
	
	
	String url = "/login";
	formAuthenticationPage formAuth = new formAuthenticationPage();
	String expected = "Logout";
	

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step - browser is open");
		formAuth.navigate(url);
	}
	
	

	@When("User enters {string}  and {string}")
	public void user_enters_username_password(String string, String string2) {
		formAuth.typeInput("username", string);
		formAuth.typeInput("password", string2);
	}



	@And("User clicks login")
	public void user_clicks_login() {
		System.out.println("Inside step - clicks login");
		formAuth.submit("//*[@id=\"login\"]/button/i");
	}

	@Then("User verifies if he is logged in")
	public void user_verifies_if_he_is_logged_in() {
		String actual = formAuth.getText("//*[@id=\"content\"]/div/a/i");
		Assert.assertEquals(expected, actual);
	}
	
}
