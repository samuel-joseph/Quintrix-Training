package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TheInternet {
	private WebDriver driver;
	String url = "http://the-internet.herokuapp.com/";

	@Test
	public void canLaunchChromeDriver() {
		// Arrange

		// Act
		driver.navigate().to(this.url);
		String currentURL = driver.getCurrentUrl();

		// Assert
		Assert.assertEquals(currentURL, url);
	}

	@Test
	public void canNavigateToIndexPage() {
		// Arrange
		String expectedPageTitle = "The Internet";

		// Act
		String actualPageTitle = new IndexPage(driver, this.url).navigate().getTitle();

		// Assert
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}

	@Test
	public void tc4CanSelectDropdownListItem() {
		// Arrange
		String expectedSelection = "Option 2";

		// Act
		String selectedOption = new DropdownPage(driver, this.url).navigate().select(expectedSelection).getOption();

		// Assert
		Assert.assertEquals(selectedOption, expectedSelection);
	}

	@Test
	public void t5AddRemoveElement() {
		// Arrange
		String expectedSelection = "Delete";

		// Act
		String selectedOption = new AddRemoveElement(driver, this.url).navigate().select().getOption(expectedSelection);
		// Assert
		Assert.assertEquals(selectedOption, expectedSelection);
	}

	@Test
	public void t6BasicAuth() {
		// Arrange
		String expectedSelection = "Congratulations! You must have the proper credentials.";

		// Act
		String selectedOption = new BasicAuth(driver, this.url).navigate().select().getOption();

		// Assert
		Assert.assertEquals(selectedOption, expectedSelection);
	}

	@Test
	public void t7ChallengingDom() {
		// Arrange
		String expectedSelection = "Challenging DOM";

		// Act
		String selectedOption = new ChallengingDom(driver, this.url).navigate().select().getOption();

		// Assert
		Assert.assertEquals(selectedOption, expectedSelection);

	}
	
	@Test
	public void t9ContextMenu() {
		//Arrange
		String expectedSelection = "Context Menu";
		
		//Act
		String selectedOption = new ContextMenu(driver, this.url)
				.navigate()
				.select()
				.getOption();
		
		//Assert
		Assert.assertEquals(selectedOption, expectedSelection);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/joe/git/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}