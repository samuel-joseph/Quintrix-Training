package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;

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

//	@Test
//	public void tc1canNavigateToIndexPage() {
//		// Arrange
//		String expectedPageTitle = "The Internet";
//
//		// Act
//		String actualPageTitle = new IndexPage(driver, this.url).navigate().getTitle();
//
//		// Assert
//		Assert.assertEquals(actualPageTitle, expectedPageTitle);
//	}
//
//	@Test
//	public void tc2AddRemoveElement() {
//		// Arrange
//		String expectedSelection = "Delete";
//
//		// Act
//		String selectedOption = new AddRemoveElement(driver, this.url).navigate().select().getOption(expectedSelection);
//		// Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//
//	@Test
//	public void tc3BasicAuth() {
//		// Arrange
//		String expectedSelection = "Congratulations! You must have the proper credentials.";
//
//		// Act
//		String selectedOption = new BasicAuth(driver, this.url).navigate().select().getOption();
//
//		// Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//
//	@Test
//	public void tc4ChallengingDom() {
//		// Arrange
//		String expectedSelection = "Challenging DOM";
//
//		// Act
//		String selectedOption = new ChallengingDom(driver, this.url).navigate().select().getOption();
//
//		// Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//
//	}
//	
//	@Test
//	public void tc6ContextMenu() {
//		//Arrange
//		String expectedSelection = "Context Menu";
//		
//		//Act
//		String selectedOption = new ContextMenu(driver, this.url)
//				.navigate()
//				.select()
//				.getOption();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc7DisappearingElements() {
//		//Arrange
//		String expectedSelection = "Disappearing Elements";
//		
//		//Act
//		String selectedOption = new DisappearingElements(driver, this.url)
//				.navigate()
//				.select()
//				.getOption();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	
//	@Test
//	public void tc9DragAndDrop() {
//		//Arrange
//		String expectedSelection = "Drag and Drop";
//		
//		//Act
//		String selectedOption = new DragAndDrop(driver, this.url)
//				.navigate()
//				.select()
//				.getOption();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc10CanSelectDropdownListItem() {
//		// Arrange
//		String expectedSelection = "Option 2";
//
//		// Act
//		String selectedOption = new DropdownPage(driver, this.url)
//				.navigate()
//				.select(expectedSelection)
//				.getOption();
//
//		// Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc11DynamicControls() {
//		//Arrange
//		String expectedSelection = "It's gone!";
//		
//		//Act
//		String selectedOption = new DynamicControls(driver, this.url)
//				.navigate()
//				.select()
//				.getOption();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc12DynamicLoading() {
//		//Arrange
//		String expectedSelection = "Hello World!";
//		
//		//Act
//		String selectedOption = new DynamicLoading(driver, this.url)
//				.navigate()
//				.select()
//				.getOption();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//
//	
//	@Test
//	public void tc13EntryAd() {
//		//Arrange
//		String expectedSelection = "Entry Ad";
//		
//		//Act
//		String selectedOption = new EntryAd(driver, this.url)
//				.navigate()
//				.select()
//				.getOption();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	
//	@Test
//	public void tc14ExitIntent() throws InterruptedException, AWTException {
//		//Arrange
//		String expectedSelection = "This is a modal window";
//		
//		//Act
//		String selectedOption = new ExitAd(driver, this.url)
//				.navigate()
//				.select()
//				.getOption();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc15FileDownload() {
//		//Arrange
//		String expectedSelection = "File Downloader";
//		
//		//Act
//		String selectedOption = new FileDownload(driver,this.url)
//					.navigate()
//					.mapClick();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc16FileUploader() {
//		//Arrange
//		String expectedSelection = "File Uploader";
//		
//		//Act
//		String selectedOption = new FileUploaderPage(driver, this.url)
//				.navigate()
//				.chooseFile()
//				.dragFile()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc17ForgotPassword() {
//		//Arrange
//		String expectedSelection = "Forgot Password";
//		
//		//Act
//		String selectedOption = new ForgotPassword(driver,this.url)
//				.navigate()
//				.retrievePassword()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc18FormAuthentication() {
//		//Arrange
//		String expectedSelection = "Login Page";
//		
//		//Act
//		String selectedOption = new LoginPage(driver, this.url)
//				.navigate()
//				.inputSubmitCredentials()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc19Frames() {
//		//Arrange
//		String expectedSelection = "Frames";
//		
//		//Act
//		String selectedOption = new Frames(driver, this.url)
//				.navigate()
//				.switchToFrames()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
//	
//	@Test
//	public void tc20HorizontalSlider() {
//		//Arrange
//		String expectedSelection = "Horizontal Slider";
//		
//		//Act
//		String selectedOption = new HorizontalSlider(driver, this.url)
//				.navigate()
//				.clickMovePointer()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
	
//	@Test
//	public void tc21Hovers() {
//		//Arrange
//		String expectedSelection = "Hovers";
//		
//		//Act
//		String selectedOption = new Hovers(driver, this.url)
//				.navigate()
//				.hoverClick()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
	
//	@Test
//	public void tc22InfiniteScroll() {
//		//Arrange
//		String expectedSelection = "Infinite Scroll";
//		
//		//Act
//		String selectedOption = new InfiniteScroll(driver, this.url)
//				.navigate()
//				.scroll()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
	
//	@Test
//	public void tc23Input() {
//		//Arrange
//		String expectedSelection = "Inputs";
//		
//		//Act
//		String selectedOption = new Input(driver, this.url)
//				.navigate()
//				.inputNumber()
//				.getString();
//		
//		//Assert
//		Assert.assertEquals(selectedOption, expectedSelection);
//	}
	
	@Test
	public void tc24JQueryUiMenu(){
		//Arrange
		String expectedSelection = "JQuery UI";
		
		//Act 
		String selectedOption = new JQueryUiMenu(driver, this.url)
				.navigate()
				.hoverClick()
				.getString();
		
		//Assert
		Assert.assertEquals(selectedOption, expectedSelection);
	}
	

	@BeforeTest
	public void beforeTest() {
//		String[] browser = {"Chrome","FireFox"};
//		SetDriver param =new SetDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/joe/git/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}