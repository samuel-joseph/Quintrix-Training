package StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.InfinityScrollPage;

public class InfiniteScrollSteps {
	
	String url = "/infinite_scroll";
	InfinityScrollPage page = new InfinityScrollPage();
	String expected = "Infinite Scroll";
	
	
	@Given("User is in scroll page")
	public void user_is_in_scroll_page() {
		System.out.println("Steps in - navigate");
		page.navigate(url);
	}

	@When("User scrolls the page {int} times")
	public void user_scrolls_the_page_times(Integer scroll) {
		System.out.println("Steps in - scrolling");
		page.scroll(scroll);
	}

	@Then("I verify if Infinite Scroll exist in page")
	public void i_verify_if_Infinite_Scroll_exist_in_page() {
		System.out.println("Steps in - verify");
		String actual = page.getString("//*[@id=\"content\"]/div/h3");
		Assert.assertEquals(expected, actual);
	}
}
