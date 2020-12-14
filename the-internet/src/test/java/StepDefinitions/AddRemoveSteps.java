package StepDefinitions;



import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.addRemovePage;



//				Hey Dennis so for this project I really want to try to extend my BasePage from this class
//				But for some reason it is giving me a weird error, so instead what I did was I made the pageClass
//				an object and then from there I extended it to the BaseClass.. Not the original plan that I had 
//				but still works. Thanks!


public class AddRemoveSteps {
	
	Integer actual;
	
	String url = "/add_remove_elements/";
	addRemovePage add = new addRemovePage();

	@Given("user is on add remove element page")
	public void user_is_on_add_remove_element_page() {
		add.navigate(url);
		System.out.println("Inside step - browser is open");

	}

	@When("user clicks Add {int} Element button")
	public void user_clicks_Add_Element_button(Integer int1) {
		add.addButton(int1);
	}

	@When("user clicks Delete {int} button")
	public void user_clicks_Delete_button(Integer delete) {
		actual = add.deleteButton(delete);
	}

	@Then("user validates if number of {int} is correct")
	public void user_validates_if_number_of_is_correct(Integer total) {
		Assert.assertEquals(actual, total);
		add.close();
	}

}
