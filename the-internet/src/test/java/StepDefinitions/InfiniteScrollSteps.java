package StepDefinitions;

import io.cucumber.java.en.*;

public class InfiniteScrollSteps {
	
	@Given("User is in scroll page")
	public void user_is_in_scroll_page() {
		System.out.println("Steps in - scroll page");
	}

	@When("User scrolls the page {int} times")
	public void user_scrolls_the_page_times(Integer int1) {
		System.out.println("Steps in - scrolling");
		System.out.println(int1);
	}

	@Then("I verify if Infinite Scroll exist in page")
	public void i_verify_if_Infinite_Scroll_exist_in_page() {
		System.out.println("Steps in - verify");
	}
}
